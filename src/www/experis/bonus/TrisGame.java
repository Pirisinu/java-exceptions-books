package www.experis.bonus;

public class TrisGame {
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
