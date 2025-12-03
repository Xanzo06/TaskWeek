package org.example.taskweekchapter2;

import java.time.Year;

public class Book {
    public String title;
    public String author;
    public int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = Year.now().getValue();
    }

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.year = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Евгений Онегин", "Александр Пушкин", 1825);
        System.out.println("Книга 2: " + "Произведение: " + book1.getTitle() + ";" + " Автор: " + book1.getAuthor() + ";" + " Год выпуска: " + book1.getYear());
        Book book2 = new Book("Война и мир", "Лев Толстой");
        System.out.println("Книга 2: " + "Произведение: " + book2.getTitle() + ";" + " Автор: " + book2.getAuthor() + ";" + " Год выпуска: " + book2.getYear());
        Book book3 = new Book();
        System.out.println("Книга 2: " + "Произведение: " + book3.getTitle() + ";" + " Автор: " + book3.getAuthor() + ";" + " Год выпуска: " + book3.getYear());


    }

}
