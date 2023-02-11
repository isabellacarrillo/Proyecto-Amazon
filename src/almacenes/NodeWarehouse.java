/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenes;

/**
 *
 * @author carri
 */
public class NodeWarehouse { //Node class atributes
    
    private String id;
    private NodeWarehouse pnext;
    

    public NodeWarehouse() {
    }
    
    
    public NodeWarehouse(String id) {
        this.id = id;
        this.pnext = null;
    }
    
   
    //Getters y setters 

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
     * @return the pnext
     */
    public NodeWarehouse getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(NodeWarehouse pnext) {
        this.pnext = pnext;
    }
    
}

