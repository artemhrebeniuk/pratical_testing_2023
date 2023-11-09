package task1;

import task1.enums.InfoType;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeBookNum;
    private InfoType info = InfoType.DEF;
    private Group group = new Group();
    private final List<Estimation> disciplines = new ArrayList<>();

    public Student() {
    }

    public Student(String firstName, String lastName, String gradeBookNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeBookNum = gradeBookNum;
    }

    public Student(String firstName, String lastName, String gradeBookNum, Group group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeBookNum = gradeBookNum;
        this.group = group;
    }

    public void addDiscipline(Estimation estDiscipline) {
        disciplines.add(estDiscipline);
    }

    public void removeDiscipline(Estimation estDiscipline) {
        disciplines.remove(estDiscipline);
    }

    public String getStudentInfo() {
        StringBuilder studentDescription = new StringBuilder();
        studentDescription.append("First Name: ").append(firstName).append("\n");
        studentDescription.append("Last Name: ").append(lastName).append("\n");
        studentDescription.append("Grade book number: ").append(gradeBookNum).append("\n");
        studentDescription.append("Group: ").append(group.getNumber()).append("\n");
        return studentDescription.toString();
    }

    public String getStudentName() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\n";
    }

    public String getStudentGradeBook() {
        return "Grade book number: " + gradeBookNum + "\n";
    }

    public String getStudentGroup() {
        return "Group: " + group.getNumber() + "\n";
    }
}
