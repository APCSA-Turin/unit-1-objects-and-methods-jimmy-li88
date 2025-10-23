package U1T11Folder;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        int score = 0;
        int numWords = 0;
        Scanner guessWord = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word1 = guessWord.nextLine();

        while (score < 50) {
            System.out.println("enter a word: ");
            String word2 = guessWord.nextLine();
            numWords++;
            if (word1.compareTo(word2) < 0) {
                score += 2;
            }
            if (word1.compareTo(word2) > 0) {
                score -= 5;
            }
            if (word1.equals(word2)){ 
                score -= 10;
            }
            String lastLetters = word1.substring(word1.length() - 2);
            String firstLetters = word2.substring(0, 2);
            if (lastLetters.equals(firstLetters)) {
                score += 5;
            }
            String firstLetter = word1.substring(0, 1);
            if (word2.indexOf(firstLetter) != -1) {
                score += 3;
            }
            word1 = word2;
        }
    System.out.println("Final score: " + score);
    System.out.println("tries " + numWords);
}
}



