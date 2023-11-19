package hm1;

import java.text.DecimalFormat;

public class Student {
    private String name;
    private float rating;

    public Student() {
    }

    public Student(String name, float rating) {
        this.name = name;
        this.rating = rating;
    }

    public static String findBestStudent(Student... students) {
        if (students.length == 0) {
            return "No students found.";
        }

        Student bestStudent = students[0];
        for (Student student : students) {
            if (student.getRating() > bestStudent.getRating()) {
                bestStudent = student;
            }
        }

        return bestStudent.getName();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String avgRatingStr = df.format(getAverageRating(students));
        String avgRatingInfo = "\nAverage rating of all students: " + avgRatingStr;
        return "Name: " + name + "\nRating: " + rating + avgRatingInfo + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    // Вычисление среднего рейтинга
    public static float getAverageRating(Student... students) {
        if (students.length == 0) {
            return -1;
        }

        float sum = 0;
        for (Student student : students) {
            sum += student.getRating();
        }
        return sum / students.length;
    }
}

