//Task 7 Hash Function and Table Setup


public class hashTable<T> {
    Node<T>[] array_hash;
    int size;

    public hashTable(int size) {
        this.size = size;
        array_hash = (Node<T>[]) new Node[size];
    }

    public int GetHash(int key) {
        return Math.abs(key) % size;
    }
    //Task 8 Hash Table Operations
    public void Insert(int key, Node<T> node) {
        int index = GetHash(key);
        node.hashNext = array_hash[index];
        array_hash[index] = node;
    }

    public Node<T> Search(int key) {
        int index = GetHash(key);
        Node<T> current = array_hash[index];
        while (current != null) {
            if (current.key == key) {
                return current;
            }
            current = current.hashNext;
        }
        return null;
    }

    public void Remove(int key) {
        int index = GetHash(key);
        Node<T> current = array_hash[index];
        Node<T> previous = null;
        while (current != null) {
            if (current.key == key) {
                if (previous == null) {
                    array_hash[index] = current.hashNext;
                } else {
                    previous.hashNext = current.hashNext;
                }
                return;
            }
            previous = current;
            current = current.hashNext;
        }
    }
}