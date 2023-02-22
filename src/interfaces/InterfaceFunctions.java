package Interface;

import java.io.File;
import java.util.Arrays;
import javax.swing.JOptionPane;
import grafos.MatrizAdy;
//import main.Application;
import grafos.Grafos;
import primitivas.List;
import primitivas.Node;
import primitivas.Products;
import primitivas.Warehouse;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author isaac
 */
public class InterfaceFunctions {

    /**
     * initializes the data needed for InventaryP
     *
     */
    public static void initShowInvPage() {

        Grafos graph = Code.getGraph();

        List warehousedfs = graph.getWarehouseDFS();
        List warehousebfs = graph.getWarehouseBFS();

        Code.getShowInvPage().getTextFieldDFS().setText(buildStringTotalInv(warehousedfs));
        Code.getShowInvPage().getTextFieldBFS().setText(buildStringTotalInv(warehousebfs));

    }

    /**
     * initializes the data needed for PedidoNuevo
     */
    public static void initNewOrderPage() {
        Grafos graph = Code.getGraph();
        List warehousesO = graph.getWarehouseDFS();
        List warehouses = graph.getWarehouses();
        String[] warehousesName = graph.warehousestring();
        Code.getNewOrderPage().getInvTextField().setText(buildStringTotalInv(warehousesO));

        for (String item : warehousesName) {
            if (warehouses.searchWarehouse(item).getProducts()!= null) {
                Code.getNewOrderPage().getStorageComboBox().removeItem(item);
                Code.getNewOrderPage().getStorageComboBox().addItem(item);
            }

        }
    }

    /**
     * in PedidoNuevo, updates the storages products in productComboBox
     *
     * @param storageName
     */
    public static void setAvailableProducts(String Name ) {
        Code.getNewOrderPage().getProductComboBox().removeAllItems();

        Grafos graph = Code.getGraph();
        Warehouse selectedWarehouse = graph.getWarehouses().searchWarehouse(Name);
        String[] productsNames = selectedWarehouse.getProducts().productsArray();

        for (String item : productsNames) {
            Code.getNewOrderPage().getProductComboBox().addItem(item);
        }

    }

    /**
     * in PedidoNuevo, updates the order texfield when the users adds a product
 and its qty productComboBox
     *
     * @param currentOrder
     */
    public static void updateOrderDisplay(String currentOrder) {
        String qtyString = Code.getNewOrderPage().getProductQtyTextField().getText();
        if (isANumber(qtyString)) {
            String product = Code.getNewOrderPage().getProductComboBox().getSelectedItem().toString();
            currentOrder += product + ": " + qtyString + "\n";
            Code.getNewOrderPage().getOrderTextArea().setText(currentOrder);
        } else {
            JOptionPane.showMessageDialog(null, "Número de cantidad inválido, por favor intente de nuevo");
        }
    }

    /**
     * in PedidoNuevo, resets every component used to build the newOrder
     *
     */
    public static void resetOrder() {
        Code.getNewOrderPage().getStorageComboBox().setEnabled(true);
        setAvailableProducts(Code.getNewOrderPage().getStorageComboBox().getSelectedItem().toString());
        Code.getNewOrderPage().getOrderTextArea().setText("");
    }

    /**
     * in PedidoNuevo, Completes the order if the stock is available, if not,
 starts searching products in other storages to build the newOrder
     *
     * @param order
     * @param storageName
     */
    public static void completeOrder(String order, String storageName) {
        Grafos graph = Code.getGraph();
        List warehouses = graph.getWarehouses();
        Warehouse selectedStorage = warehouses.getWarehouse(storageName);
        String[] orderSplit = order.split("\n");

        boolean isStockAvailable = true;
        List missingStock = new List();

        for (String productString : orderSplit) {
            String[] productAux = productString.split(":");
            String productName = productAux[0];

            int productQty = Integer.parseInt(productAux[1].replace(" ", ""));
            int currentStock = selectedStorage.getProducts().searchProducts(productName).getAmount();

            if (currentStock < productQty) {
                isStockAvailable = false;
                Products missingProduct = new Products(productName,(productQty - currentStock));
                missingStock.addAtTheEnd(missingProduct);
            }

        }

        if (isStockAvailable) {
            for (String productString : orderSplit) {
                String[] productAux = productString.split(":");
                String productName = productAux[0];
                int productQty = Integer.parseInt(productAux[1].replace(" ", ""));
                int originalQty = selectedStorage.getProducts().searchProducts(productName).getAmount();
                selectedStorage.getProducts().searchProducts(productName).setAmount(originalQty - productQty);

            }

            JOptionPane.showMessageDialog(null, "Pedido agregado con éxito");
            initNewOrderPage();
            resetOrder();

        } else {
            askStockInOtherStorage(missingStock, storageName, orderSplit, selectedStorage);
        }
    }

