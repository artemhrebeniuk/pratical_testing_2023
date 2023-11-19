package hm3_ex3;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private String courseID;

    public Student(String name, String courseID) {
        if (name == null || courseID == null) {
            throw new IllegalArgumentException("Invalid student information");
        }
        this.name = name;
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(courseID, student.courseID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courseID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseID='" + courseID + '\'' +
                '}';
    }

    public static void printStudents(List<Student> students, String headerMessage) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println(headerMessage);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public int compareByName(Student otherStudent) {
        if (otherStudent == null) {
            throw new NullPointerException("Cannot compare to a null student");
        }
        return this.name.compareToIgnoreCase(otherStudent.name);
    }

    public int compareByCourse(Student otherStudent) {
        if (otherStudent == null) {
            throw new NullPointerException("Cannot compare to a null student");
        }
        return this.courseID.compareTo(otherStudent.courseID);
    }
}
