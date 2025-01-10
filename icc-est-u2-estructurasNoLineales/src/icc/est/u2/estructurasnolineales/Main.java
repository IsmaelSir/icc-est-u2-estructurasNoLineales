
package icc.est.u2.estructurasnolineales;

import icc.est.u2.estructurasnolineales.controllere.ArbolBinario;
import icc.est.u2.estructurasnolineales.main.ejercicio_03_listLevels.ListLevels;

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
        runEjercicio3();
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
    public static void runEjercicio3(){
        /*ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();
        int[] valores = {numeros};
        for()*/
    }
}
