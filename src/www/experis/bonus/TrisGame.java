package www.experis.bonus;

public class TrisGame {
    // Genero la tabella
    // Genero i giocatori

    // ***Do***
    // Inizia giocatore A
    // Sceglie casella X-Y
    // La casella è gia occupata? || La selezione fa vincere la partita?
    // ***WHILE(la casella è l'ultima la partita finisce in pareggio)***

    public static void main(String[] args) {
        final int width = 3;
        final int heigth = 3;
        char[][] board = new char[width][heigth];

        printBoard(board);
    }
    public static  void printBoard(char[][] board){
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
