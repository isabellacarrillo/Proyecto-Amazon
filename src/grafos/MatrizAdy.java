/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author carri
 */
public class MatrizAdy {
    
    private int numVertex;
    private int matrix [][];

    //Constructor
    public MatrizAdy(int numVertex) {
        this.numVertex = numVertex;
        this.matrix = new int [numVertex][numVertex];
        
    }
    
    //Getters y Setters
    
    //This method serves to add a new edge in the graph
    public void addAnEdge (int from, int to, int cost){
        matrix[from][to] = cost;
    }
    
    //Method to print graphs
    
    public void printMatrix(){
        for (int i = 0; i < this.getNumVertex(); i++) {
            for (int j = 0; j < this.getNumVertex(); j++) {
                System.out.println(matrix[i][j] + " ");   
            }
            System.out.println("");
            
        }
    }
    
    //Method to get the Edges of the Graph
    
    public void getanEdge(){
       int origin = 0;
       int destination  = 1;
       int cost = 1;
       
        for (int i = 0; i < this.getNumVertex(); i++) {
            addAnEdge(origin,destination,cost);
            origin ++;
            if (origin == (getNumVertex()-1)){
                destination = 0;
            }else{
                destination ++;
            
            }
            cost += 2;
           
            
        }
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
     * @return the matrix
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * @param matrix the matrix to set
     */
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    
    
}
