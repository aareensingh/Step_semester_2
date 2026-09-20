import java.util.Scanner;

class Handshakes {
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
