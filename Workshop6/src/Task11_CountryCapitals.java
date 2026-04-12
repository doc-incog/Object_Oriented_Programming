import java.util.HashMap;

public class Task11_CountryCapitals {
    public static void main(String[] args) {
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Brazil", "Brasília");

        printMap(countryCapitals);
        System.out.println("Capital of France: " + getCapital(countryCapitals, "France"));
        System.out.println("Contains capital 'Berlin'? " + containsCapital(countryCapitals, "Berlin"));
        System.out.println("Contains capital 'Rome'? " + containsCapital(countryCapitals, "Rome"));

        System.out.println("\nAll countries and capitals:");
        for (var entry : countryCapitals.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    static void printMap(HashMap<String, String> map) {
        System.out.println("Map contents: " + map);
    }

    static String getCapital(HashMap<String, String> map, String country) {
        return map.get(country);
    }

    static boolean containsCapital(HashMap<String, String> map, String capital) {
        return map.containsValue(capital);
    }
}