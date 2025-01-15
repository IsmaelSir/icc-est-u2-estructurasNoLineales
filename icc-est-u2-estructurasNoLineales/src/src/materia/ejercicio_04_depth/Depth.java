
package src.materia.ejercicio_04_depth;

import controlle.models.Node;

/**
 *
 * @author Pablo Siranaula
 */
public class Depth {
    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        return node;
    }

    public int getDepth() {
        return getDepth(root);
    }

    private int getDepth(Node node) {
        if (node == null) {
            return 0; 
        }

        int leftDepth = getDepth(node.getLeft()); 
        int rightDepth = getDepth(node.getRight()); 

        return Math.max(leftDepth, rightDepth) + 1;  
    }

    public void printTree() {
        printTree(root, "", true);
    }

    private void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└──") + node.getValue());
            if (node.getLeft() != null || node.getRight() != null) {
                if (node.getLeft() != null) {
                    printTree(node.getLeft(), prefix + (isLeft ? "| " : "  "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "| " : " ") + "└── null");
                }
                if (node.getRight() != null) {
                    printTree(node.getRight(), prefix + (isLeft ? "| " : "  "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "| " : " ") + "└── null");
                }
            }
        }
    }

}
