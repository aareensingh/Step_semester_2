import java.util.Scanner;

class StringLength {
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int result = findLength(text);

        System.out.println("Length using user-defined method: " + result);
        System.out.println("Length using length(): " + text.length());
    }
}
