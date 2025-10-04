package structures;

public class BinarySearchTree<T extends Comparable<T>> {
    private int size;
    private TreeNode<T> root;

    // Constructor
    public BinarySearchTree() {
        this.size = 0;
        this.root = null;
    }

    // Getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    // Operations
    public void addNode(T newData) {
        // to be implemented
    }

    public void removeNode(T data) {
        // to be implemented
    }

    public TreeNode<T> searchNode(T data) {
        // to be implemented
        return null;
    }
}
