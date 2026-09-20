import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double height = input.nextDouble();

        height = height / 100;
        double bmi = weight / (height * height);

        if (bmi <= 18.4) {
            System.out.println("BMI: " + bmi);
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("BMI: " + bmi);
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("BMI: " + bmi);
            System.out.println("Status: Overweight");
        } else {
            System.out.println("BMI: " + bmi);
            System.out.println("Status: Obese");
        }
    }
}
