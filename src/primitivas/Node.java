/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

/**
 *
 * @author carri
 * @param <T>
 */
public class Node <T>{ //Node class atributes
    
    private T data;
    private Node <T> pNext;
    
    
    //Constructor knowing nothing
    public Node(){
        this.data = null;
        this.pNext = null;
    }
    
    //Constructor knowing the element 
    public Node(T elem) {
        this.data = elem;
        this.pNext = null;
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
     * @return the pNext
     */
    public Node <T> getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Node <T> pNext) {
        this.pNext = pNext;
    }


    
}
    

    
   
   
    


 

