/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

import java.io.IOException;
/**
 *
 * @author carri
 */
public interface Grafo {
    public void InsertVertex (int n);
    public void DeleteVertex (int v);
    public void InsertArista (int i, int j);
    public void DeleteArista (int i, int j);
    public boolean isEmpty(Grafo g);
    public int gradoIn (int i);
    public int gradoOut (int i);
    public int size();
    public boolean isDirected (Grafo g);
    
    
    
}
