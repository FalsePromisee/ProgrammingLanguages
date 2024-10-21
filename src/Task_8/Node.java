package Task_8;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }

    public Node<T> getNext(){
        return next;
    }
    public boolean hasNext(){
        return next!=null;
    }
    public String toString(){
        return "Value" + value +"Next: "; 
    }

}
