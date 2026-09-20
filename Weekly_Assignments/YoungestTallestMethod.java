import java.util.Scanner;

class YoungestTallestMethod {
    public static int findYoungest(int[] ages) {
        int youngest = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }

        return youngest;
    }

    public static int findTallest(double[] heights) {
        int tallest = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("The youngest friend is " + names[youngest]);
        System.out.println("The tallest friend is " + names[tallest]);
    }
}
