import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int d1 = a + b * c;
        int d2 = a * b + c;
        int d3 = c + a / b;
        int d4 = a % b + c;

        System.out.println("The results of Int Operations are " + d1 + ", " + d2 + ", " + d3 + ", and " + d4);
    }
}
