package hw_third.third_ex;

import java.util.*;

public class Main {

    public static String printStudents(List<Student> students){
        StringBuilder sb = new StringBuilder();
        for (Student element : students){
            sb.append("Name: " + element.getName() + ", Course ID: " + element.getCourseID()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Cassandra Grant", "101"));
        students.add(new Student("Bridget Sawyer", "204F"));
        students.add(new Student("Ewan Butler", "101"));
        students.add(new Student("Louise Whitney", "30AD"));
        students.add(new Student("Carys Mckinney", "30AD"));
        students.add(new Student("Kaan Lucero", "204F"));
        students.add(new Student("Conrad Flores", "101"));

        System.out.println(students);
        Student.printStudents(students, "101"+"\n----------------------------");

        // Sort the students by name and print
        Collections.sort(students, Student::compareByName);
        System.out.println("Students sorted by name:");
        System.out.println(printStudents(students));
        System.out.println("-------------------------");
        // Sort the students by course and print
        students.sort((s1, s2) -> s1.compareByCourse(s2));
        System.out.println("Students sorted by course:");
        System.out.println(printStudents(students));
    }
}
