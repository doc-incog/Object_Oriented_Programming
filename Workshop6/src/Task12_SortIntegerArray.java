import java.util.Arrays;
import java.util.Collections;

public class Task12_SortIntegerArray {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 9};
        System.out.println("Original: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Ascending: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(numbers));
    }
}