/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.amazon;

import javax.swing.JOptionPane;


public class ProductsList {

    private NodeProducts pFirst;
    private NodeProducts pLast;
    private int size;
    
    //Empty list constructor
    public ProductsList(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    //Finding out if it´s empty
    public boolean isEmpty(){
    return (this.getpFirst()==null);
}
    
    //Add product
    public void addProduct(NodeProducts product){
        if (!this.isEmpty()){
            this.getpLast().setpNext(product);
            this.setpLast(product);
        }else{
            this.setpFirst(product);
            this.setpLast(product);            
    }
        setSize(getSize()+1);
    }
    
    //Search for products
    public NodeProducts searchProduct(String id,String name){
        NodeProducts aux = new NodeProducts();
        aux = getpFirst();
        if (!this.isEmpty()){
            for (int i = 0; i < this.getSize(); i++) {
                if ((aux.getName().equals(name)) && (aux.getId().equals(id))){
                    return aux;
                }
                aux=aux.getpNext();
            }
        }else{
            return null;
        }
        return null;
    }
    
    //Remove an amount of a product
    public void removeProductFromWharehous(String id, String name, int amount){
        NodeProducts aux = this.searchProduct(id, name);
        if (aux!=null){
            if (aux.getAmount()-amount >= 0){
                aux.setAmount(aux.getAmount()-amount);
            }else{
                JOptionPane.showMessageDialog(null,"There is no enough amount of the product " + name + " int the wharehouse " + id +".");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "There is no " + name + " in the wharehouse " + id + ".");
        }
    }
    

    /**
     * @return the pFirst
     */
    public NodeProducts getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodeProducts pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodeProducts getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodeProducts pLast) {
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
