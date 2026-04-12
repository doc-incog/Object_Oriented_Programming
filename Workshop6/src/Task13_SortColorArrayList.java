import java.util.ArrayList;
import java.util.Collections;

public class Task13_SortColorArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original: " + colors);

        Collections.sort(colors);
        System.out.println("Ascending: " + colors);

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Descending: " + colors);
    }
}