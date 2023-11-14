package hw_third.second_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static String printMap(Map<String, String> map){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()){
            sb.append("Last name: " + entry.getKey() + ", First name: " + entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap();

        personMap.put("Fisher", "Colin");
        personMap.put("Hayden", "Grayson ");
        personMap.put("Ruiz", "Colin");
        personMap.put("Blankenship", "Orest");
        personMap.put("Nellie ", "Vincent");
        personMap.put("Barney ", "Garrett");
        personMap.put("Atkinson", "Orest");

        //System.out.println(personMap.containsValue("Orest"));

        System.out.println(printMap(personMap));

//        String valueToRemove = "Orest";
//        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> entry = iterator.next();
//            if (entry.getValue().equals(valueToRemove)) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(prinntMap(personMap);
    }
}