    /**
     *
     * Reduces the inv for the original storage selected by user once stock has
     * been validated
     *
     * @param orderSplit
     * @param missingStock
     * @param selectedStorage
     */
    public static void changeOriginalStorageInv(String[] orderSplit, List missingStock, Warehouse selectedStorage) {
        for (String orderString : orderSplit) {
            String productName = orderString.split(":")[0];

            if (missingStock.searchProducts(productName) != null) {
                selectedStorage.getProducts().searchProducts(productName).setAmount(0);
            } else {
                int qtyToReduce = Integer.parseInt(orderString.split(":")[1].replace(" ", ""));
                Products productToReduce = selectedStorage.getProducts().searchProducts(productName);
                productToReduce.setAmount(productToReduce.getAmount() - qtyToReduce);
            }
        }
    }

    /**
     *
     * Finds the missing stock in other storages, evaluates the shortest route,
     * updates the inventory and notifies the user in storages
     *
     * @param missingStock
     * @param originalStorage
     * @param orderSplit
     * @param selectedStorage
     */
    public static void askStockInOtherStorage(List missingStock, String originalStorage, String[] orderSplit, Warehouse selectedStorage) {
        List storageWithStock = new List();
        List allWarehouses = Code.getGraph().getWarehouses();

        // get storages that can provide the stock
        for (int i = 0; i < allWarehouses.getSize(); i++) {

            if (!allWarehouses.getWarehouseNodebyIndex(i).getData().getId().equals(originalStorage)) {
                boolean isStockAvailable = true;
                List currentInv = allWarehouses.getWarehouseNodebyIndex(i).getData().getProducts();

                for (int j = 0; j < missingStock.getSize(); j++) {
                    Products currentMissingProduct = missingStock.ProductinIndex(j);
                    Products productInStorage = currentInv.searchProducts(currentMissingProduct.getName());
                    if (productInStorage == null) {
                        isStockAvailable = false;
                        break;
                    } else if (productInStorage.getAmount() < currentMissingProduct.getAmount()) {
                        isStockAvailable = false;
                        break;
                    }

                }

                if (isStockAvailable) {
                    storageWithStock.addAtTheEnd(allWarehouses.getWarehouseNodebyIndex(i).getData());
                }
            }

        }

        if (storageWithStock.getSize() <= 0) {
            JOptionPane.showMessageDialog(null, "Alerta no existe la cantidad de stock especificada en ninguno de los almacenes de la red");
            initNewOrderPage();
            resetOrder();
        } else {

            changeOriginalStorageInv(orderSplit, missingStock, selectedStorage);

            String shortestRoute = getShortestRoute(storageWithStock, originalStorage);
            String[] shortestRouteSplit = shortestRoute.split(";");
            Storage storageToGiveProducts = allWarehouses.searchWarehouse(shortestRouteSplit[1].split(",")[0]);
            String userReport = "El pedido tiene los siguientes productos faltantes de stock:\n";

            for (int i = 0; i < missingStock.getSize(); i++) {
                Products productToReduce = storageToGiveProducts.getProducts().searchProducts(missingStock.ProductinIndex(i).getName());
                productToReduce.setAmount(productToReduce.getAmount() - missingStock.ProductinIndex(i).getAmount());

                userReport += "- " + missingStock.ProductinIndex(i).getName() + ": " + missingStock.ProductinIndex(i).getAmount() + "\n";
            }
            //report to user
            userReport += "Así que se solicitaron los productos a: " + storageToGiveProducts.getName() + "\n";
            userReport += "Siguiendo la ruta más corta " + "(" + shortestRouteSplit[0] + "Km)" + ": ";
            userReport += shortestRouteSplit[1].replace(",", " --> ");

            JOptionPane.showMessageDialog(null, userReport);
            createShortestRouteGraph(shortestRouteSplit[1]);

            initNewOrderPage();
            resetOrder();

        }

    }

