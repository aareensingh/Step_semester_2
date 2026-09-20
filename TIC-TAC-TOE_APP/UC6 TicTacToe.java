public class TicTacToe {
    public static void placeMove(char[][] board, int row, int column, char symbol) {
        board[row][column] = symbol;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        int row = 1;
        int column = 1;
        char symbol = 'X';

        placeMove(board, row, column, symbol);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
