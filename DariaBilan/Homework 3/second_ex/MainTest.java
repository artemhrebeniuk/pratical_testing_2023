package hw_third.second_ex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void printMap() {
        Map<String, String> personMap = new LinkedHashMap<>();
        personMap.put("Fisher", "Colin");
        personMap.put("Hayden", "Grayson ");
        personMap.put("Ruiz", "Colin");

        String expected = "Last name: Fisher, First name: Colin\n" +
                "Last name: Hayden, First name: Grayson \n" +
                "Last name: Ruiz, First name: Colin\n";

        String actual = new Main().printMap(personMap);
        assertEquals(expected, actual);
    }
}