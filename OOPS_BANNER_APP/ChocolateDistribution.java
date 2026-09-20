import java.util.Scanner;

class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        int eachChild = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + eachChild + " and the number of remaining chocolates are " + remaining);
    }
}
