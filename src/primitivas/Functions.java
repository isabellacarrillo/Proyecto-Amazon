/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

import java.io.PrintWriter;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import grafos.MatrizAdy;
import grafos.Grafos;

/**
 *
 * @author carri
 */
public class Functions {

    public void write_txt(Grafos grafo) {
        String texto = "";
        try {
            PrintWriter pw = new PrintWriter("test\\amazon_txt");
            texto += "Almacenes;\n";
            Node<Warehouse> auxW = grafo.getWarehouses().getpFirst();
            for (int i = 0; i < grafo.getWarehouses().getSize(); i++) {
                texto += "Almacen " + auxW.getData().getId() + ":\n";
                Node<Products> auxP = auxW.getData().getProducts().getpFirst();
                for (int j = 0; j < auxW.getData().getProducts().getSize(); j++) {
                    texto += auxP.getData().getName() + String.valueOf(auxP.getData().getAmount()) + "\n";
                }
                auxW = auxW.getpNext();
            }
            texto += "Rutas;\n";
            for (int i = 0; i < grafo.getMatrixAdy().getNumVertex(); i++) {
                for (int j = 0; j < grafo.getMatrixAdy().getMatrix()[i].length; j++) {
                    if (grafo.getMatrixAdy().getMatrix()[i][j] != 0) {
                        char almacenCOrigin = (char) (i + 65);
                        char almacenCDestination = (char) (j + 65);
                        int weight = grafo.getMatrixAdy().getMatrix()[i][j];
                        texto += String.valueOf(almacenCOrigin) + String.valueOf(almacenCDestination) + String.valueOf(weight) + "\n";
                    }
                }
            }
            pw.write(texto);

            JOptionPane.showMessageDialog(null, "Info succesfully loaded!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "There's been an error");
        }
    }

    public void addWarehouse() {

    }

    public Grafos read_txt() {

        List warehouseList = new List();
        List products = new List();
        String line = "";
        String txt = "";
        String path = "test\\amazon.txt";
        File file = new File(path);
        Grafos grafo = new Grafos();

        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        txt += line + "\n";
                    }
                }
                if (!"".equals(txt) && !txt.isEmpty()) {
                    String[] txt_split = txt.split(";");
                    for (int i = 1; i < txt_split.length; i++) {
                        if (txt_split[i].contains("Almacen")) {
                            String[] locationAndProducts = txt_split[i].split("\n");
                            List productsList = new List();
                            Warehouse almacen = new Warehouse();
                            for (int j = 1; j < locationAndProducts.length; j++) {
                                if (j == 1) {
                                    String warehouseFullName = locationAndProducts[j];
                                    char warehouseID = warehouseFullName.charAt(warehouseFullName.length() - 2);
                                    almacen.setId(String.valueOf(warehouseID));
                                } else {
                                    String[] productos = locationAndProducts[j].split(",");
                                    Products producto = new Products(productos[0], Integer.parseInt(productos[1]));
//                                    Node<Products> nodeP = new Node(producto);
                                    productsList.addAtTheEnd(producto);
                                }
                            }
                            almacen.setProducts(productsList);
//                            Node<Warehouse> nodoW = new Node<>();
                            warehouseList.addAtTheEnd(almacen);

                        } else if (!txt_split[i].contains("Rutas")) {
                            String[] routes = txt_split[i].split("\n");
                            int numVertex = warehouseList.getSize();
                            MatrizAdy matrix = new MatrizAdy(numVertex);

                            /*Aqui hay que hacer algo para que se cuarden las letras como numeros, por lo que 
                            pondre como valor referencia al 64, el cual es el valor de ASCI de la arroba, que esta
                            jsuto antes de la A de esta manera, cada letra se va a guardar por su posicion en la lista
                            ACTUALIZACION: Va a tener que ser el valor de 65 porque antes no estaba contando con que los
                            undices empiezan en cero.
                            
                             */
                            int valueRef = 65;

                            for (int j = 1; j < routes.length; j++) {

                                String[] routes_singled = routes[j].split(",");

                                int origin = (int) routes_singled[0].charAt(0) - valueRef;
                                int destiny = (int) routes_singled[1].charAt(0) - valueRef;
                                int weight = Integer.parseInt(routes_singled[2]);


                                matrix.addAnEdge(origin, destiny, weight);

                            }
                            grafo.setSize(warehouseList.getSize());
                            grafo.setMatrix(matrix);
                            grafo.setWarehouses(warehouseList);
                        }
                    }
                }

                br.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error leyendo el archivo: " + e);

        }
        return grafo;
    }

}
