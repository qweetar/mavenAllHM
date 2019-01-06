package com.htp.kuzmenok.task9.Student;


public class Student implements Comparable <Student> {
    private String name;
    private String surname;
    private Integer studentNumber; // Student's number in List

    public Student() {}

    public Student(String name, String surname, Integer studentNumber) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudetnNumber(Integer studetnNumber) {
        this.studentNumber = studetnNumber;
    }




    @Override
    public int compareTo(Student o) {
        return studentNumber.compareTo(o.getStudentNumber());
    }
}
