/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.brilhodasletras;

import java.util.Date;
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
public class TransactionTest {
    
    private Transaction transaction;
    
    
    @BeforeEach
    public void setUp() {
        Reader reader = new Reader("Alice", "10/07/2000", "test@test", "test", "1234", "testBiography" ); 
        Book book = new Book("Sample Book", 
        new Writer("testName", "01/05/2003", "test@test", "testUser", "1234", "testBiography"),
        "Sample description", "Sample Genre", 2022, "1234567890");
        
        transaction = new Transaction(reader, book, 20.0);
        
    }
    
   
    @Test
    public void testGetReader() {
        assertEquals("Alice", transaction.getReader().getName());
    }

   
    @Test
    public void testGetBook() {
        assertEquals("Sample Book", transaction.getBook().getTitle());
    }

   
    @Test
    public void testGetAmount() {
        assertEquals(20.0, transaction.getAmount(), 0.001);
    }

    
    @Test
    public void testGetTransactionDate() {
        Date transactionDate = transaction.getTransactionDate();
        assertNotNull(transactionDate);
    }
    
}
