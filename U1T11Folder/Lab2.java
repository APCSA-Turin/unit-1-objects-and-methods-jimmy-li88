package U1T11Folder;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner equalWords = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = equalWords.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = equalWords.nextLine();
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
    }
}
}
