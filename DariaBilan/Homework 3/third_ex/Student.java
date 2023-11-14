package hw_third.third_ex;

import java.util.Iterator;
import java.util.List;

public class Student{
    private String name;
    private String courseID;
    public Student(String name, String courseID) {
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
    public String toString() {
        return "Student{" +
                "\n\tname='" + name + '\'' + ",\n\t" +
                "courseID='" + courseID + '\'' +
                '}' + "\n";
    }
    public static void printStudents(List<Student> students, String course){
        Iterator<Student> it = students.iterator();
        System.out.println("Students in Course " + course + ":");
        while (it.hasNext()){
            Student student = it.next();
            if(student.getCourseID().equals(course)){
                System.out.println(student.getName());
            }
        }
    }

    public int compareByName(Student otherStudent){
        return this.name.compareTo(otherStudent.getName());
    }

    public int compareByCourse(Student otherStudent){
        return this.courseID.compareTo(otherStudent.getCourseID());
    }
}
