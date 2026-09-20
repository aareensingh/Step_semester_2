import java.util.Scanner;

class SimpleInterestMethod {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
