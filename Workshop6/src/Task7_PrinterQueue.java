import java.util.ArrayDeque;

public class Task7_PrinterQueue {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.addLast("Document1");
        queue.addLast("Document2");
        queue.addLast("Document3");
        System.out.println("After enqueues: " + queue);

        queue.removeFirst();
        System.out.println("After dequeue: " + queue);

        queue.addLast("Document4");
        queue.addLast("Document5");
        System.out.println("After more enqueues: " + queue);

        System.out.println("Next job: " + queue.peekFirst());
        System.out.println("Final queue: " + queue);
    }
}