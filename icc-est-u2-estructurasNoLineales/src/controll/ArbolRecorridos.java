package controll;

import controlle.models.Node;
import java.util.Stack;

/**
 *
 * @author Pablo Siranaula
 */
public class ArbolRecorridos {
    
    public void preOrdenIterativo(Node root){
        // verificar si no esta vacio
        if(root == null){
            return;
        }
       //Pila para manejar los nodos del arbol durante el recorrido
        Stack<Node> stack= new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            Node node= stack.pop();
            System.out.print(node.getValue()+ ", ");
            
            if(node.getRight()!= null){
                stack.push(node.getRight());
            }
            if(node.getLeft() != null){
                stack.push(node.getLeft());
            }
        }
    }
    
    public void preOrdenRecursivo(Node node) {
    // Verificar si el nodo está vacío
    if (node != null) {
        // Imprimir el valor actual
        System.out.print(node.getValue() + ", ");
        // Recorrer el subárbol izquierdo
        preOrdenRecursivo(node.getLeft());
        // Recorrer el subárbol derecho
        preOrdenRecursivo(node.getRight());
    }
}

public void inOrdenRecursivo(Node node) {
    // Verificar si el nodo está vacío
    if (node != null) {
        // Recorrer el subárbol izquierdo
        inOrdenRecursivo(node.getLeft());
        // Imprimir el valor actual
        System.out.print(node.getValue() + ", ");
        // Recorrer el subárbol derecho
        inOrdenRecursivo(node.getRight());
    }
}

public void posOrdenRecursivo(Node node) {
    // Verificar si el nodo está vacío
    if (node != null) {
        // Recorrer el subárbol izquierdo
        posOrdenRecursivo(node.getLeft());
        // Recorrer el subárbol derecho
        posOrdenRecursivo(node.getRight());
        // Imprimir el valor actual
        System.out.print(node.getValue() + ", ");
    }
}

}
