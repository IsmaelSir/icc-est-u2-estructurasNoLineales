
package icc.est.u2.estructurasnolineales;

import icc.est.u2.estructurasnolineales.controllere.ArbolAVL;
import icc.est.u2.estructurasnolineales.controllere.ArbolBinario;
import icc.est.u2.estructurasnolineales.controllere.models.Node;
import icc.est.u2.estructurasnolineales.main.ejercicio_03_listLevels.ListLevels;
import java.util.List;

/**
 *
 * @author Pablo Siranaula
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //runArbolBinario();
        //runARPreOrden();
        //runARPORecusivo();
        //runEjercicio3();
        runArbolAVL();
    }
    public static void runArbolBinario(){
        ArbolBinario arbolBinario = new ArbolBinario();
            int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        arbolBinario.printTree();      
    }
    public static void runARPreOrden(){
        System.out.println("PreOrden");
        ArbolBinario arbolBinario = new ArbolBinario();
            int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        arbolBinario.printTree();      
    }
    public static void runARPORecusivo(){
        System.out.println("PreOrden con recusividad");
        ArbolBinario arbolBinario = new ArbolBinario();
            int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        arbolBinario.printTree();      
    }
    public static void runEjercicio3() {
    ArbolBinario arbolBinario = new ArbolBinario();
    ListLevels levels = new ListLevels();
    int[] valores = {4, 2, 7, 1, 3, 6, 9}; // Valores para el árbol de ejemplo.

    // Construcción del árbol.
    for (int valor : valores) {
        arbolBinario.insert(valor);
    }

    // Imprime la estructura del árbol.
    System.out.println("\nÁrbol para el Ejercicio 3:");
    arbolBinario.printTree();

    // Obtiene los niveles del árbol.
    List<List<Node>> niveles = levels.listLevels(arbolBinario.getRoot());

    // Impresión en formato simple.
    System.out.println("\nFormato Simple:");
    for (List<Node> nivel : niveles) {
        for (int i = 0; i < nivel.size(); i++) {
            System.out.print(nivel.get(i).getValue());
            if (i < nivel.size() - 1) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    // Impresión en formato detallado.
    System.out.println("\nFormato Detallado:");
    for (int i = 0; i < niveles.size(); i++) {
        List<Node> nivel = niveles.get(i);
        System.out.print("Nivel " + (i + 1) + ": [ ");
        for (int j = 0; j < nivel.size(); j++) {
            System.out.print(nivel.get(j).getValue());
            if (j < nivel.size() - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ]");
    }
}

    public static void runArbolAVL(){
        int[] values = {10,20,15,24,9,8,21,23,50,25};
        ArbolAVL arbolAVL = new ArbolAVL();
        for (int value : values) {
            arbolAVL.insert(value);
        }
        arbolAVL.printTree();
    }
}
