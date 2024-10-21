package Task_8;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private MyList<T> list;
    private int maxSize;
    private boolean areNullElementsAllowed;

    public MyQueue() {
        this.list = new MyList<>();
        this.maxSize = -1; 
        this.areNullElementsAllowed = true;
    }

    public MyQueue(int maxSize, boolean areNullElementsAllowed) {
        this.list = new MyList<>();
        this.maxSize = maxSize;
        this.areNullElementsAllowed = areNullElementsAllowed;
    }

    public boolean add(T item) {
        if (item == null && !areNullElementsAllowed) {
            throw new NullPointerException("Null elements are not allowed in this queue.");
        }
        if (maxSize > 0 && size() >= maxSize) {
            throw new IllegalStateException("Queue is full.");
        }
        list.add(item);
        return true;
    }

    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        return getHeadValue();
    }

    public boolean offer(T item) {
        if (item == null && !areNullElementsAllowed) {
            throw new NullPointerException("Null elements are not allowed in this queue.");
        }
        if (maxSize > 0 && size() >= maxSize) {
            return false;
        }
        list.add(item);
        return true;
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T value = getHeadValue();
        removeHead();
        return value;
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T value = getHeadValue();
        removeHead();
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return getHeadValue();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int search(T item) {
        Node<T> current = getHeadNode();
        int index = 1;
        while (current != null) {
            if (current.getValue().equals(item)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    private int size() {
        int size = 0;
        Node<T> current = getHeadNode();
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    private T getHeadValue() {
        return getHeadNode().getValue();
    }

    private Node<T> getHeadNode() {
        try {
            return (Node<T>) list.getClass().getDeclaredField("head").get(list);
        } catch (Exception e) {
            throw new IllegalStateException("Cannot access head node", e);
        }
    }

    private void removeHead() {
        try {
            Node<T> head = (Node<T>) list.getClass().getDeclaredField("head").get(list);
            if (head != null) {
                list.getClass().getDeclaredField("head").set(list, head.getNext());
            }
        } catch (Exception e) {
            throw new IllegalStateException("Cannot remove head node", e);
        }
    }
}