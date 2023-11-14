package hw_third.third_ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void compareByName() {
        Student student1 = new Student("Alice", "CS101");
        Student student2 = new Student("Bob", "CS102");

        int expected = "Alice".compareTo("Bob");
        int actual = student1.compareByName(student2);

        assertEquals(expected, actual, "compareByName failed");
    }

    @Test
    void compareByCourse() {Student student1 = new Student("Alice", "CS101");
        Student student2 = new Student("Bob", "CS102");

        int expected = "CS101".compareTo("CS102");
        int actual = student1.compareByCourse(student2);

        assertEquals(expected, actual, "compareByCourse failed");
    }
}