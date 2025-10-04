package structures;

public class LinkedList<T> {
    private int size;
    private Node<T> first;

    // Constructor
    public LinkedList() {
        this.size = 0;
        this.first = null;
    }

    // Getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    // Operations
    public void addFirst(T newData) {
        // to be implemented
    }

    public void addAfter(Node<T> actualData, T newData) {
        // to be implemented
    }

    public void remove(Node<T> node) {
        // to be implemented
    }
}
