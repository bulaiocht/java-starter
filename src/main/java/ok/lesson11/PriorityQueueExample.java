package ok.lesson11;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by admin on 12.11.2016.
 */
public class PriorityQueueExample {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue<>();
        queue.add(4);
        System.out.println(queue);
        queue.add(7);
        System.out.println(queue);
        queue.add(9);
        System.out.println(queue);
        queue.add(1);
        System.out.println(queue);
        queue.add(0);
        System.out.println(queue);
        queue.add(8);
        System.out.println(queue);
        queue.add(12);
       System.out.println(queue);
        queue.add(15);
        System.out.println(queue);
        queue.add(17);
        System.out.println(queue);
        queue.add(10);
        System.out.println(queue);
    }
}
