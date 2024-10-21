package Task_8;

public class Stack<T> {
    
    private Node<T> head;

    public void push(T value){
        if(this.isEmpty())
            head = new Node<>(value);
        Node<T> node = new Node<>(value);
        node.setNext(head);
        head = node;    
    }

    public boolean isEmpty(){
        return head==null;
    }

    public T peek(){
        if(this.isEmpty()){
            return null;
        }
        return head.getValue();
    }

    public T pop(){
        if(this.isEmpty()){
            return null;
        }
        
        Node<T> node = head;
        head.setNext(head.getNext());
        return node.getValue();
    }

}
