import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }

        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();

            if (checker.canStudentVote(ages[i])) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }
    }
}
