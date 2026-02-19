// Kirjasto
// App.java
// Kati Liukkonen
// Luokkien periytyminen ja abstrakti luokka
// Visual Studio code, Java 21, Maven

package main;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
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
                String input = sc.next();
                i = Integer.parseInt(input);
            
                switch (i) {
                    case 1:
                        // Lisää kirja
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
