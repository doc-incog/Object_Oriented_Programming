import java.util.ArrayList;
import java.util.Collections;

public class Task3_RotateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        int k = 2;
        System.out.println("Original: " + list);

        Collections.rotate(list, k);
        System.out.println("Rotated right by " + k + ": " + list);
    }
}