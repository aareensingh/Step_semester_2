import java.util.Scanner;

class BMIMethod {
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1] / 100;

            personData[i][2] = weight / (height * height);
        }
    }

    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] personData = new double[10][3];

        for (int i = 0; i < personData.length; i++) {
            personData[i][0] = input.nextDouble();
            personData[i][1] = input.nextDouble();
        }

        calculateBMI(personData);

        String[] status = determineBMIStatus(personData);

        for (int i = 0; i < personData.length; i++) {
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("Height: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + status[i]);
        }
    }
}
