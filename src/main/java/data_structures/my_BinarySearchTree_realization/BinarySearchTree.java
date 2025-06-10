package data_structures.my_BinarySearchTree_realization;

public class BinarySearchTree {
    private Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insertRec(node.left, value);
        } else if (value > node.value) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }


    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        }
        return value < node.value
                ? searchRec(node.left, value)
                : searchRec(node.right, value);
    }

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (value < node.value) {
            node.left = deleteRec(node.left, value);
        } else if (value > node.value) {
            node.right = deleteRec(node.right, value);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            node.value = minValue(node.right);
            node.right = deleteRec(node.right, node.value);
        }
        return node;
    }

    private int minValue(Node node) {
        return node.left == null ? node.value : minValue(node.left);
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.value + " ");
            inOrderRec(node.right);
        }
    }

    // Структура узла
    private static class Node {
        int value;
        Node left, right;
        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.inOrder(); // Вывод: 3 5 7
    }
}