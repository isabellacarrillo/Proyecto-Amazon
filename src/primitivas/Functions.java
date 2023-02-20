/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

import java.io.PrintWriter;
import javax.swing.JOptionPane;
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
    
}



