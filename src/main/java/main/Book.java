// Kirjasto
// Book.java
// Kati Liukkonen
// Luokkien periytyminen ja abstrakti luokka
// Visual Studio code, Java 21, Maven

package main;

public abstract class Book {
    String title;
    String author;
    int pages;
    int copies;

    public Book(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }

    public void displayInfo() {
        System.out.println("Nimi: " + title +", Kirjailija: " + author + ", Sivut: " + pages + ", Määrä: " + copies);
    }

    public abstract void categorize();
    
}



