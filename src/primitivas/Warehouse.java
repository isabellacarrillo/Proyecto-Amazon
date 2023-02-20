/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas;

/**
 *
 * @author Andres
 */


public class Warehouse {
    private String id;
    private List products;

    public Warehouse() {
    }
    
    
    
    public Warehouse(String id, List products) {
        this.id = id;
        this.products = products;
    }
    
    public Warehouse(String id) {
        this.id = id;
    }
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the products
     */
    public List getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List products) {
        this.products = products;
    }


    
}
