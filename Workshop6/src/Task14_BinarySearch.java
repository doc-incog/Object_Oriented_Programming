import java.util.ArrayList;
import java.util.Collections;

public class Task14_BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 20, 30, 40, 50, 60);
        Collections.sort(list);

        int target = 30;
        int index = Collections.binarySearch(list, target);
        if (index >= 0)
            System.out.println(target + " found at index " + index);
        else
            System.out.println(target + " not found");

        target = 100;
        index = Collections.binarySearch(list, target);
        System.out.println(target + " -> insertion point: " + (-index - 1));
    }
}