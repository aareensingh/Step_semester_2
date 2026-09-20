import java.util.Scanner;

class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            int counter = 1;

            while (counter < number) {
                if (number % counter == 0)
                    System.out.println(counter);

                counter++;
            }
        }
    }
}
