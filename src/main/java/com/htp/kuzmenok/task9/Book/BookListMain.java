package com.htp.kuzmenok.task9.Book;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class BookListMain {
    public static void main(String[] args) {

        Book shantaram = new Book("Shantaram", "Gregory", "David", "Roberts", "Biography", 2003);
        Book doNotMakeMeThink = new Book("Don't make me think", "Steve", "Krug", "Martin", "WebDesing", 2000);
        Book threeMusketeers = new Book("Three Musketeers", "Alexander", "Duma", "Father", "Historical novel", 1844);
        Book kiteRunner = new Book("Kite Runner", "Khaled", "Husseini", "Ho", "Historic Drama", 2003);
        Book readyPlayerOne = new Book("Ready Player One", "Ernest", "Cline", "Christy", "Science Fiction", 2011);

        for (Book book : Arrays.asList(shantaram, doNotMakeMeThink)) {

        }

        List<Book> list = new LinkedList<>();

        list.add(shantaram);
        list.add(doNotMakeMeThink);
        list.add(threeMusketeers);
        list.add(kiteRunner);
        list.add(readyPlayerOne);

        System.out.println("List of Books: ");

        for (Book book : list) {
            System.out.println(book);
        }

        System.out.println("\nList of Books, after removal: ");

        list.remove(2);

        for (Book book : list) {
            System.out.println(book);
        }





    }
}
