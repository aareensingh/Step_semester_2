import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        Random random = new Random();

        int toss = random.nextInt(2);

        char playerSymbol;
        char computerSymbol;
        String currentPlayer;

        if (toss == 0) {
            playerSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = "Player";
        } else {
            playerSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = "Computer";
        }

        System.out.println("Player Symbol: " + playerSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("First Turn: " + currentPlayer);
    }
}
