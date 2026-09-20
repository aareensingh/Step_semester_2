import java.util.Scanner;

class RockPaperScissors {
    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int draws, int games) {
        double userPercentage = (userWins * 100.0) / games;
        double computerPercentage = (computerWins * 100.0) / games;

        return new String[][]{
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"Draws", String.valueOf(draws)},
            {"User Win %", String.valueOf(userPercentage)},
            {"Computer Win %", String.valueOf(computerPercentage)}
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter Rock, Paper or Scissors: ");
            String user = sc.next();

            user = user.substring(0, 1).toUpperCase() + user.substring(1).toLowerCase();

            String computer = computerChoice();
            String winner = findWinner(user, computer);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;
            else
                draws++;

            System.out.println("Game " + i + ": User = " + user + ", Computer = " + computer + ", Winner = " + winner);
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, games);

        System.out.println("\nResult");
        for (int i = 0; i < stats.length; i++)
            System.out.println(stats[i][0] + ": " + stats[i][1]);
    }
}
