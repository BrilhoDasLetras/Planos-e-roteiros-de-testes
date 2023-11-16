/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brilhodasletras;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hercu
 */
public class MainMenu {
    private LibraryManager libraryManager;
    private Scanner scanner;

    public MainMenu() {
        libraryManager = new LibraryManager();
        scanner = new Scanner(System.in);
        
    }
   
    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nBem-vindo � Brilho das Letras Library!");
            System.out.println("Escolha uma op��o:");
            System.out.println("1. Registrar um novo leitor");
            System.out.println("2. Registrar um novo escritor");
            System.out.println("3. Visualizar o perfil de um leitor");
            System.out.println("4. Visualizar o perfil de um escritor");
            System.out.println("5. Visualizar todos os livros publicados");
            System.out.println("6. Registrar um novo livro (apenas para escritores)");
            System.out.println("7. Realizar uma transa��o (compra ou apoio)");
            System.out.println("8. Sair do sistema");

            int choice = getIntInput("Escolha uma op��o: ");

            switch (choice) {
                case 1:
                    registerNewReader();
                    break;
                case 2:
                    registerNewWriter();
                    break;
                case 3:
                    viewReaderProfile();
                    break;
                case 4:
                    viewWriterProfile();
                    break;
                case 5:
                    viewAllBooks();
                    break;
                case 6:
                    registerNewBook();
                    break;
                case 7:
                    performTransaction();
                    break;
                case 8:
                    exit = true;
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Op��o inv�lida. Por favor, escolha uma op��o v�lida.");
            }
        }

        scanner.close();
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private String getStringInput(String prompt) {
        scanner.nextLine(); // Consumir a nova linha pendente
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private void registerNewReader() {
        String name = getStringInput("Nome do leitor: ");
        String dateOfBirth = getStringInput("Data de nascimento: ");
        String email = getStringInput("Email: ");
        String username = getStringInput("Nome de usu�rio: ");
        String password = getStringInput("Senha: ");
        String biography = getStringInput("Biografia (opcional): ");

        Reader reader = new Reader(name, dateOfBirth, email, username, password, biography);
        libraryManager.registerReader(reader);
        System.out.println("Leitor registrado com sucesso!");
    }

    private void registerNewWriter() {
        String name = getStringInput("Nome do escritor: ");
        String dateOfBirth = getStringInput("Data de nascimento: ");
        String email = getStringInput("Email: ");
        String username = getStringInput("Nome de usu�rio: ");
        String password = getStringInput("Senha: ");
        String biography = getStringInput("Biografia (opcional): ");

        Writer writer = new Writer(name, dateOfBirth, email, username, password, biography);
        libraryManager.registerWriter(writer);
        System.out.println("Escritor registrado com sucesso!");
    }

    private void viewReaderProfile() {
        String username = getStringInput("Nome de usu�rio do leitor: ");
        Reader reader = libraryManager.findReaderByUsername(username);

        if (reader != null) {
            System.out.println("Perfil do Leitor:");
            System.out.println(reader);
        } else {
            System.out.println("Leitor n�o encontrado.");
        }
    }

    private void viewWriterProfile() {
        String username = getStringInput("Nome de usu�rio do escritor: ");
        Writer writer = libraryManager.findWriterByUsername(username);

        if (writer != null) {
            System.out.println("Perfil do Escritor:");
            System.out.println(writer);
        } else {
            System.out.println("Escritor n�o encontrado.");
        }
    }

    private void viewAllBooks() {
        List<Book> books = libraryManager.getAllBooks();

        if (books.isEmpty()) {
            System.out.println("Nenhum livro publicado ainda.");
        } else {
            System.out.println("Livros Publicados:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private void registerNewBook() {
        String username = getStringInput("Nome de usu�rio do escritor: ");
        Writer writer = libraryManager.findWriterByUsername(username);

        if (writer != null) {
            String title = getStringInput("T�tulo do livro: ");
            String description = getStringInput("Descri��o: ");
            String genre = getStringInput("G�nero: ");
            int yearPublished = getIntInput("Ano de publica��o: ");
            String ISBN = getStringInput("ISBN: ");

            Book book = new Book(title, writer, description, genre, yearPublished, ISBN);
            libraryManager.registerBook(book);
            System.out.println("Livro registrado com sucesso!");
        } else {
            System.out.println("Escritor n�o encontrado.");
        }
    }

    private void performTransaction() {
        // Implemente a l�gica para realizar uma transa��o (compra ou apoio) aqui
        String username = getStringInput("Nome de usu�rio do leitor: ");
        Reader reader = libraryManager.findReaderByUsername(username);

        if (reader != null) {
            String bookTitle = getStringInput("T�tulo do livro: ");
            Book book = libraryManager.findBookByTitle(bookTitle);

            if (book != null) {
                double amount = scanner.nextDouble();
                Transaction transaction = new Transaction(reader, book, amount);
                // Fa�a algo com a transa��o, como armazenar em uma lista
                System.out.println("Transa��o realizada com sucesso!");
            } else {
                System.out.println("Livro n�o encontrado.");
            }
        } else {
            System.out.println("Leitor n�o encontrado.");
        }
    }
}
