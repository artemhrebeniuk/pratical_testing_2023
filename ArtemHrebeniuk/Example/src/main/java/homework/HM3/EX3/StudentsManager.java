package hm3_ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class StudentsManager {

    public static String printStudents(List<Student> students) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Student student : students) {
            stringBuilder.append("Name: " + student.getName() + ", Course ID: " + student.getCourseID()).append("\n");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Emily Johnson", "101"));
        students.add(new Student("Olivia Williams", "204F"));
        students.add(new Student("Liam Smith", "101"));
        students.add(new Student("Emma Jones", "30AD"));
        students.add(new Student("Noah Brown", "30AD"));
        students.add(new Student("Ava Green", "204F"));
        students.add(new Student("Lucas Davis", "101"));

        System.out.println("Original list of students:");
        System.out.println(students);
        System.out.println("\n----------------------------");

        // Print students enrolled in course "101"
        Student.printStudents(students, "Students enrolled in course 101:\n");

        // Sort students by name and print
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("\nStudents sorted by name:");
        System.out.println(printStudents(students));
        System.out.println("\n-------------------------");

        // Sort students by course and print
        students.sort(Comparator.comparing(Student::getCourseID));
        System.out.println("\nStudents sorted by course:");
        System.out.println(printStudents(students));
    }
}
