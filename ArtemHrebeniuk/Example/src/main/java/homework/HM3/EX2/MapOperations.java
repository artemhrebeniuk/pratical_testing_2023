package hm3_ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapOperations {

    public static String printPersonMap(Map<String, String> personMap) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            stringBuilder.append("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue()).append("\n");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();

        personMap.put("Johnson", "David");
        personMap.put("Williams", "Elizabeth");
        personMap.put("Smith", "John");
        personMap.put("Jones", "Michael");
        personMap.put("Brown", "Mary");
        personMap.put("Green", "Thomas");
        personMap.put("Davis", "James");

        System.out.println(printPersonMap(personMap));

        String firstNameToRemove = "Michael";
        Iterator<Map.Entry<String, String>> personMapIterator = personMap.entrySet().iterator();

        while (personMapIterator.hasNext()) {
            Map.Entry<String, String> entry = personMapIterator.next();

            if (entry.getValue().equals(firstNameToRemove)) {
                personMapIterator.remove();
            }
        }

        System.out.println(printPersonMap(personMap));
    }
}
