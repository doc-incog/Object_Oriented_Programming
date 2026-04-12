import java.util.TreeSet;

public class Task8_TreeSetNames {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("David");

        System.out.println("Sorted unique names: " + names);
    }
}