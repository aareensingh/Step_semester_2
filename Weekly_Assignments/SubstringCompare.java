import java.util.Scanner;

class SubstringCompare {
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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

        String text = input.next();
        int start = input.nextInt();
        int end = input.nextInt();

        String userSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("User Defined Substring = " + userSubstring);
        System.out.println("Built-In Substring = " + builtInSubstring);
        System.out.println("Both results are same = " + compareStrings(userSubstring, builtInSubstring));
    }
}