    /**
     *
     * Creates and show the shortest route corresponding graph
     *
     * @param route
     */
    public static void createShortestRouteGraph(String route) {
        MultiGraph multiGraph = new MultiGraph("GraphMap");
        Grafos originalGraph = Code.getGraph();
        MatrizAdy adjMatrix = originalGraph.getMatrixAdy();
        List storages = originalGraph.getWarehouses();
        String[] routeSplit = route.split(",");

        for (String storage : routeSplit) {
            System.out.println(storage);
            Node n = multiGraph.addNode(storage);
            n.setAttribute("ui.label", storage);
        }

        int forAux;
        if (routeSplit.length <= 2) {
            forAux = 1;
        } else {
            forAux = routeSplit.length - 1;
        }

        for (int i = 0; i < forAux; i++) {
            String emitter = routeSplit[i];
            String receiver = routeSplit[i + 1];
            int emitterIndex = storages.warehouseIndex(emitter);
            int receiverIndex = storages.warehouseIndex(receiver);
            String routeValue = String.valueOf(adjMatrix.getMatrix()[emitterIndex][receiverIndex]);
            //multiGraph.addEdge(edgeName, storage1, storage2, true);
            String edgeId = emitter + "-" + receiver;
            Edge ed = multiGraph.addEdge(edgeId, emitter, receiver, true);

            ed.setAttribute("ui.label", routeValue);

        }

        String graphCss = "node { text-offset: 0px, -10px; size: 20px; text-size: 12; fill-color: blue, aquamarine; fill-mode: gradient-horizontal; text-alignment: above; text-color: #222; text-background-mode: plain; text-background-color: white; } edge { size: 2px; fill-color: #444; text-alignment: above; text-size: 20; arrow-size: 12; text-color: blue; text-offset: 10px, -20px;}";
        multiGraph.setAttribute("ui.stylesheet", graphCss);

        System.setProperty("org.graphstream.ui", "swing");

        Viewer viewer = multiGraph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
    }

