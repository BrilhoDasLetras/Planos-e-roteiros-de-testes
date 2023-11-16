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
public class LibraryManager {
    private List<Writer> writers;
    private List<Reader> readers;
    private List<Book> books;

    public LibraryManager() {
        this.writers = new ArrayList<>();
        this.readers = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void registerWriter(Writer writer) {
        writers.add(writer);
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
    }

    public void registerBook(Book book) {
        books.add(book);
        // Adicione o livro � lista de livros escritos pelo autor
        book.getAuthor().addBookWritten(book);
    }

    public List<Writer> getWriters() {
        return writers;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Reader findReaderByUsername(String username) {
        for (Reader reader : readers) {
            if (reader.getUsername().equals(username)) {
                return reader;
            }
        }
        return null; // Retorna null se n�o encontrar um leitor com o nome de usu�rio especificado
    }

    public Writer findWriterByUsername(String username) {
        for (Writer writer : writers) {
            if (writer.getUsername().equals(username)) {
                return writer;
            }
        }
        return null; // Retorna null se n�o encontrar um escritor com o nome de usu�rio especificado
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
