import java.util.Scanner;

class UpperCaseCompare {
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (character >= 'a' && character <= 'z') {
                character = (char)(character - 32);
            }

            result += character;
        }

        return result;
    }

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

        String text = input.nextLine();

        String userResult = convertToUpperCase(text);
        String builtInResult = text.toUpperCase();

        System.out.println("User Defined Result = " + userResult);
        System.out.println("Built-In Result = " + builtInResult);
        System.out.println("Both results are same = " + compareStrings(userResult, builtInResult));
    }
}
