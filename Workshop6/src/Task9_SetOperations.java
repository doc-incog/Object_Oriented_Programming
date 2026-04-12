import java.util.HashSet;

public class Task9_SetOperations {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Dog"); set1.add("Cat"); set1.add("Elephant"); set1.add("Lion");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Cat"); set2.add("Giraffe"); set2.add("Dog"); set2.add("Monkey");

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + performUnion(set1, set2));
        System.out.println("Intersection: " + performIntersection(set1, set2));
        System.out.println("Difference (set1 - set2): " + performDifference(set1, set2));
    }

    static HashSet<String> performUnion(HashSet<String> a, HashSet<String> b) {
        HashSet<String> union = new HashSet<>(a);
        union.addAll(b);
        return union;
    }

    static HashSet<String> performIntersection(HashSet<String> a, HashSet<String> b) {
        HashSet<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        return intersection;
    }

    static HashSet<String> performDifference(HashSet<String> a, HashSet<String> b) {
        HashSet<String> diff = new HashSet<>(a);
        diff.removeAll(b);
        return diff;
    }
}