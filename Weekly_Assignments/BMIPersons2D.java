import java.util.Scanner;

class BMIPersons2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight = input.nextDouble();
            double height = input.nextDouble();

            if (weight < 0 || height < 0) {
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double heightInMeter = height / 100;
            personData[i][2] = weight / (heightInMeter * heightInMeter);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + personData[i][1]);
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
    }
}
