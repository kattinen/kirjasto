// Kirjasto
// FictionBook.java
// Kati Liukkonen
// Luokkien periytyminen ja abstrakti luokka
// Visual Studio code, Java 21, Maven

package main;

public class FictionBook extends Book {

    public FictionBook(String title, String author, int pages, int copies) {
        super(title, author, pages, copies);
    }

    @Override
    public String categorize() {
        return "Fiktiokirja";
    }
    
}
