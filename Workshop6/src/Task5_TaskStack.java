import java.util.Stack;

public class Task5_TaskStack {
    public static void main(String[] args) {
        Stack<String> tasks = new Stack<>();
        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");
        System.out.println("After pushes: " + tasks);

        tasks.pop();
        System.out.println("After pop: " + tasks);

        tasks.push("Debug");
        tasks.push("Test");
        System.out.println("After more pushes: " + tasks);

        System.out.println("Top task: " + tasks.peek());
        System.out.println("Final stack: " + tasks);
    }
}