/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

/**
 *
 * @author carri
 */
public class List { //Class atributes 
    private Node pFirst;
    private Node pLast;
    private int size;
    
    

    public List() { //Constructor 
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public List(Node pFirst, Node pLast, int size) {
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
    
    //Append to list from the back
     public void addAtTheEnd(Object data){ 
        Node nuevo = new Node (data);
        if (this.isEmpty()){
            this.pFirst= nuevo;
            this.pLast= nuevo;
        }else{
            Node aux = this.pLast;
            aux.setpNext(nuevo);
            this.pLast = nuevo;
        }this.size+=1;
    }
    
    // Method that adds to a list at the start of it
     public void addAtTheStart (Object data){
        Node nuevo = new Node(data);
        nuevo.setData(data);
        
        if (isEmpty()){
            this.pFirst = nuevo;
        }else{
            nuevo.setpNext(this.pFirst);
            this.pFirst = nuevo;
        }this.size += 1;
    }
     
    
    
    
    
    
//    //Search for products
//    public Node searchProduct(String id,String name){
//        Node<Products> aux = new Node<>();
//        aux = this.getpFirst();
//        if (!this.isEmpty()){
//            for (int i = 0; i < this.getSize(); i++) {
//                if ((aux.getData().getName().equals(name)) && (aux.getData().getId().equals(id))){
//                    return aux;
//                }
//                aux=aux.getpNext();
//            }
//        }else{
//            return null;
//        }
//        return null;
//    }
    
//    public void updateProduct(String name,String id, int amount){
//        Node<Products> aux = this.searchProduct(id, name);
//        if (aux!=null){
//            aux.getData().removeProductFromWharehouse(amount);
//        }
//        
//    }

    
    

    // Getters y Setters
    /**
     * @return the pFirst
     */
    public Node getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Node pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Node getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Node pLast) {
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

