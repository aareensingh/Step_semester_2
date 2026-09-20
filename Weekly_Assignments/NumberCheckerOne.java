import java.util.Scanner;

class NumberCheckerOne {
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

    public static boolean isDuck(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += (int)Math.pow(digits[i], digits.length);
        }

        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] digits = getDigits(number);

        int[] largest = findLargestAndSecondLargest(digits);
        int[] smallest = findSmallestAndSecondSmallest(digits);

        System.out.println("Count of digits = " + digits.length);
        System.out.println("Duck Number = " + isDuck(digits));
        System.out.println("Armstrong Number = " + isArmstrong(number, digits));
        System.out.println("Largest = " + largest[0]);
        System.out.println("Second Largest = " + largest[1]);
        System.out.println("Smallest = " + smallest[0]);
        System.out.println("Second Smallest = " + smallest[1]);
    }
}
