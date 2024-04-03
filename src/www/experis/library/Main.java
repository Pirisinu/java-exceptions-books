package www.experis.library;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Benevenuto nella libreria!");
        Scanner scan = new Scanner(System.in);

        // Aggiungo exception per input utente
        System.out.println("Quanti libri vuoi inserire?");
        int numBooks = 0;
        try {
            numBooks = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input non valido. Si prega di inserire un numero.");
        }
        // Inizzializzo l'array
        Book[] library = new Book[numBooks];

        for (int i = 0; i < library.length; i++) {
            System.out.println("Inserimento del libro n°" + (i + 1) + ":");
            try {
                System.out.print("Titolo: ");
                String title = scan.nextLine();

                System.out.print("Autore: ");
                String author = scan.nextLine();

                System.out.print("Editore: ");
                String editor = scan.nextLine();

                System.out.print("Numero pagine: ");

                int numPages = 0;
                try {
                    numPages = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException ignored){
                    System.out.println("Devi inserire un numero!!");
                }

                // Aggiungo all'array
                library[i] = new Book(title, author, editor, numPages);

            } catch (Book.NotEmptyStringPls | Book.NoZeroPage e){
                System.out.println("Errore: " + e.getMessage() + " Riprova.");
                // torno dietro per reinserire il libro
                i--;
            }
        }


        // Scrivi i dati dei libri su un file
        try (FileWriter writer = new FileWriter("resources/library.txt")) {
            for (Book book : library) {
                if (book != null) {
                    writer.write(book.getFullInfo() + "\n");
                }
            }
            System.out.println("Dati dei libri scritti su file con successo.");
        } catch (IOException e) {
            System.out.println("Si è verificato un errore durante la scrittura su file: " + e.getMessage());
        }

        // Leggo i dati dal file
        try (Scanner scanner = new Scanner(new File("resources/library.txt"))) {
            System.out.println("Dati dei libri letti dal file: ");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Il file non è stato trovato: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Si è verificato un errore durante la lettura dal file: " + e.getMessage());
        }
    }
}
