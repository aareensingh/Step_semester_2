import java.util.Scanner;

class NumberCheckerThree {
    public static int[] getDigits(int number) {
        int temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }

        return reverse;
    }

    public static boolean compareArrays(int[] first, int[] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    public static boolean isDuck(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] digits = getDigits(number);
        int[] reverse = reverseArray(digits);

        System.out.println("Palindrome Number = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuck(digits));
    }
}
