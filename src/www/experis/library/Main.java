package www.experis.library;

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

        // Stampo la lista dei libri solo se ci sono libri inseriti
        if (numBooks > 0) {
            System.out.println("Lista dei libri inseriti:");
            for (Book book : library) {
                if (book != null) {
                    System.out.println("Titolo: " + book.getTitle());
                    System.out.println("Autore: " + book.getAuthor());
                    System.out.println("Editore: " + book.getEditor());
                    System.out.println("Numero pagine: " + book.getNumPage());
                    System.out.println();
                }
            }
        } else {
            System.out.println("Nessun libro inserito, grazie e arrivederci.");
        }
    }
}
