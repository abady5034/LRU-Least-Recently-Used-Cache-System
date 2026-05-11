//Task 9 LRU Cache Core Logic
public class LRUcache<T> {

    private DoublyLinkedList<T> list;
    private hashTable<T> hashTable;
    private int capacity;
    private int size;

    public LRUcache(int capacity) {
        this.capacity = capacity;
        this.list = new DoublyLinkedList<>();
        this.hashTable = new hashTable<>(capacity * 2);
    }

    public T get(int key) {
        Node<T> node = hashTable.Search(key);
        if (node == null) {
            return null;
        }
        list.moveToFront(node);
        return node.value;
    }

    public void put(int key, T value) {
        Node<T> existing = hashTable.Search(key);
        if (existing != null) {
            existing.value = value;
            list.moveToFront(existing);
            return;
        }
        if (size >= capacity) {
            Node<T> tail = list.removeTail();
            if (tail != null) {
                hashTable.Remove(tail.key);
                size--;
            }
        }
        Node<T> newNode = new Node<>(key, value);
        list.insertAtFront(newNode);
        hashTable.Insert(key, newNode);
        size++;
    }

    public void remove(int key) {

        Node<T> node = hashTable.Search(key);

        if (node == null)
            return;

        list.removeNode(node);
        hashTable.Remove(key);

        size--;
    }

    public void display() {
        list.display();
    }
}