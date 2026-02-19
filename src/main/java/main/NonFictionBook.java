// Kirjasto
// NonFictionBook.java
// Kati Liukkonen
// Luokkien periytyminen ja abstrakti luokka
// Visual Studio code, Java 21, Maven

package main;

public class NonFictionBook extends Book {

    public NonFictionBook(String title, String author, int pages, int copies) {
        super(title, author, pages, copies);
    }

    @Override
    public String categorize() {
        return "Tietokirja";
    }
    
}
