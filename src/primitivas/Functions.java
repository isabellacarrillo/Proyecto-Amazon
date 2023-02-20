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
import grafos.Grafo;
import grafos.GrafoMA;

/**
 *
 * @author carri
 */
public class Functions {

    
    public void write_txt (){
        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\carri\\Documents\\NetBeansProjects\\Proyecto Amazon\\src\\primitivas\\amazon.txt");
            pw.write("");
            
            JOptionPane.showMessageDialog(null,"Info succesfully loaded!");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "There's been an error");
        }
    }
    
    public void addWarehouse (){
        
    }
  

    List warehouses = new List();
    List products = new List();
    GrafoMA adyMatrix = new GrafoMA(true);
    String line = "";
    String txt = "";
    String path = "test\\amazon.txt";
    File file = new File(path);

    public void read_txt() {
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
                            List warehouseList = new List();
                            List productsList = new List();
                            Warehouse almacen = new Warehouse();
                            for (int j = 0; j < locationAndProducts.length; j++) {
                                if (j == 0) {
                                    String warehouseFullName = locationAndProducts[j];
                                    char warehouseID = warehouseFullName.charAt(warehouseFullName.length() - 2);
                                    almacen.setId(String.valueOf(warehouseID));
                                } else {
                                    String[] productos = locationAndProducts[j].split(",");
                                    Products producto = new Products(productos[0], Integer.parseInt(productos[1]));
                                    Node<Products> nodeP = new Node(producto);
                                    productsList.addAtTheEnd(nodeP);
                                }
                            }
                            almacen.setProducts(productsList);
                            Node<Warehouse> nodoW = new Node<>();
                            warehouseList.addAtTheEnd(nodoW);

                        }else if(!txt_split[i].contains("Rutas")){
                            String[] rutas = txt_split[i].split(",");
                            
                            
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error leyendo el archivo: " + e);
        }
    }

}



