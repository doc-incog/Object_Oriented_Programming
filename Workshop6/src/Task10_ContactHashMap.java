import java.util.HashMap;

public class Task10_ContactHashMap {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Alice", "123-4567");
        contacts.put("Bob", "234-5678");
        contacts.put("Charlie", "345-6789");

        System.out.println("Contacts: " + contacts);
        System.out.println("Bob's number: " + contacts.get("Bob"));
        contacts.remove("Charlie");
        System.out.println("After removal: " + contacts);
    }
}