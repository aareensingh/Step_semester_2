import java.util.Scanner;

class CharacterFrequency {
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++)
            frequency[text.charAt(i)]++;

        String[][] result = new String[text.length()][2];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[count][0] = String.valueOf(ch);
                result[count][1] = String.valueOf(frequency[ch]);
                count++;
            }
        }

        String[][] finalResult = new String[count][2];

        for (int i = 0; i < count; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
    }
}
