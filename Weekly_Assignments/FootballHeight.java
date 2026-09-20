class FootballHeight {
    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        return sum;
    }

    public static double findMean(int[] heights) {
        return (double)findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }

        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.println("Heights:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i]);
        }

        System.out.println("Shortest Height = " + findShortest(heights));
        System.out.println("Tallest Height = " + findTallest(heights));
        System.out.println("Mean Height = " + findMean(heights));
    }
}
