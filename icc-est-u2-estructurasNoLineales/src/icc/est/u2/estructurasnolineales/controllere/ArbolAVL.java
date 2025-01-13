package icc.est.u2.estructurasnolineales.controllere;

import icc.est.u2.estructurasnolineales.controllere.models.Node;

/**
 *
 * @author Pablo Siranaula
 */
public class ArbolAVL {
    private Node root;
    
    public void insert(int value) {
        System.out.println("* Nodo a insertar: " + value);
        root = insert(root, value);      
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1);
            return newNode;
        }
        
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        } else {
            return node; // Valor duplicado, no se agrega
        }
        System.out.println("Nodo insertado: "+ value+ ", Balance: "+getBalance(node));
        node.setHeight(1+Math.max(height(node.getLeft()), height(node.getRight())));
        
        ///Obtener el Balance o factor de equilibrio del nodo ancestro
        int balance = getBalance(node);
        
        // caso izqui izqui
        if(balance >1 && value< node.getLeft().getValue()){
            return rightRotate(node);
        }
        // caso dere dere
        if(balance < -1 && value> node.getRight().getValue()){
            return leftRotate(node);
        }
        // caso Izqui Dere
        if(balance > 1 && value> node.getLeft().getValue()){
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }
        // caso Dere Izqui
        if(balance < -1 && value < node.getRight().getValue()){
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }
        //devolvemos el nodo sin cambios
        return node;
    }
    
    private Node leftRotate(Node x){
        Node y = x.getRight();
        Node tem = y.getLeft();
        //
        System.out.println("Left rotate on node: "+ x.getValue()+ ", Balance: "+ getBalance(x));
        
        //realisamos la rotacion 
        y.setLeft(x);
        x.setRight(tem);
        
        //Actualizamos la altura
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())));
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())));
        
        System.out.println("Nueva raiz despues de la rotacion izq: "+x.getValue());
        //devolvemos nueva raiz
        return y;
    }
    
    private Node rightRotate(Node y){
        Node x = y.getLeft();
        Node tem = x.getRight();
        System.out.println("Right rotate on node: "+ y.getValue()+ ",Balance: "+ getBalance(y));
        
        //realisamos la rotacion 
        x.setRight(y);
        y.setLeft(tem);
        
        //Actualizamos la altura
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())));
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())));
        
        System.out.println("Nueva raiz despues de la rotacion: "+x.getValue());
        return x;
    }
    
    private int getBalance(Node nodo){
        if(nodo == null){
            return 0;
        }
        return height(nodo.getLeft())- height(nodo.getRight());
    }
    
    private int height(Node node){
        if(node== null){
            return 0;
        }
        return 1;
    }
    
    public void printTree() {
        System.out.println("Estructura del arbol:");
        printTree(root, "", true);
    }

    private void printTree(Node node, String prefix, boolean isRight) {
        if (node != null) {
            System.out.println(prefix + (isRight ? "└── " : "├── ") + node.getValue());
            printTree(node.getLeft(), prefix + (isRight ? "    " : "│   "), false);
            printTree(node.getRight(), prefix + (isRight ? "    " : "│   "), true);
        }
    }
}
