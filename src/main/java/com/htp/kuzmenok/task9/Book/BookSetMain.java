package com.htp.kuzmenok.task9.Book;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class BookSetMain {
    public static void main(String[] args) {
        Book book1 = new Book("Shantaram", "Gregory", "David", "Roberts", "Biography", 2003);
        Book book2 = new Book("Don't make me think", "Steve", "Krug", "Martin", "WebDesing", 2000);
        Book book3 = new Book("Three Musketeers", "Alexander", "Duma", "Father", "Historical novel", 1844);
        Book book4 = new Book("Kite Runner", "Khaled", "Husseini", "Ho", "Historic Drama", 2003);
        Book book5 = new Book("Ready Player One", "Ernest", "Cline", "Christy", "Science Fiction", 2011);
        Book book6 = new Book("Three Musketeers", "Alexander", "Duma", "Father", "Historical novel", 1844);
        Book book7 = new Book("Wool", "Hugh", "Howey", "Davis", "Science fiction", 2012);
        Book book8 = new Book("Cryptonomicon", "Neal", "Stephenson", "Adams", "Science fiction", 2002);
        Book book9 = new Book("Three Musketeers", "Alexander", "Duma", "Father", "Historical novel", 1844);
        Book book10 = new Book("Fuzzy Nation", "John", "Scalzi", "Michael", "Science fiction", 2011);
        Book book11 = new Book("Old Man's War", "John", "Scalzi", "Michael", "Science fiction", 2007);
        Book book12 = new Book("Levithan Wakes", "James", "Corey", "S.A.", "Science fiction", 2011);
        Book book13 = new Book("Three Musketeers", "Alexander", "Duma", "Father", "Historical novel", 1844);
        Book book14 = new Book("Anathem", "Neal", "Stephenson", "Adams", "Science fiction", 2008);
        Book book15 = new Book("Altered Carbone", "Richard", "Morgan", "K.", "Science fiction", 2006);
        Book book16 = new Book("Three Musketeers", "Alexander", "Duma", "Father", "Historical novel", 1844);
        Book book17 = new Book("House of Suns", "Alastair", "Reynolds", "Donald", "Science fiction", 2010);
        Book book18 = new Book("Three Musketeers", "Alexander", "Duma", "Father", "Historical novel", 1844);
        Book book19 = new Book("Pushing Ice", "Alastair", "Reynolds", "Donald", "Science fiction", 2006);
        Book book20 = new Book("Annihilation", "Jeff", "Vander", "Meer", "Science fiction", 2014);
        Book book21 = new Book("Under The Dome", "Stephen", "King", "Edwin", "Science fiction", 2009);
        Book book22 = new Book("The dreaming void", "Peter", "Hamilton", "Fillip", "Science fiction", 2008);
        Book book23 = new Book("All Clear", "Connie", "Willis", "Daren", "Science fiction", 2010);
        Book book24 = new Book("Shift", "Hugh", "Howey", "Davis", "Science fiction", 2013);
        Book book25 = new Book("The temporal void", "Peter", "Hamilton", "Fillip", "Science fiction", 2008);

        Set<Book> hashSet = new HashSet<>();

        hashSet.add(book1);
        hashSet.add(book11);
        hashSet.add(book20);
        hashSet.add(book12);
        hashSet.add(book18);
        hashSet.add(book13);
        hashSet.add(book21);
        hashSet.add(book3);
        hashSet.add(book22);
        hashSet.add(book15);
        hashSet.add(book8);
        hashSet.add(book9);
        hashSet.add(book7);
        hashSet.add(book19);
        hashSet.add(book23);
        hashSet.add(book2);
        hashSet.add(book14);
        hashSet.add(book16);
        hashSet.add(book24);
        hashSet.add(book10);
        hashSet.add(book25);
        hashSet.add(book5);
        hashSet.add(book4);
        hashSet.add(book6);
        hashSet.add(book17);

        // Sort by first vowel letter
        System.out.println("Books with first vowel letter in the title:");
        for (Book book : hashSet) {
            Character charTmp = book.getTitle().toLowerCase().charAt(0);
            if (charTmp == 'a' || charTmp =='o' || charTmp =='e' || charTmp =='i' || charTmp =='u' || charTmp =='y')
                System.out.println(book.getTitle() + " - " + book);
        }

        System.out.println("\nBooks sorted by author's name: ");
        // Sort by author's name
        Set<Book> treeNameSet = new TreeSet<>(/*new AuthorNameComparator()*/);
        treeNameSet.addAll(hashSet);

        for (Book book : treeNameSet) {
            System.out.println(book.getAuthorName() + " - " + book);
        }

        System.out.println("\nBooks sorted by author's surname");
        // Sort by author's surname
        Set<Book> treeSurnameSet = new TreeSet<>(/*new AuthorSurnameComparator()*/);
        treeSurnameSet.addAll(hashSet);

        for (Book book : treeSurnameSet) {
            System.out.println(book.getAuthorSurname() + " - " + book);
        }

        System.out.println("\nBooks sorted by author's middle name");
        // Sorted by middle name
        Set<Book> treeMiddleNameSet = new TreeSet<>(/*new AuthorMiddleComparator()*/);
        treeMiddleNameSet.addAll(hashSet);

        for (Book book : treeMiddleNameSet) {
            System.out.println(book.getAuthorMiddleName() + " - " + book);
        }



    }
}
