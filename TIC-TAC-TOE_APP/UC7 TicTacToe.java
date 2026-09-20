import java.util.Random;

public class TicTacToe {
    public static void makeComputerMove(char[][] board, char symbol) {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1;
            int row = (slot - 1) / 3;
            int column = (slot - 1) % 3;

            if (board[row][column] == '-') {
                board[row][column] = symbol;
                System.out.println("Computer selected slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        makeComputerMove(board, 'O');

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
