import java.util.Stack;

public class Task6_ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");
        Stack<String> stack = new Stack<>();
        for (String w : words) stack.push(w);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop()).append(" ");
        }
        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reversed.toString().trim());
    }
}