import java.util.Scanner;

public class TicTacToe {
    public static int getUserSlot(Scanner scanner) {
        System.out.print("Enter slot (1-9): ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int slot = getUserSlot(scanner);

        System.out.println("Selected Slot: " + slot);
    }
}
