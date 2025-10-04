package structures;

public class DoublyLinkedList<T> {
    private int size;
    private DoublyNode<T> first;
    private DoublyNode<T> last;

    // Constructor
    public DoublyLinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    // Getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoublyNode<T> getFirst() {
        return first;
    }

    public void setFirst(DoublyNode<T> first) {
        this.first = first;
    }

    public DoublyNode<T> getLast() {
        return last;
    }

    public void setLast(DoublyNode<T> last) {
        this.last = last;
    }

    // Operations
    public void addFirst(T newData) {
        // to be implemented
    }

    public void addLast(T newData) {
        // to be implemented
    }

    public void addAfter(DoublyNode<T> actualData, T newData) {
        // to be implemented
    }

    public void remove(DoublyNode<T> node) {
        // to be implemented
    }
}
