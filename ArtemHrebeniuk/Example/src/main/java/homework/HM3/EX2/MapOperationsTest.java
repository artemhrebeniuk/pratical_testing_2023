package hm3_ex2;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapOperationsTest {

    @Test
    void printPersonMap() {
        Map<String, String> personMap = new LinkedHashMap<>();
        personMap.put("Johnson", "David");
        personMap.put("Williams", "Elizabeth");
        personMap.put("Smith", "John");

        String expected = "Last Name: Johnson, First Name: David\n" +
                "Last Name: Smith, First Name: John\n" +
                "Last Name: Williams, First Name: Elizabeth\n";

        String actual = MapOperations.printPersonMap(personMap);
        assertEquals(expected, actual);
    }
}
