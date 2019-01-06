package com.htp.kuzmenok.task9.Book;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable, Comparable <Book>{ // implements Comparable
    private static final long seralVersionUID = 1L;

    private String title;
    private String authorName;
    private String authorSurname;
    private String authorMiddleName;
    private String genre;
    private Integer publishYear;

    public Book() {    }

    public Book(String title, String authorName, String authorSurname, String authorMiddleName, String genre, Integer publishYear) {
        this.title = title;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorMiddleName = authorMiddleName;
        this.genre = genre;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorMiddleName() {
        return authorMiddleName;
    }

    public void setAuthorMiddleName(String authorMiddleName) {
        this.authorMiddleName = authorMiddleName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorSurname, book.authorSurname) &&
                Objects.equals(authorMiddleName, book.authorMiddleName) &&
                Objects.equals(genre, book.genre) &&
                Objects.equals(publishYear, book.publishYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, authorSurname, authorMiddleName, genre, publishYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorMiddleName='" + authorMiddleName + '\'' +
                ", genre='" + genre + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        int nameCmp = authorName.compareTo(o.getAuthorName());
        int middleNameCmp = authorMiddleName.compareTo(o.getAuthorMiddleName());
        int surnameCmp = authorSurname.compareTo(o.getAuthorSurname());
        int titleCmp = title.compareTo(o.getTitle());
        int returnInt = 0;

        if (nameCmp != 0) {
            returnInt = nameCmp;
            return nameCmp;
        } else if (middleNameCmp != 0) {
            returnInt = nameCmp;
            return middleNameCmp;
        } else if (surnameCmp != 0) {
            returnInt = surnameCmp;
            return surnameCmp;
        } else if (titleCmp != 0) {
            returnInt = titleCmp;
            return titleCmp;
        }
        return returnInt;
    }
}
