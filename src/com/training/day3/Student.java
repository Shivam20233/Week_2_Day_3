package com.training.day3;

import java.util.Objects;

public class Student {//implements Comparable<Student> {
    private int studId;
    private String studName;
    private int studAge;
    private char grade;

    public Student(int studId, String studName, int studAge, char grade) {
        this.studId = studId;
        this.studName = studName;
        this.studAge = studAge;
        this.grade = grade;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studId == student.studId && studAge == student.studAge && grade == student.grade && Objects.equals(studName, student.studName);
    }

    @Override
    public int hashCode() {
        return this.studId;
    }

    /*@Override
    public int compareTo(Student o) {
        return this.getStudName().compareTo(o.getStudName()); // if no need to swap -> +ve value, need swap = -ve value, if equal = 0;
    }*/

    /*@Override
    public int compareTo(Student o) {
        return this.getStudId() - o.getStudId(); // if no need to swap -> +ve value, need swap = -ve value, if equal = 0;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studAge=" + studAge +
                ", grade=" + grade +
                '}';
    }
}