/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brilhodasletras;

/**
 *
 * @author hercu
 */
public class Book {
    private String title;
    private Writer author;
    private String description;
    private String genre;
    private int yearPublished;
    private String ISBN;

    public Book(String title, Writer author, String description, String genre, int yearPublished, String ISBN) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public Writer getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }

   @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author.getName() +
                ", description='" + description + '\'' +
                ", genre='" + genre + '\'' +
                ", yearPublished=" + yearPublished +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
    
    public void displayBookDetails() {
        System.out.println("T�tulo: " + title);
    }
}
