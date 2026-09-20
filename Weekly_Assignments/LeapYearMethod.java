import java.util.Scanner;

class LeapYearMethod {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }

        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a Leap Year");
        } else {
            System.out.println("The year " + year + " is not a Leap Year");
        }
    }
}
