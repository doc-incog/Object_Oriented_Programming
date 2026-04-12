import java.util.LinkedList;

public class Task2_LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Is list empty? " + list.isEmpty());

        list.addFirst("First");
        list.addLast("Last");
        list.addFirst("New First");
        list.addLast("New Last");

        System.out.println("Linked list: " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}