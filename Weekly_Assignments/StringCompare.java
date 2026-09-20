import java.util.Scanner;

class StringCompare {
    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.next();
        String second = input.next();

        boolean userResult = compareStrings(first, second);
        boolean builtInResult = first.equals(second);

        System.out.println("User Defined Result = " + userResult);
        System.out.println("Built-In Result = " + builtInResult);
        System.out.println("Both results are same = " + (userResult == builtInResult));
    }
}
