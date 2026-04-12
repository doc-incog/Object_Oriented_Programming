import java.util.ArrayList;

public class Task1_StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        students.add("Eve");
        System.out.println("Initial list: " + students);

        students.remove("Charlie");
        System.out.println("After removal: " + students);
    }
}