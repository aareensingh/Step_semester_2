import java.util.Scanner;

class NaturalNumberRecursive {
    public static int recursiveSum(int number) {
        if (number == 0) {
            return 0;
        }

        return number + recursiveSum(number - 1);
    }

    public static int formulaSum(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            int recursiveResult = recursiveSum(number);
            int formulaResult = formulaSum(number);

            System.out.println("Sum using recursion = " + recursiveResult);
            System.out.println("Sum using formula = " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both computations are correct");
            } else {
                System.out.println("Both computations are not correct");
            }
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
