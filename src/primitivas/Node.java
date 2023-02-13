/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

/**
 *
 * @author carri
 */
public class Node <T>{ //Node class atributes
    
    private T data;
    private Node <T> pnext;
    
    //Constructor 
    public Node(T elem) {
        this.data = elem;
        this.pnext = null;
    }
    
  
    // Getters y Setters

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the pnext
     */
    public Node <T> getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(Node <T> pnext) {
        this.pnext = pnext;
    }
}
    

    
   
   
    


 

