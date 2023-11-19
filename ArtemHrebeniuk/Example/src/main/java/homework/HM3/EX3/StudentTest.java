package hm3_ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void compareByName() {
        Student student1 = new Student("Anya", "CS101");
        Student student2 = new Student("Boris", "CS102");

        int expected = "Anya".compareToIgnoreCase("Boris");
        int actual = student1.compareByName(student2);

        assertEquals(expected, actual, "compareByName failed");
    }

    @Test
    void compareByCourse() {
        Student student1 = new Student("Anya", "CS101");
        Student student2 = new Student("Boris", "CS102");

        int expected = "CS101".compareTo("CS102");
        int actual = student1.compareByCourse(student2);

        assertEquals(expected, actual, "compareByCourse failed");
    }

    @Test
    void compareToNullStudent() {
        Student student1 = new Student("Anya", "CS101");

        assertThrows(NullPointerException.class, () -> student1.compareByName(null));
        assertThrows(NullPointerException.class, () -> student1.compareByCourse(null));
    }
}
