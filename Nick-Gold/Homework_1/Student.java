package org.Homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Student {
    private String name;
    private int birthYear;
    private int age;

    public Student() {
    }

    public Student(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return this.age;
    }

    public int age_count() {
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        this.age = year - this.birthYear;
        return this.age;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student name: ");
        this.name = scanner.nextLine();
        System.out.println("Input student birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public String toString() {
        String var10000 = this.name;
        return "\nStudent name: " + var10000 + "\nStudent birth year: " + this.birthYear + "\nStudent age: " + this.age_count();
    }
}