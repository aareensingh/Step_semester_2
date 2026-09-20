import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double d1 = a + b * c;
        double d2 = a * b + c;
        double d3 = c + a / b;
        double d4 = a % b + c;

        System.out.println("The results of Double Operations are " + d1 + ", " + d2 + ", " + d3 + ", and " + d4);
    }
}
