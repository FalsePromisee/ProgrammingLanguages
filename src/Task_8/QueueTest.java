package Task_8;

public class QueueTest {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        testQueue(queue);

        MyQueue<Integer> limitedQueue = new MyQueue<>(3, false);
        testQueue(limitedQueue);

        try {
            limitedQueue.add(1);
            limitedQueue.add(2);
            limitedQueue.add(3);
            limitedQueue.add(4); 
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            limitedQueue.offer(null);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void testQueue(MyQueue<Integer> queue) {
        System.out.println("Додаємо елементи в чергу: 10, 20, 30");
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Елемент на початку: " + queue.peek());
        System.out.println("Видаляємо елемент з черги: " + queue.remove());

        System.out.println("Чи порожня черга? " + queue.isEmpty());
        System.out.println("Видаляємо всі елементи:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("Чи порожня черга? " + queue.isEmpty());
    }
}