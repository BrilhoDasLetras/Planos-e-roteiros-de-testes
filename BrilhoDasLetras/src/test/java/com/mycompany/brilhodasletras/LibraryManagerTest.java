/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.brilhodasletras;

import java.util.List;
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
public class LibraryManagerTest {
    
    private LibraryManager libraryManager;
    
    @BeforeEach
    public void setUp() {
        libraryManager = new LibraryManager();
    }
    
 
    @Test
    //testando funcionalidade para registrar um escritor 
    public void testRegisterWriter() {
        Writer writer = new Writer("testName", "01/08/1998", "test@test", "testUser", "1234", "testBiography");
        libraryManager.registerWriter(writer);
        assertTrue(libraryManager.getWriters().contains(writer));
     
    }

  
    @Test
    //testando funcionalidade para registrar um leitor
    public void testRegisterReader() {
        Reader reader = new Reader("testName", "01/08/1998", "test@test", "testUser", "1234", "testBiography");
        libraryManager.registerReader(reader);
        assertTrue(libraryManager.getReaders().contains(reader));
    }

    @Test
    //testando funcionalidade de reguistrar um novo livro
    public void testRegisterBook() {
        Writer writer = new Writer("testName", "01/08/1998", "test@test", "testUser", "1234", "testBiography");
        Book book = new Book("Book Title", writer, "testDescription", "testGenre", 2000, "12345");

        libraryManager.registerWriter(writer);
        libraryManager.registerBook(book);

        assertTrue(libraryManager.getAllBooks().contains(book));
        assertEquals(writer, libraryManager.getWriters().get(0));
        assertTrue(writer.getBooksWritten().contains(book));
    }

    @Test
    //testando metodo para encontrar leitor por nome de usuario
    public void testFindReaderByUsername() {
        Reader reader = new Reader("testName", "01/08/1998", "test@test", "testUser", "1234", "testBiography");
        libraryManager.registerReader(reader);

        Reader foundReader = libraryManager.findReaderByUsername("testUser");
        assertEquals(reader, foundReader);
       
    }

    @Test
    //testando metodo para encontrar escritor por nome de usuario
    public void testFindWriterByUsername() {
       Writer writer = new Writer("testName", "01/08/1998", "test@test", "testUser", "1234", "testBiography");
        libraryManager.registerWriter(writer);

        Writer foundWriter = libraryManager.findWriterByUsername("testUser");
        assertEquals(writer, foundWriter);
    }

    @Test
    //testando metodo para encontrar livro pelo titulo
    public void testFindBookByTitle() {
        Writer writer = new Writer("testName", "01/08/1998", "test@test", "testUser", "1234", "testBiography");
        Book book = new Book("Book Title", writer, "testDescription", "testGenre", 2000, "12345");

        libraryManager.registerWriter(writer);
        libraryManager.registerBook(book);

        Book foundBook = libraryManager.findBookByTitle("Book Title");
        assertEquals(book, foundBook);
    }
    
}
