import java.util.Scanner;

class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number: ");

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
