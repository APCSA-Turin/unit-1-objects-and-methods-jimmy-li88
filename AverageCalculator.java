import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
    Scanner testScore = new Scanner(System.in);
    System.out.print("Enter your first test score: ");
    double score1 = testScore.nextDouble();
    testScore.nextLine();
    System.out.print("Enter your second test score: ");
    double score2 = testScore.nextDouble();
    testScore.nextLine();
    System.out.print("Enter your third test score: ");
    double score3 = testScore.nextDouble();
    testScore.nextLine();
    System.out.print("Enter your fourth test score: ");
    double score4 = testScore.nextDouble();
    testScore.nextLine();
    double average = (score1 + score2 + score3 + score4) / 4;
    System.out.println("The average of your test scores is: " + average);
    System.out.println("The average rounded to the nearest whole number is: " + Math.round(average));
    if (Math.round(average) >= 65) {
        System.out.println("You passed!");
    } else {
        System.out.println("You failed.");
    }
}
}