import java.util.Scanner;

class RandomArrayStatistics {
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }

        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            minimum = Math.min(minimum, numbers[i]);
            maximum = Math.max(maximum, numbers[i]);
        }

        double average = sum / numbers.length;

        return new double[]{average, minimum, maximum};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = 5;

        int[] numbers = generate4DigitRandomArray(size);
        double[] result = findAverageMinMax(numbers);

        System.out.println("Random numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + (int)result[1]);
        System.out.println("Maximum = " + (int)result[2]);
    }
}
