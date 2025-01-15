
package src;

import controll.ArbolAVL;
import controll.ArbolBinario;
import controlle.models.Node;
import ejercicio_03_listLevels.ListLevels;
import java.util.List;
import src.materia.ejercicio_01_insert.InsertBSTTest;
import src.materia.ejercicio_02_invert.InvertBinaryTree;
import src.materia.ejercicio_04_depth.Depth;

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
        //runArbolAVL();
        runEjercicios124();
    }
    public static void runEjercicios124(){
        runEjercicio1(); 
        runEjercicio2();
        runEjercicio4();  
    }
    
    public static void runEjercicio1() {
        // Ejercicio 1: Insertar elementos en un árbol binario
        InsertBSTTest arbolBinario = new InsertBSTTest();
        arbolBinario.insert(4);
        arbolBinario.insert(2);
        arbolBinario.insert(7);
        arbolBinario.insert(1);
        arbolBinario.insert(3);
        arbolBinario.insert(6);
        arbolBinario.insert(9);

        System.out.println("Árbol Binario Invertido (Ejercicio 1):");
        arbolBinario.printTree();
    }

    public static void runEjercicio2() {
        // Ejercicio 2: Invertir el árbol binario
        InvertBinaryTree arbolInvertido = new InvertBinaryTree();
        arbolInvertido.insert(4);
        arbolInvertido.insert(2);
        arbolInvertido.insert(7);
        arbolInvertido.insert(1);
        arbolInvertido.insert(3);
        arbolInvertido.insert(6);
        arbolInvertido.insert(9);

        // Invertimos el árbol
        arbolInvertido.invertirArbol();

        System.out.println("\nÁrbol Binario Invertido (Ejercicio 2):");
        arbolInvertido.printTree();
    }

    public static void runEjercicio4() {
        // Ejercicio 4: Calcular la profundidad máxima del árbol binario
        Depth arbolConProfundidad = new Depth();
        arbolConProfundidad.insert(4);
        arbolConProfundidad.insert(2);
        arbolConProfundidad.insert(7);
        arbolConProfundidad.insert(1);
        arbolConProfundidad.insert(3);
        arbolConProfundidad.insert(8);

        // Obtenemos la profundidad del árbol
        int profundidad = arbolConProfundidad.getDepth();

        System.out.println("\nProfundidad máxima del Árbol Binario (Ejercicio 4): " + profundidad);
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
