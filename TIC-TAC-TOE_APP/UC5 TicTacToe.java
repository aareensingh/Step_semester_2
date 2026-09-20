public class TicTacToe {
    public static boolean isValidMove(char[][] board, int row, int column) {
        return row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == '-';
    }

    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        int row = 1;
        int column = 1;

        if (isValidMove(board, row, column)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}
