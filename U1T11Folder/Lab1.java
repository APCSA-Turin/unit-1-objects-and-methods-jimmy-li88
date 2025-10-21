
package U1T11Folder;
import java.util.Scanner;
public class Lab1 {

    public static void main(String[] args) {
        Scanner askWord = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = askWord.nextLine();
        System.out.println("enter another word: ");
        String word2 = askWord.nextLine();
        if (word.length() > word2.length()) {
            System.out.println("The first word is longer.");
        } else if (word.length() < word2.length()) {
            System.out.println("The second word is longer.");
        } else {
            System.out.println("Both words are the same length.");
        }
        System.out.println("first half of word 1: " + word.substring(0, word.length() / 2));
        System.out.println("second half of word 1: " + word.substring(word.length() / 2));
        System.out.println("first half of word 2: " + word2.substring(0, word2.length() / 2));
        System.out.println("second half of word 2: " + word2.substring(word2.length() / 2));
        int check = word.indexOf(word2);
        
        if (check == -1) {
            System.out.println("the second word is not in the first word");
        } else {
            System.out.println("the second word is in the first word at index " + check);
    }
}
}
