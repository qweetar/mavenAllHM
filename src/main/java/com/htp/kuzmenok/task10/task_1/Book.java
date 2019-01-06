package com.htp.kuzmenok.task10.task_1;

public class Book {
    public static Object java;
    public String title;
    public String authorName;
    public String authorSurname;
    public Integer publishYear;

    public Book() {    }

    public Book(String title, String authorName, String authorSurname, Integer publishYear) {
        this.title = title;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.publishYear = publishYear;
    }

    public void showBook (String title, String authorName, String authorSurname, Integer publishYear) {
        String book = title + "\nby " + authorName + " " + authorSurname + "\b" + publishYear;
        System.out.println(book);
    }
}
