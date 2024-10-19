package ClassWork;
public class MyList <T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T value){
        Node<T> node = new Node<T>(value);

        if(this.isEmpty()){
            head = node;
            tail = node;
        }

        tail.setNext(node);
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void add(T value, int index){
        Node<T> node = new Node<T>(value);

        if(this.isEmpty()){
            System.out.println("Empty list");
            return;
        }

        if (index == 1){
            node.setNext(head);
            this.head = node;
        }
        if (index>1) {
            Node<T> temp = head;
            int i = 1;
            while(temp.hasNext()){
                if(i == index - 1){
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                    return;
                }
                i++;
                temp = temp.getNext();
            }
        }
    }


    @Override
    public String toString(){
        return head.toString();
    }

    

}