    /**
     *
     * Gets shortest route using Dijkstra
     *
     *
     * @param warehousesWithStock
     * @param originalWarehouse
     * @return string
     */
    public static String getShortestRoute(List warehousesWithStock, String originalWarehouse) {
        List shortestRoutes = new List();
        List allWarehouses = Code.getGraph().getWarehouses();
        int[][] adjMatrix = Code.getGraph().getMatrixAdy().getMatrix();
//        adjMatrix.printMatrix();

        for (int i = 0; i < warehousesWithStock.getSize(); i++) {
            String currentStorageWithStock = warehousesWithStock.getWarehouseNodebyIndex(i).getData().getId();

            List visitedNodes = new List();
//            ObjectList unVisitedNodes = new ObjectList();

            Object[][] routesMatrix = new Object[adjMatrix.length][3];

            //fill columns [0] storages names, [1] shortest distance, [2] previous node
            for (int j = 0; j < allWarehouses.getSize(); j++) {
                routesMatrix[j][0] = allWarehouses.getWarehouseNodebyIndex(j).getData().getId();
                routesMatrix[j][1] = Integer.MAX_VALUE;

//                unVisitedNodes.addEnd(allStorages.getStorageNodeByIndex(j).getStorage().getName());
                if (routesMatrix[j][0].equals(currentStorageWithStock)) {
                    routesMatrix[j][1] = 0;
                }
            }

            //Dijkstra
            while (visitedNodes.getSize() != allWarehouses.getSize()) {

                //identify the lowest distance unvisited node
                String lowestUnvisitedNode = "default";
                for (int j = 0; j < allWarehouses.getSize(); j++) {
                    String currentStorageName = allWarehouses.getWarehouseNodebyIndex(j).getData().getId();

                    if (!visitedNodes.searchList(currentStorageName)) {

                        if (lowestUnvisitedNode.equals("default")) {
                            lowestUnvisitedNode = currentStorageName;
                        } else {
                            int lowestUnvisitedRow = allWarehouses.warehouseIndex(lowestUnvisitedNode);
                            int currentRow = allWarehouses.warehouseIndex(currentStorageName);

                            int lowestRouteValue = (int) routesMatrix[lowestUnvisitedRow][1];
                            int currentRouteValue = (int) routesMatrix[currentRow][1];

                            if (currentRouteValue < lowestRouteValue) {
                                lowestUnvisitedNode = currentStorageName;
                            }
                        }

                    }

                }
                // examine unvisited neighbours

                int lowestIUnvisitedIndex = allWarehouses.warehouseIndex(lowestUnvisitedNode);

                for (int j = 0; j < adjMatrix[lowestIUnvisitedIndex].length; j++) {
                    int currentRoute = adjMatrix[lowestIUnvisitedIndex][j];
                    if (currentRoute != 0) {
                        String currentNeighbour = (String) routesMatrix[j][0];

                        if (!visitedNodes.searchList(currentNeighbour)) {
                            int newDistance = currentRoute + ((int) routesMatrix[lowestIUnvisitedIndex][1]);
                            int oldDistance = (int) routesMatrix[j][1];

                            if (newDistance < oldDistance) {
                                //update new lowest route and previous node
                                routesMatrix[j][1] = newDistance;
                                routesMatrix[j][2] = lowestUnvisitedNode;
                            }

                        }
                    }
                }

                visitedNodes.addAtTheEnd(lowestUnvisitedNode);

            }
            // end of Dijkstra        

            int currentIndex = allWarehouses.warehouseIndex(originalWarehouse);
            String finalRoute = String.valueOf((int) routesMatrix[currentIndex][1]) + ";" + originalWarehouse + ",";
            boolean isRouteIncomplete = true;

            while (isRouteIncomplete) {
                if (routesMatrix[currentIndex][2] == null) {
                    isRouteIncomplete = false;
                } else {
                    finalRoute += ((String) routesMatrix[currentIndex][2]) + ",";
                    currentIndex = allWarehouses.warehouseIndex(routesMatrix[currentIndex][2].toString());
                }
            }

            shortestRoutes.addAtTheEnd(finalRoute);

            //print Dijkstra matrix
//             System.out.println("Ruta sin invertir:" + finalRoute);
//            System.out.println("Almacen origen:" + currentStorageWithStock);
//            for (int k = 0; k < routesMatrix.length; k++) {
//                for (int j = 0; j < routesMatrix[0].length; j++) {
//                    System.out.print(routesMatrix[k][j] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("------\n");
        }

        String lowestRoute = shortestRoutes.getpFirst().getData().toString();
        for (int i = 0; i < shortestRoutes.getSize(); i++) {
            int currentValue = Integer.parseInt(((String) shortestRoutes.ElementIndex(i)).split(";")[0]);
            int lowestValue = Integer.parseInt(lowestRoute.split(";")[0]);

            if (currentValue < lowestValue) {
                lowestRoute = (String) shortestRoutes.ElementIndex(i);
            }
        }
//        System.out.println("original");
//        System.out.println(lowestRoute);

        String correctedLowestRoute = lowestRoute.split(";")[0] + ";" + invertRoute(lowestRoute.split(";")[1]);
//        System.out.println("inverted");
//        System.out.println(correctedLowestRoute);

        return correctedLowestRoute;
    }

    /**
     *
     * Inverts the storage sequence given
     *
     * @param original
     * @return String
     */
    public static String invertRoute(String original) {
        String inverted = "";
        String[] originalSplit = original.split(",");
        for (int i = originalSplit.length - 1; i >= 0; i--) {
            inverted += originalSplit[i] + ",";
        }

        return inverted.substring(0, inverted.length() - 1);
    }

    /**
     *
     * From a NodeStorage list, build the string containing all of the inventory
     * in storages
     *
     * @param nodeStorageList
     * @return String
     */
    public static String buildStringTotalInv(List nodeWarehouses) {
        String msg = "";
        Node pointer = nodeWarehouses.getpFirst();

        while (pointer != null) {
            Warehouse currentWarehouse = (Warehouse) pointer.getData();
            msg += currentWarehouse.getId() + ":\n";
            List currentInv = currentWarehouse.getProducts();

            if (currentInv != null) {
                for (int i = 0; i < currentInv.getSize(); i++) {
                    Products currentProduct = currentInv.ProductinIndex(i);
                    msg += currentProduct.getName() + ": " + currentProduct.getAmount() + "\n";
                }
            } else {
                msg += "Sin inventario\n";
            }

            msg += "\n";

            pointer = pointer.getpNext();
        }

        return msg;

    }

    /**
     *
     * @param a
     * @param b
     * @return boolean
     */
    public static boolean areTheSame(String a, String b) {
        return a.equalsIgnoreCase(b);
    }

    /**
     *
     * @param number
     * @return boolean
     */
    public static boolean isANumber(String number) {
        try {
            int num = Integer.parseInt(number);
            return true;

        } catch (NumberFormatException e) {

        }
        return false;
    }

