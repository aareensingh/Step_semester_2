import java.util.Scanner;

class DistanceAndLine {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(
            Math.pow(x2 - x1, 2) +
            Math.pow(y2 - y1, 2)
        );
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;

        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Slope = " + line[0]);
        System.out.println("Y-Intercept = " + line[1]);
        System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
    }
}
