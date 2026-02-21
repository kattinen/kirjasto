// Kirjasto
// FictionBook.java
// Kati Liukkonen
// Luokkien periytyminen, abstrakti luokka ja rajapinta
// Visual Studio code, Java 21, Maven

package main;

public class FictionBook extends Book implements Borrowable {
    private int copiesBorrowed;

    public FictionBook(String title, String author, int pages, int copies) {
        super(title, author, pages, copies);
        this.copiesBorrowed = 0;
    }

    @Override
    public String categorize() {
        return "Fiktiokirja";
    }

    @Override
    public void borrow() {
        if (copiesBorrowed == copies) {
            System.out.println("Kirjaa " + title + " ei enään ole lainattavissa!");
        } else {
            copiesBorrowed++;
            System.out.println("Kirja " + title + " on nyt lainattu.");
        }
    }
    
    @Override
    public void returnBook() {
        if (copiesBorrowed == 0) {
            System.out.println("Kirja " + title + " ei ole lainassa.");
        } else {
            copiesBorrowed--;
            System.out.println("Kirja " + title + " on palautettu.");
        }
    }
    
}
