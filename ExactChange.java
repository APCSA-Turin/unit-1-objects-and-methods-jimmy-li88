import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner dolAmt = new Scanner(System.in);
        System.out.print("Enter your dollar amount: ");
        double dollarAmount = dolAmt.nextDouble();
        
        // first see how many quarters, then how many dimes, nickels, pennies
        int quarterAmount = (int) (dollarAmount / 0.25);
        dollarAmount -= (quarterAmount * 0.25);
        
        int dimeAmount = (int) (dollarAmount / 0.1);
        dollarAmount -= (dimeAmount * 0.1);
        
        int nickelAmount = (int) (dollarAmount / 0.05);
        dollarAmount -= (nickelAmount * 0.05);
        
        int pennyAmount = (int) (dollarAmount / 0.01);
        int totalCoins = quarterAmount + dimeAmount + nickelAmount + pennyAmount;
        System.out.println("there are " + quarterAmount + " quarters");
        System.out.println("there are " + dimeAmount + " dimes");
        System.out.println("there are " + nickelAmount + " nickels");
        System.out.println("there are " + pennyAmount + " pennies");
        System.out.println("Total coins: " + totalCoins);
        dolAmt.close();
    }
}