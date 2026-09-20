import java.util.Scanner;

class NestedFrequency {
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0')
                continue;

            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        String[] result = new String[text.length()];
        int count = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[count] = characters[i] + " = " + frequency[i];
                count++;
            }
        }

        String[] finalResult = new String[count];

        for (int i = 0; i < count; i++)
            finalResult[i] = result[i];

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
