import java.util.Scanner;

class AnagramCheck {
    public static boolean checkAnagram(String first, String second) {
        if (first.length() != second.length())
            return false;

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < first.length(); i++) {
            frequency1[first.charAt(i)]++;
            frequency2[second.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        if (checkAnagram(first, second))
            System.out.println("The strings are anagrams");
        else
            System.out.println("The strings are not anagrams");
    }
}
