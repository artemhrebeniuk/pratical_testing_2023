package hw_third.first_ex;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetMethodsTest {

    @Test
    void unionForInteger() {
        Set<Integer> set1 = new HashSet<>(Set.of(3, 5, 9, 17, 23, 41));
        Set<Integer> set2 = new HashSet<>(Set.of(2, 5, 17, 41, 51));

        SetMethods setMethods = new SetMethods();
        Set<Integer> actual = setMethods.union(set1, set2);

        Set<Integer> expected = Set.of(2, 3, 5, 9, 17, 23, 41, 51);
        assertEquals(expected, actual, "Union failed");
    }

    @Test
    void unionForString() {
        Set<String> set1 = new HashSet<>(Set.of("banana", "apple", "kiwi", "orange"));
        Set<String> set2 = new HashSet<>(Set.of("grapefruit", "grape", "tangerines", "apple"));

        SetMethods setMethods = new SetMethods();
        Set<String> actual = setMethods.union(set1, set2);

        Set<String> expected = Set.of("banana, orange, apple, kiwi, grapefruit, grape, tangerines");
        assertEquals(expected, actual, "Union failed");
    }

    @Test
    void intersectForInteger() {Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

        SetMethods setMethods = new SetMethods();
        Set<Integer> result = setMethods.intersect(set1, set2);

        Set<Integer> expected = Set.of(3);

        assertEquals(expected, result, "Intersection failed");
    }

    @Test
    void intersectForString() {
        Set<String> set1 = new HashSet<>(Set.of("banana", "apple", "kiwi", "orange"));
        Set<String> set2 = new HashSet<>(Set.of("grapefruit", "grape", "tangerines", "apple"));

        SetMethods setMethods = new SetMethods();
        Set<String> result = setMethods.intersect(set1, set2);

        Set<String> expected = Set.of("apple");

        assertEquals(expected, result, "Intersection failed");
    }

    @Test
    public void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        SetMethods setMethods = new SetMethods();
        Set<Integer> unionResult = setMethods.union(set1, set2);
        Set<Integer> intersectResult = setMethods.intersect(set1, set2);

        assertTrue(unionResult.isEmpty(), "Union of empty sets should be empty");
        assertTrue(intersectResult.isEmpty(), "Intersection of empty sets should be empty");
    }
}