    /**
     *
     * @param array
     * @return boolean
     */
    public static boolean isAWarehouse(String[] array) {
        return array[0].equals("Almacen");

    }

    /**
     *
     * @param name
     * @return boolean
     */
    public static boolean alreadyExistWarehouse(String name) {
        for (int i = 0; i < Code.getGraph().getSize(); i++) {
            if (Code.getGraph().getWarehouses().getWarehouseNodebyIndex(i).getData().getId().equalsIgnoreCase(name)) {
                return true;
            }

        }
        return false;

    }

    /**
     * Validate and create the new storage
     *
     * @param transmitter
     * @param receiver
     * @param receiverCost
     * @param transmitterCost
     * @param nameArray
     * @param name
     */
    public static void createWarehouseButton(String transmitter, String receiver, String receiverCost, String transmitterCost, String[] nameArray, String name) {
        if (InterfaceFunctions.areTheSame(transmitter, receiver)) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar el mismo almacén receptor y emisor en las rutas");
        } else {
            if (!InterfaceFunctions.isANumber(transmitterCost) || !InterfaceFunctions.isANumber(receiverCost)) {
                JOptionPane.showMessageDialog(null, "Debe ingresar las distancias con números");
            } else {
                if (!InterfaceFunctions.isAWarehouse(nameArray)) {
                    JOptionPane.showMessageDialog(null, "El nombre del almacén debe de empezar con 'Almacén'");

                } else {
                    if (InterfaceFunctions.alreadyExistWarehouse(name)) {
                        JOptionPane.showMessageDialog(null, "Ya existe el almacén");
                    } else {
                        Code.getGraph().insertEmptyWarehouse(name);
                        Products element = new Products( "Placa",0);
                        List inventory = new List();
                        inventory.addAtTheStart(element);

                        Code.getGraph().getWarehouses().getWarehouseNodebyIndex(Code.getGraph().getWarehouses().getSize() - 1).getData().setProducts(inventory);
                        //GlobalUI.getGraph().getAdjMatrix().printMatrix();
                        JOptionPane.showMessageDialog(null, "Almacén creado con éxito");
                        createNewMatrixWithAnother(Code.getGraph().getMatrixAdy(), Code.getGraph().getSize());
                        Code.getGraph().getMatrixAdy().addAnEdge(Code.getGraph().WarehouseName(transmitter), Code.getGraph().getSize() - 1, Integer.parseInt(transmitterCost));
                        Code.getGraph().getMatrixAdy().addAnEdge(Code.getGraph().getSize() - 1, Code.getGraph().WarehouseName(receiver), Integer.parseInt(receiverCost));
                        //GlobalUI.getGraph().getAdjMatrix().printMatrix();
                        JOptionPane.showMessageDialog(null, "Almacén creado con éxito");
                    }
                }
            }
        }

    }

    /**
     * Create a new matrix and copy the previous data from another one
     *
     * @param am
     * @param v
     */
    public static void createNewMatrixWithAnother(MatrizAdy am, int v) {
        MatrizAdy newMatrix = new MatrizAdy(v);
        for (int j = 0; j < am.getNumVertex(); j++) {
            System.arraycopy(am.getMatrix()[j], 0, newMatrix.getMatrix()[j], 0, am.getNumVertex());

        }

        Code.getGraph().setMatrix(newMatrix);

    }

    /**
     * Create a library graph and shows it to the user
     */
    public static void createGraphMap() {
        MultiGraph multiGraph = new MultiGraph("GraphMap");
        Grafos originalGraph = Code.getGraph();
        MatrizAdy adjMatrix = originalGraph.getMatrixAdy();
        List warehouses = originalGraph.getWarehouses();

        //add all Nodes
        Node <Warehouse> pointer = warehouses.getpFirst();
        while (pointer != null) {
            Node n = multiGraph.addNode(pointer.getData().getId());
            String storageName = pointer.getData().getId();
            n.setAttribute("ui.label", storageName + "\n");

            pointer = pointer.getpNext();
        }

        for (int i = 0; i < adjMatrix.getMatrix().length; i++) {

            for (int j = 0; j < adjMatrix.getMatrix()[i].length; j++) {

                if (adjMatrix.getMatrix()[i][j] != 0) {
                    String storage1 = warehouses.getWarehouseNodebyIndex(i).getData().getId();
                    String storage2 = warehouses.getWarehouseNodebyIndex(j).getData().getId();
                    String edgeName = storage1 + " " + storage2;
                    multiGraph.addEdge(edgeName, storage1, storage2, true);
                    Edge ed = multiGraph.getEdge(edgeName);
                    ed.setAttribute("ui.label", adjMatrix.getMatrix()[i][j]);
                }

            }
        }

        String graphCss = "node { text-offset: 0px, -10px; size: 20px; text-size: 12; fill-color: blue, aquamarine; fill-mode: gradient-horizontal; text-alignment: above; text-color: #222; text-background-mode: plain; text-background-color: white; } edge { size: 2px; fill-color: #444; text-alignment: above; text-size: 20; arrow-size: 12; text-color: blue; text-offset: 10px, -20px;}";
        multiGraph.setAttribute("ui.stylesheet", graphCss);

        System.setProperty("org.graphstream.ui", "swing");

        Viewer viewer = multiGraph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
    }

    /**
     * Checks if file is txt, if so ask the user confirmation and change the
     * current graph info
     *
     * @param file
     */
    public static void uploadTxt(File file) {
        if (file.getAbsolutePath().endsWith(".txt")) {

            int option = JOptionPane.showConfirmDialog(null, "Esta seguro que desea usar el archivo: " + file.getName(), "Confimción", JOptionPane.YES_NO_OPTION);

            if (option == 0) {
                Application.initializeAppWithNewInfo(file.getAbsolutePath());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Alerta, solo se pueden ingresar archivos de texto (.txt)", "Alerta", 2);
        }
    }

    /**
     * Writes the txt with the current data
     *
     * @param message
     */
    public static void saveCurrentData(String message) {
        main.File f = new main.File();
        int resp = JOptionPane.showConfirmDialog(null, message, "Cofirmación", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {

            try {
                f.writeFile(Code.getGraph(), Code.getDirection());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error guardando la información");
            }

        }
    }

    /**
     * add new receiver Rutes to the Graph
     *
     * @param direction
     * @param from
     */
    public static void addNewRutesButton(String direction, String from) {

        String[] arrayAux = direction.split("  ");
        for (int i = 0; i < arrayAux.length; i++) {
            if (!arrayAux[i].equalsIgnoreCase("")) {
                String[] secondArray = arrayAux[i].split(",");
                int num = Integer.parseInt(secondArray[1]);
                String storage = secondArray[0];
                Code.getGraph().getMatrixAdy().addAnEdge(Code.getGraph().WarehouseName(from), Code.getGraph().WarehouseName(storage), num);
            }

        }

        //GlobalUI.getGraph().getAdjMatrix().printMatrix();
    }

    public static void addNewTransmitterRutesButton(String direction, String to) {

        String[] arrayAux = direction.split("  ");
        for (int i = 0; i < arrayAux.length; i++) {
            if (!arrayAux[i].equalsIgnoreCase("")) {
                String[] secondArray = arrayAux[i].split(",");
                int num = Integer.parseInt(secondArray[1]);
                String warehouse = secondArray[0];
                Code.getGraph().getMatrixAdy().addAnEdge(Code.getGraph().WarehouseName(warehouse), Code.getGraph().WarehouseName(to), num);
            }

        }

        Code.getGraph().getMatrixAdy().printMatrix();
    }

    /**
     * Create an array with String
     *
     * @param direction
     * @return
     */
    public static String[] fromTexttoArray(String direction) {

        String[] arrayAux = direction.split("  ");

        return arrayAux;
    }

    /**
     * Validates the storage name selection
     *
     * @param name
     * @return
     */
    public static boolean selectStorageName(String name) {

        if (InterfaceFunctions.alreadyExistWarehouse(name)) {
            JOptionPane.showMessageDialog(null, "Ya existe el almacén");
        } else {
            return true;
        }

        return false;
    }

    /**
     * create the new storage with the rutes
     *
     * @param name
     * @param directionTo
     * @param directionFrom
     */
    public static void createNewStorage(String name, String directionTo, String directionFrom) {
        Code.getGraph().insertEmptyWarehouse(name);
        Products element = new Products( "Placa",0);
        List inventory = new List();
        inventory.addAtTheStart(element);
        Code.getGraph().getWarehouses().getWarehouseNodebyIndex(Code.getGraph().getWarehouses().getSize() - 1).getData().setProducts(inventory);
        createNewMatrixWithAnother(Code.getGraph().getMatrixAdy(), Code.getGraph().getSize());
        addNewRutesButton(directionTo, name);
        addNewTransmitterRutesButton(directionFrom, name);

    }
}
