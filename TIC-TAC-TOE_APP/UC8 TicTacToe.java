import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    public static boolean isWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
                return true;
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;
    }

    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        char playerSymbol = 'X';
        char computerSymbol = 'O';
        boolean playerTurn = random.nextBoolean();
        boolean gameOver = false;

        while (!gameOver) {
            displayBoard(board);

            if (playerTurn) {
                System.out.print("Enter slot (1-9): ");
                int slot = scanner.nextInt();

                int row = (slot - 1) / 3;
                int column = (slot - 1) % 3;

                if (slot >= 1 && slot <= 9 && board[row][column] == '-') {
                    board[row][column] = playerSymbol;

                    if (isWin(board, playerSymbol)) {
                        displayBoard(board);
                        System.out.println("Player wins!");
                        gameOver = true;
                    } else if (isDraw(board)) {
                        displayBoard(board);
                        System.out.println("Game Draw!");
                        gameOver = true;
                    } else {
                        playerTurn = false;
                    }
                } else {
                    System.out.println("Invalid move!");
                }
            } else {
                int slot;

                do {
                    slot = random.nextInt(9) + 1;
                } while (board[(slot - 1) / 3][(slot - 1) % 3] != '-');

                int row = (slot - 1) / 3;
                int column = (slot - 1) % 3;

                board[row][column] = computerSymbol;
                System.out.println("Computer selected slot: " + slot);

                if (isWin(board, computerSymbol)) {
                    displayBoard(board);
                    System.out.println("Computer wins!");
                    gameOver = true;
                } else if (isDraw(board)) {
                    displayBoard(board);
                    System.out.println("Game Draw!");
                    gameOver = true;
                } else {
                    playerTurn = true;
                }
            }
        }

        scanner.close();
    }
}
