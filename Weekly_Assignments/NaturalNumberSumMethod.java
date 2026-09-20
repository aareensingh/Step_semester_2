import java.util.Scanner;

class NaturalNumberSumMethod {
    public static int findSum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int sum = findSum(number);

        System.out.println("The sum of " + number + " natural numbers is " + sum);
    }
}
