import java.util.Scanner;

class PoundsToKg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double kg = weight / 2.2;

        System.out.println("The weight of the person in pounds is " + weight + " and in kg is " + kg);
    }
}
