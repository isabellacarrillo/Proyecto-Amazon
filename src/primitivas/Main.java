package primitivas;

import grafos.Grafos;
import grafos.DjikstraAlgorithm;
import grafos.MatrizAdy;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafos grafo = new Grafos();
        String texto = "";
        Functions f = new Functions();
        grafo = f.read_txt();
        Node<Warehouse> aux = grafo.getWarehouses().getpFirst();
        for (int i = 0; i < grafo.getWarehouses().getSize(); i++) {
            texto += aux.getData().printWarehouse();
            aux = aux.getpNext();
        }
        System.out.println(texto);
        f.write_txt(grafo);
        
    }
    
}
