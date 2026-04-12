import java.util.*;

public class Task4_ColorLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("All colors:");
        for (String c : colors) System.out.println(c);

        System.out.println("Contains Red? " + colors.contains("Red"));

        Collections.shuffle(colors);
        System.out.println("Shuffled: " + colors);

        Collections.sort(colors);
        System.out.println("Sorted ascending: " + colors);
    }
}