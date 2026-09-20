import java.util.Scanner;

class IllegalArgumentExceptionDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(text.length(), 0));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(text.length(), 0));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.next();

        handleException(text);
    }
}
