class StudentScorecard {
    public static double[][] generateScores(int numberOfStudents) {
        double[][] scores = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90);
            scores[i][2] = 10 + (int)(Math.random() * 90);
        }

        return scores;
    }

    public static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = total / 3;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    public static void displayScorecard(double[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2]
            );
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5;

        double[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);
    }
}
