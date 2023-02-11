/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenes;

/**
 *
 * @author carri
 */
public class ListWarehouse { //Class atributes 
    private NodeWarehouse pFirst;
    private NodeWarehouse pLast;
    private int size;
    
    

    public ListWarehouse() { //Constructor 
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public ListWarehouse(NodeWarehouse pFirst, NodeWarehouse pLast, int size) {
        this.pFirst = pFirst;
        this.pLast = pLast;
        this.size = 0;
    }
    
    //Method to empty my list
    public void empty(){
       this.pFirst = null; 
       this.pLast = null;
       this.size = 0;
        
    }
    
    //Method to check if my list is empty
    public boolean isEmpty(){
        return getpFirst() == null;
    }
    
    // Method to add warehouses 
    public void addAtTheEnd(String id){ 
        NodeWarehouse nuevo = new NodeWarehouse (id);
        if (isEmpty()){
           
            setpFirst(pLast= nuevo);
            
        }else{
            NodeWarehouse aux = getpLast();
            aux.setPnext(nuevo);
            setpLast (nuevo);
        }setSize(getSize()+1);
    }
    
    

    // Getters y Setters
    /**
     * @return the pFirst
     */
    public NodeWarehouse getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodeWarehouse pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodeWarehouse getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodeWarehouse pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}

