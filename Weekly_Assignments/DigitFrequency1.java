import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int temp = number;
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        temp = number;

        if (number == 0) {
            digits[0] = 0;
        } else {
            for (int i = 0; i < digits.length; i++) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }
        }

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of " + i + " = " + frequency[i]);
            }
        }
    }
}
