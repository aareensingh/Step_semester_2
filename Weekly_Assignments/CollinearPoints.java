import java.util.Scanner;

class CollinearPoints {
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(
            x1 * (y2 - y3) +
            x2 * (y3 - y1) +
            x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        System.out.println("Collinear using Slope = " + areCollinearBySlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear using Area = " + areCollinearByArea(x1, y1, x2, y2, x3, y3));
    }
}
