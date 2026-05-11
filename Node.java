// Task 1 Node Design
public class Node<T> {

    public int key;
    public T value;
    public Node<T> previous;
    public Node<T> next;
    public Node<T> hashNext;

    public Node(int key, T value){
        this.key = key;
        this.value = value;
        this.previous = null;
        this.next = null;
        this.hashNext = null;
    }
    
    public int getkey(){
        return key;
    }

    public T getvalue(){
        return value;
    }
}