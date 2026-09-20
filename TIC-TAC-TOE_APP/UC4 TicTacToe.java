public class TicTacToe {
    public static int[] convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int column = (slot - 1) % 3;
        return new int[]{row, column};
    }

    public static void main(String[] args) {
        int slot = 5;

        int[] position = convertSlot(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}
