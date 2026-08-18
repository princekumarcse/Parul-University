import java.util.*;

public class Practical20 {

    public static void main(String[] args) {

        // PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Removed element: " + priorityQueue.poll());
        System.out.println("After removal: " + priorityQueue);


        // Deque
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);

        System.out.println("\nDeque: " + deque);

        // Add elements at both ends
        deque.addFirst(5);
        deque.addLast(40);

        System.out.println("After adding at both ends: " + deque);

        // Remove elements from both ends
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        System.out.println("After removal: " + deque);
    }
}