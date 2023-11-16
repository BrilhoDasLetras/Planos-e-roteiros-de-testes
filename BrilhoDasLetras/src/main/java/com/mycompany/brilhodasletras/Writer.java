/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brilhodasletras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hercu
 */
public class Writer {
    private String name;
    private String dateOfBirth;
    private String email;
    private String username;
    private String password;
    private List<Book> booksWritten;
    private String biography;

    public Writer(String name, String dateOfBirth, String email, String username, String password, String biography) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.username = username;
        this.password = password;
        this.biography = biography;
        this.booksWritten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Book> getBooksWritten() {
        return booksWritten;
    }

    public String getBiography() {
        return biography;
    }

    public void addBookWritten(Book book) {
        booksWritten.add(book);
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", biography='" + biography + '\'' +
                '}';
    }
}
