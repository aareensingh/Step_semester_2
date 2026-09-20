import java.util.Scanner;

class FactorsTasks {
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    public static double productCubeFactors(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] factors = findFactors(number);

        System.out.println("Greatest Factor = " + greatestFactor(factors));
        System.out.println("Sum of Factors = " + sumFactors(factors));
        System.out.println("Product of Factors = " + productFactors(factors));
        System.out.println("Product of Cubes of Factors = " + productCubeFactors(factors));
    }
}
