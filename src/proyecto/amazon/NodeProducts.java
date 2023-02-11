/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.amazon;

/**
 *
 * @author Andres
 */
public class NodeProducts {
    
    private String id;
    private String name;
    private int amount;
    private NodeProducts pNext;
    
    
    //Empty CONSTRUCTOR
    public NodeProducts(){
        this.id = "";
        this.name = "";
        this.amount = 0;
        this.pNext = null;    
    }
    
    //Without pNext CONSTRUCTOR
    public NodeProducts(String id, String name, int amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.pNext = null;
    }
    
    //CONSTRUCTOR knowing everything.
    public NodeProducts(String id, String name, int amount, NodeProducts pNext){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.pNext = pNext;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the pNext
     */
    public NodeProducts getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodeProducts pNext) {
        this.pNext = pNext;
    }
    
           
    
}
