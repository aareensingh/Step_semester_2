import java.util.Scanner;

class UniqueCharacters {
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

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique)
                temp[count++] = text.charAt(i);
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] result = findUniqueCharacters(text);

        System.out.println("Unique characters:");

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
