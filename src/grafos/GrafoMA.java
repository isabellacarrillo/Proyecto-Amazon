/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author carri
 */

public class GrafoMA {
    
    private boolean directed; //This indicates if it is directed or not
    private int maxNodos;   // Maximum size of table
    private int numVertex; //number of vertex of the graph
    private boolean matrixAdy [][];  // adjacent matrix of the graph

    public GrafoMA(boolean d) {
        this.directed = d;
        this.maxNodos = 0;
        this.numVertex = 0;
    }

    public GrafoMA(boolean d, int n) {
        this.directed = d;
        this.maxNodos = n;
        this.numVertex = 0;
        this.matrixAdy = new boolean[n][n];
    }
    
    // Método para insertar una arista
    public void InsertArista(int i, int j){
        getMatrixAdy() [i][j] = true;
        if (!isDirected()){
            getMatrixAdy()[j][i] = getMatrixAdy()[i][j];
        }
    }
    // Método para eliminar una arista
    public void DeleteArista (int i, int j){
        getMatrixAdy()[i][j] = false;
        if (!isDirected()){
            getMatrixAdy()[j][i] = false;    
        }
        
    }
    
    // Método para insertar un vértice
    public void InsertVertex (int n){
        if (n > maxNodos - numVertex){
            System.out.println("Error, number of nodes exceeded");
        }else{
            for (int i = 0; i < getNumVertex()+ n; i++) {
                for (int j = getNumVertex(); j < getNumVertex() + n; j++){
                    getMatrixAdy()[i][j] = getMatrixAdy()[j][i] = false;
                }  
            }
         
        }  
        this.numVertex = this.numVertex + n;
        
    }
    // Método que devuelve el grado de entrada del vértice i
    public int gradoIn(int j){
        int gIn = 0;
        for (int i = 0; i < getNumVertex(); i++) {
            if (getMatrixAdy() [i][j]){
                gIn++;
            }      
        }
        return gIn;
    }
    
    // Método que devuelve el grado de salida del vértice i 
    public int gradoOut(int i){
        int gOut = 0;
        for (int j = 0; j < getNumVertex(); j++) {
            if (getMatrixAdy()[i][j]){
                gOut++;
            }         
        }
       return gOut;
    }
    
    // Método que devuelve el tamaño (número de aristas) del grafo
    public int size (){
        int tm = 0;
        for (int i = 0; i < getNumVertex(); i++) {
            for (int j = 0; j < getNumVertex(); j++) {
                if (getMatrixAdy()[i][j]){
                    tm++;
                }  
            }
        }
        if (isDirected()){
            return tm;
        }else return tm/2;
    }
    
    // Método para comprobar si un grafo es dirigido 
    public boolean IsDirected(Grafo g){
        boolean dir = true;
        for (int i = 0; i < getNumVertex(); i++) {
            for (int j = 0; j < getNumVertex(); j++) {
                if (getMatrixAdy()[i][j] != getMatrixAdy()[j][i]){
                    dir = false;
                }      
            }   
        }
        return dir;
    }
   
    
    // Método que imprime una matriz de adyacencia de un grafo
    public void printTable(){
        
        System.out.println("The matrix contains" + getNumVertex()+ "of vertex: \n");
        for (int i = 0; i < getNumVertex(); i++) {
            for (int j = 0; j < getNumVertex(); j++) {
                if (getMatrixAdy()[i][j]){
                    System.out.println("1"); 
                }
                else{
                    System.out.println("0");
                    
                }
                
            }
            
        }
    }

    /**
     * @return the directed
     */
    public boolean isDirected() {
        return directed;
    }

    /**
     * @param directed the directed to set
     */
    public void setDirected(boolean directed) {
        this.directed = directed;
    }

    /**
     * @return the maxNodos
     */
    public int getMaxNodos() {
        return maxNodos;
    }

    /**
     * @param maxNodos the maxNodos to set
     */
    public void setMaxNodos(int maxNodos) {
        this.maxNodos = maxNodos;
    }

    /**
     * @return the numVertex
     */
    public int getNumVertex() {
        return numVertex;
    }

    /**
     * @param numVertex the numVertex to set
     */
    public void setNumVertex(int numVertex) {
        this.numVertex = numVertex;
    }

    /**
     * @return the matrixAdy
     */
    public boolean[][] getMatrixAdy() {
        return matrixAdy;
    }

    /**
     * @param matrixAdy the matrixAdy to set
     */
    public void setMatrixAdy(boolean[][] matrixAdy) {
        this.matrixAdy = matrixAdy;
    }
    
    
    
    
            
    
    
}
