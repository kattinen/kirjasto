// Kirjasto
// App.java
// Kati Liukkonen
// Luokkien periytyminen ja abstrakti luokka
// Visual Studio code, Java 21, Maven

package main;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Library library = new Library();
        
        Scanner sc = new Scanner(System.in);
    
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää kirja");
            System.out.println("2) Listaa kirjat");
            System.out.println("3) Lainaa fiktiokirja");
            System.out.println("4) Palauta fiktiokirja");
            System.out.println("0) Lopeta ohjelma");
            
            if(sc.hasNext()) {
                int i = 0;
                String input = sc.nextLine();
                i = Integer.parseInt(input);
            
                switch (i) {
                    case 1:
                        // Lisää kirja
                        System.out.println("Minkä kirjan haluat lisätä kirjastoon? 1) Fiktiokirja, 2) Tietokirja");
                        String typeString = sc.nextLine();
                        int bookType = Integer.parseInt(typeString);
                        System.out.println("Anna kirjan nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna kirjailijan nimi:");
                        String author = sc.nextLine();
                        System.out.println("Anna sivumäärä:");
                        int pages = Integer.parseInt(sc.nextLine());
                        System.out.println("Anna kirjojen määrä:");
                        int copies = Integer.parseInt(sc.nextLine());
                        if (bookType == 1) {
                            FictionBook book = new FictionBook(name, author, pages, copies);
                            library.addBook(book);
                        } else if (bookType == 2) {
                            NonFictionBook book = new NonFictionBook(name, author, pages, copies);
                            library.addBook(book);
                        } else {
                            System.out.println("Virheellinen kirjatyyppi.");
                        }
                        break;
                    case 2:
                        // Listaa kirjat
                        break;
                    case 3:
                        // Lainaa fiktiokirja
                        break;
                    case 4:
                        // Palauta fiktiokirja
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                }
            }
        }
    sc.close();    
    }
}
