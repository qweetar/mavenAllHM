package com.htp.kuzmenok.task9.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Anthony", "Kiedis", 1);
        Student student2 = new Student("Billie Joe", "Armstrong", 2);
        Student student3 = new Student("Jonathan", "Davis", 3);
        Student student4 = new Student("Fred", "Durst", 4);
        Student student5 = new Student("James", "Hatfield", 5);
        Student student6 = new Student("Serj", "Tankian", 6);
        Student student7 = new Student("Mark", "Hoppus", 7);
        Student student8 = new Student("Cristian", "Machado", 8);
        Student student9 = new Student("Jared", "Leto", 9);
        Student student10 = new Student("Mike", "Shinoda", 10);

        Set<Student> treeSet = new TreeSet<>();

        treeSet.add(student10);
        treeSet.add(student1);
        treeSet.add(student8);
        treeSet.add(student2);
        treeSet.add(student5);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student6);
        treeSet.add(student9);
        treeSet.add(student7);

        System.out.println("List of students:");
        for (Student student : treeSet) {
            System.out.println(student.getStudentNumber() + " " + student.getName() + " " + student.getSurname());
        }


        System.out.println("\nList of students with even numbers");
        Set<Student> tempTreeSet = new TreeSet<>();

        for (Student student : treeSet) {
            if (student.getStudentNumber() % 2 == 0) {
                System.out.println(student.getStudentNumber() + " " + student.getName() + " " + student.getSurname());
            } else {
                tempTreeSet.add(student);
            }
        }
        treeSet.removeAll(tempTreeSet);
        System.out.println("\nList of students after removal of student with uneven numbers: ");
        for (Student student : treeSet) {
            System.out.println(student.getStudentNumber() + " " + student.getName() + " " + student.getSurname());
        }
    }
}
