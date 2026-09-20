import java.util.Scanner;

class LeapYearLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("The year " + year + " is a Leap Year");
        } else {
            System.out.println("The year " + year + " is not a Leap Year");
        }
    }
}
