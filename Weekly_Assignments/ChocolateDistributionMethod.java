import java.util.Scanner;

class ChocolateDistributionMethod {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("The number of chocolates each child gets is " + result[0] + " and the number of remaining chocolates are " + result[1]);
    }
}
