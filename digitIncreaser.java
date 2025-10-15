import java.util.Scanner;
public class digitIncreaser {
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        System.out.print("Type in a decimal number between 100.00 to 999.99: ");
        double userDecimal = userNum.nextDouble();
        userNum.nextLine();
        int whole = (int) Math.round(userDecimal*100);
        int pos1 = (whole / 10000) % 10;
        int pos2 = (whole / 1000) % 10;
        int pos3 = (whole / 100) % 10;
        int pos4 = (whole / 10) % 10;
        int pos5 = whole % 10;
        
        pos1 = (pos1 + 1) % 10;
        pos2 = (pos2 + 1) % 10;
        pos3 = (pos3 + 1) % 10;
        pos4 = (pos4 + 1) % 10;
        pos5 = (pos5 + 1) % 10;

        
        System.out.println("The original number is: " + userDecimal);
        System.out.println("The new number is: " + pos1 + "" + pos2 + "" + pos3 + "." + pos4 + "" + pos5);
    }
}