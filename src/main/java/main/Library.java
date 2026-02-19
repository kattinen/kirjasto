// Kirjasto
// Library.java
// Kati Liukkonen
// Luokkien periytyminen ja abstrakti luokka
// Visual Studio code, Java 21, Maven

package main;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> BookList;

    public Library() {
        BookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        BookList.add(book);
        System.out.println("Kirja lisätty kirjastoon!");
    }

    public ArrayList<Book> getBooks() {
        return BookList;
    }

    public void listBooks() {
        int numberOfBooks = 0;
        for (Book book : BookList) {
            book.displayInfo();
            String category = book.categorize();
            System.out.println("Kirjan kategoria: " + category);
            numberOfBooks += book.copies;
        }
        System.out.println("Kirjojen kokonaismäärä kirjastossa on: " + numberOfBooks);
    }

    

}
