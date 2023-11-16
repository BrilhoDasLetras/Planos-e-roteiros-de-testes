/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brilhodasletras;

import java.util.Date;

/**
 *
 * @author hercu
 */
public class Transaction {
    private Reader reader;
    private Book book;
    private double amount;
    private Date transactionDate;

    public Transaction(Reader reader, Book book, double amount) {
        this.reader = reader;
        this.book = book;
        this.amount = amount;
        this.transactionDate = new Date();
    }

    public Reader getReader() {
        return reader;
    }

    public Book getBook() {
        return book;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}