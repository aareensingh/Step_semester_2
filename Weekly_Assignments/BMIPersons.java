import java.util.Scanner;

class BMIPersons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            if (weight[i] < 0 || height[i] < 0) {
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            double heightInMeter = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + height[i]);
            System.out.println("Weight: " + weight[i]);
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }
    }
}
