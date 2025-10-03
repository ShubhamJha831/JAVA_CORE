package CollectionandGenerics.Collection;

import java.util.Queue;
import java.util.LinkedList;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        Utility.Print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.remove());
        Utility.Print(queue);
        System.out.println(queue.poll());
        Utility.Print(queue);


        System.out.println(queue.poll());

    }
}
