package hw_third.third_ex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void compareByName() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bridget Sawyer", "204F"));
        students.add(new Student("Carys Mckinney", "30AD"));

        String expected = "Name: Bridget Sawyer, Course ID: 204F\n" +
                "Name: Carys Mckinney, Course ID: 30AD\n";
        String actual = Main.printStudentsCompareByName(students);

        assertEquals(expected, actual);
    }

    @Test
    void compareByCourse() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Cassandra Grant", "101"));
        students.add(new Student("Carys Mckinney", "30AD"));

        String expected = "Name: Cassandra Grant, Course ID: 101\n" +
                "Name: Carys Mckinney, Course ID: 30AD\n";
        String actual = Main.printStudentsCompareByCourse(students);

        assertEquals(expected, actual);
    }
}