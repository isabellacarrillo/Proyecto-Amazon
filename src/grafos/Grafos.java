/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;
import primitivas.List;
import primitivas.Node;
import primitivas.Warehouse;
import primitivas.Products;

/**
 *
 * @author carri
 */
public class Grafos {
    private MatrizAdy matrix;
    private List warehouses;
    private int count;

    //Constructor
    public Grafos(MatrizAdy matrix) {
        this.matrix = matrix;
        this.warehouses = null;
        this.count = 0;
    }
    
    //Empty Constructor
    public Grafos() {
    }

    //This method creates a new Warehouse 
    public void createWarehouse (String id, List list){
        Warehouse warehouse = new Warehouse (id,list);
        if (warehouses.isEmpty()){
            warehouses.addAtTheStart(warehouse);     
            
        }else{
            warehouses.addAtTheEnd(warehouse);
        }count ++;
        
    }
    
    //This method creates a new product
    public Products createProduct (String name, int amount){
        Products product = new Products(name,amount);
        return product;
    }
    
    
  
    
    
    
    
    //Getters y Setters
    
    /**
     * @return the matrix
     */
    public MatrizAdy getMatrix() {
        return matrix;
    }

    /**
     * @param matrix the matrix to set
     */
    public void setMatrix(MatrizAdy matrix) {
        this.matrix = matrix;
    }

    /**
     * @return the warehouses
     */
    public List getWarehouses() {
        return warehouses;
    }

    /**
     * @param warehouses the warehouses to set
     */
    public void setWarehouses(List warehouses) {
        this.warehouses = warehouses;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
    
    
    
    
    
    
}
