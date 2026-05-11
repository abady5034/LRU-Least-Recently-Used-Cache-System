// Task 2 Doubly Linked List Initialization
public class DoublyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Task 3 Insert at Front
    public void insertAtFront(Node<T> newNode) {
        newNode.previous = null;
        newNode.next = head;

        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
        if (tail == null) {

            tail = newNode;
        }
    }

    // Task 4 Remove a Node
    public void removeNode(Node<T> node) {
        if (node == null)
            return;

        if (node == head) {
            head = node.next;
        } else {
            node.previous.next = node.next;
        }
        if (node == tail) {
            tail = node.previous;
        } else {
            node.next.previous = node.previous;
        }
        node.next = null;
        node.previous = null;
    }

    // Task 5 Move Node to Front
    public void moveToFront(Node<T> node) {
        if (node == head || node == null) {
            return;
        }
        removeNode(node);
        insertAtFront(node);
    }

    // Task 6 Remove Least Recently Used Item
    public Node<T> removeTail() {
        if (tail == null) {
            return null;
        }

        Node<T> removedNode = tail;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        removedNode.next = null;
        removedNode.previous = null;
        return removedNode;
    }

    public void display() {

        Node<T> currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.key + ":" + currentNode.value);

            currentNode = currentNode.next;
        }

        System.out.println();
    }
}