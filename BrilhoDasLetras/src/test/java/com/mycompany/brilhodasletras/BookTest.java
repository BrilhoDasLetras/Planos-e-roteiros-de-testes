/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.brilhodasletras;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hercu
 */
public class BookTest {
    private Book book;
   
    
    @BeforeEach
    public void setUp() {
        Writer author = new Writer("testName", "02/03/2003", "test@test", "testuser", "1234", "testbiography"); // You need to create a Writer class
        book = new Book("Sample Book", author, "Sample description", "Sample Genre", 2022, "1234567890");
    }
    
    @AfterEach
    public void tearDown() {
    }

  
    @Test
    public void testGetTitle() {
       assertEquals("Sample Book", book.getTitle());
    }

  
    @Test
    public void testGetAuthor() {
         assertEquals("testName", book.getAuthor().getName());
    }

   
    @Test
    public void testGetDescription() {
        assertEquals("Sample description", book.getDescription());
    }

  
    @Test
    public void testGetGenre() {
       assertEquals("Sample Genre", book.getGenre());
    }

   
    @Test
    public void testGetYearPublished() {
       assertEquals(2022, book.getYearPublished());
    }

  
    @Test
    public void testGetISBN() {
       assertEquals("1234567890", book.getISBN());
    }

   
    @Test
    public void testToString() {
         String expectedString = "Book{" +
                "title='Sample Book', " +
                "author=testName, " +
                "description='Sample description', " +
                "genre='Sample Genre', " +
                "yearPublished=2022, " +
                "ISBN='1234567890'}";
        assertEquals(expectedString, book.toString());
    }

    
}
