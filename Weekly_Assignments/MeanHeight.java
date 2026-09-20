import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum = sum + heights[i];
        }

        double mean = sum / 11;

        System.out.println("The mean height of the football team is " + mean);
    }
}
