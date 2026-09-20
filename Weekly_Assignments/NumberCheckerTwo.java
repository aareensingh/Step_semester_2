import java.util.Scanner;

class NumberCheckerTwo {
    public static int countDigits(int number) {
        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static double sumSquareDigits(int[] digits) {
        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] digits = getDigits(number);

        System.out.println("Sum of digits = " + sumDigits(digits));
        System.out.println("Sum of squares = " + sumSquareDigits(digits));
        System.out.println("Harshad Number = " + isHarshad(number, digits));

        int[][] frequency = digitFrequency(digits);

        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " = " + frequency[i][1]);
            }
        }
    }
}
