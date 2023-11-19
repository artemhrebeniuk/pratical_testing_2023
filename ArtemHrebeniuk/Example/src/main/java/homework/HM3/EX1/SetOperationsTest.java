package hm3_ex1;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    @Test
    void union() {
      
        Set<Integer> set1 = new HashSet<>(Set.of(3, 5, 9, 17, 23, 41));
        Set<Integer> set2 = new HashSet<>(Set.of(2, 5, 17, 41, 51));

        SetMethods setMethods = new SetMethods();
        Set<Integer> actual = setMethods.union(set1, set2);

        Set<Integer> expected = new HashSet<>(Set.of(2, 3, 5, 9, 17, 23, 41, 51));
        assertEquals(expected, actual, "Union failed");

        set1 = new HashSet<>();
        set2 = new HashSet<>();
        actual = setMethods.union(set1, set2);
        expected = new HashSet<>();
        assertEquals(expected, actual, "Union of empty sets should be empty");
    }

    @Test
    void intersect() {
      
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

        SetMethods setMethods = new SetMethods();
        Set<Integer> actual = setMethods.intersect(set1, set2);

        Set<Integer> expected = new HashSet<>(Set.of(3));
        assertEquals(expected, actual, "Intersection failed");

        set1 = new HashSet<>();
        set2 = new HashSet<>();
        actual = setMethods.intersect(set1, set2);
        expected = new HashSet<>();
        assertEquals(expected, actual, "Intersection of empty sets should be empty");
    }

    @Test
    void intersectWithDuplicates() {
      
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 3, 4, 5));
        SetMethods setMethods = new SetMethods();
        Set<Integer> actual = setMethods.intersect(set1, set2);
        Set<Integer> expected = new HashSet<>(Set.of(3));
        assertEquals(expected, actual, "Intersection with duplicates failed");
    }
}
