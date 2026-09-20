import java.util.Scanner;

class ShortestLongest {
    public static String[] splitWords(String text) {
        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++)
                    word += text.charAt(j);
                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

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

    public static String[][] wordLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static int[] findShortestLongest(String[][] words) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < words.length; i++) {
            int current = Integer.parseInt(words[i][1]);
            int shortLength = Integer.parseInt(words[shortest][1]);
            int longLength = Integer.parseInt(words[longest][1]);

            if (current < shortLength)
                shortest = i;

            if (current > longLength)
                longest = i;
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = wordLength(words);
        int[] indexes = findShortestLongest(result);

        System.out.println("Shortest String: " + result[indexes[0]][0]);
        System.out.println("Longest String: " + result[indexes[1]][0]);
    }
}
