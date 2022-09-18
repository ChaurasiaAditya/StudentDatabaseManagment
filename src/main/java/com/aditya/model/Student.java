/*
 * Author Name: Aditya Chaurasia
 * Date: 18-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */

package com.aditya.model;
import java.util.Objects;

public class Student {
    private String name;
    private int rollNumber;
    private int grade;

    public Student(String name, int rollNumber, int grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && grade == student.grade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber, grade);
    }

    @Override
    public String toString() {
        return " Name = " + getName() +
                ", RollNumber = " + getRollNumber() +
                ", Grade = " + getGrade() +
                " \n";
    }
}