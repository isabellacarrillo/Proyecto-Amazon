package interfaces;

import grafos.Grafos;
public class Code {

    private static final Main pageP = new Main();
    private static final AddRutes newrute = new AddRutes();
    private static final NewAlmacen newStorage = new NewAlmacen();
    private static final InventaryP Inventarypage = new InventaryP();
    private static final PedidoNuevo nuevoPedido = new PedidoNuevo();
    private static final cargarArchivo cargartxt = new cargarArchivo();
    private static final gestionStock gestionS = new gestionStock();
    private static Grafos graph = new Grafos();
    private static String direction;

    /**
     *
     * Abrir la interfaz
     */
    public static void openMain() {
        getMainPage().setVisible(true);
    }
    /*
     * Abre NewAlmacen
     */
    public static void openNewAlmacen() {
        getNewStoragePage().setVisible(true);
        getMainPage().setVisible(false);
        getNewStoragePage().createGprah(graph);
    }

    /**
     *
     * Abre Inventary
     */
    public static void openShowInvPage() {
        getShowInvPage().setVisible(true);

        InterfaceFunctions.initShowInvPage();

        getMainPage().setVisible(false);
    }
    
    /**
     *
     * opens show AddNewRutes
     */
    public static void openAddNewRutes() {
        getAddNewRutesPage().setVisible(true);
        
        getMainPage().setVisible(false);
        getAddNewRutesPage().createGprah(getGraph());
    }

    /**
     *
     * Hides every sub-page, and opens Main
     */
    public static void getBackToMainPage() {
        getMainPage().setVisible(true);

        // in here we will be adding every page to setVisible(false)
        // so we can recycle this method for every page
        getNewStoragePage().setVisible(false);
        getShowInvPage().setVisible(false);
        getNewOrderPage().setVisible(false);
        getUploadDataPage().setVisible(false);
        getAddNewRutesPage().setVisible(false);
        getStockManagementPage().setVisible(false);

    }

    /**
     *
     * opens PedidoNuevo
     */
    public static void openNewOrderPage() {
        getMainPage().setVisible(false);
        
        InterfaceFunctions.initNewOrderPage();
        getNewOrderPage().setVisible(true);
    }

    
      /**
     *
     * opens cargarArchivo
     */
    public static void openUploadDataPage() {
        getMainPage().setVisible(false);
        getUploadDataPage().setVisible(true);
    }

    /**
     * Shows the graphic for the main graph
     */
////    public static void showGraphMap() {
////        InterfaceFunctions.createGraphMap();
////    }

    /**
     *
     * Getter for Main
     *
     * @return Main
     */
    public static Main getMainPage() {
        return pageP;
    }

    /**
     *
     * Getter for NewAlmacen
     *
     * @return NewAlmacen
     */
    public static NewAlmacen getNewStoragePage() {
        return newStorage;
    }
    
    /**
     *
     * opens StockManagementPage
     */
    public static void openStockManagementPage() {
        getStockManagementPage().setVisible(true);
        gestionS.setGraph(getGraph());
        getMainPage().setVisible(false);
    }

    /**
     *
     * Getter for InventaryP
     *
     * @return InventaryP
     */
    public static InventaryP getShowInvPage() {
        return Inventarypage;
    }

    /**
     *
     * Getter for Graph
     *
     * @return Graph
     */
    public static Grafos getGraph() {
        return graph;
    }

    /**
     *
     * Setter for Graph
     *
     * @param graph
     */
    public static void setGraph(Grafos graph) {
        Code.graph = graph;
    }

    /**
     *
     * Getter for PedidoNuevo
     *
     * @return PedidoNuevo
     */
    public static PedidoNuevo getNewOrderPage() {
        return nuevoPedido;
    }
    
    /**
     * Getter for direction
     * @return 
     */

    public static String getDirection() {
        return direction;
    }
    
    /**
     * setter for Direction
     * @param direction 
     */

    public static void setDirection(String direction) {
        Code.direction = direction;
    }
    /**
     *
     * Getter for cargarArchivo
     *
     * @return cargarArchivo
     */
    public static cargarArchivo getUploadDataPage() {
        return cargartxt;
    }
    
    /**
     * Getter for AddRutes
     * @return 
     */

    public static AddRutes getAddNewRutesPage() {
        return newrute;
    }
    
    /**
     * Getter for gestionStock
     * @return 
     */

    public static gestionStock getStockManagementPage() {
        return gestionS;
    }

}