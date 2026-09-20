import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            number = Math.abs(number);

            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("The number of digits is " + count);
    }
}
