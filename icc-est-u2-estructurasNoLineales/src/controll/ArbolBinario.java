
package controll;

import controlle.models.Node;

/**
 *
 * @author Pablo Siranaula
 */
public class ArbolBinario {
    ArbolRecorridos arbolRecorrido = new ArbolRecorridos();
    private Node root;
    
    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node node, int value){
        if(node == null)
            return new Node(value);
        if(value < node.getValue()){
            node.setLeft(insert(node.getLeft(), value));
        } else if(value > node.getValue()){
            node.setRight(insert(node.getRight(), value));
        }
        return node;
    }
    public void printTree(){
        //arbolRecorrido.preOrdenIterativo(root);
        System.out.println("Recorrido preOrden");
        arbolRecorrido.preOrdenRecursivo(root);
        System.out.println("\nRecorrido posOrden");
        arbolRecorrido.posOrdenRecursivo(root);
        System.out.println("\nRecorrido inOrden");
        arbolRecorrido.inOrdenRecursivo(root);
        printTree(root ," ", true);
    }
    private void printTree(Node node, String prefix, boolean isLeft){
        if (node != null){
            System.out.println(prefix + (isLeft ? "├── " : "└──") + node.getValue());
            if (node.getLeft() != null || node.getRight() != null){
                if (node.getLeft() != null){
                    printTree(node.getLeft(), prefix + (isLeft ? "| " : "  "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "| " : " ") + "└── null");
                }
                if (node.getRight() != null){
                    printTree(node.getRight(), prefix + (isLeft ? "| " : "  "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "| " : " ") + "└── null");
                }
            }
        }
    }
    public Node getRoot() {
    return root; // Devuelve la raíz del árbol binario.
 }
}
