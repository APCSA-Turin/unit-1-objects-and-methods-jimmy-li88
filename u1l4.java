import java.util.Scanner;
public class u1l4 {
    public static void main(String[] args) {
        int answerAmt = 0;
        Scanner dollar = new Scanner(System.in);
        System.out.print("Enter the amount in dollars: ");
        double userDollar = dollar.nextDouble();
        dollar.nextLine();
        final double EURO = 0.85;
        final double JPY = 147.67;
        final double GBP = 0.74;
        final double RMB = 7.12;
        final double CHF = 0.79;
        double userEuro = userDollar; userEuro *= EURO;
        double userJPY = userDollar; userJPY *= JPY;
        double userGBP = userDollar; userGBP *= GBP;
        double userRMB = userDollar; userRMB *= RMB;
        double userCHF = userDollar; userCHF *= CHF;
        double userAverage = (userEuro*userDollar) + (userJPY*userDollar) + (userGBP*userDollar) + (userRMB*userDollar) + (userCHF*userDollar);
        userAverage /= 5;
        System.out.println(userDollar + " dollars is equal to: " + userEuro + " euros");
        System.out.println(userDollar + " dollars is equal to: " + userJPY + " Japanese yen");
        System.out.println(userDollar + " dollars is equal to: " + userGBP + " British pounds");
        System.out.println(userDollar + " dollars is equal to: " + userRMB + " Chinese yuan");
        System.out.println(userDollar + " dollars is equal to: " + userCHF + " Swiss francs");
        System.out.print("Would you like to add one or remove one dollar?(yes/no) ");
        String answer = dollar.nextLine();
        if (answer.equals("yes")) {
            userDollar += 1;
            answerAmt++;
                    System.out.println(userDollar + " dollars is equal to: " + userEuro + " euros");
                    System.out.println(userDollar + " dollars is equal to: " + userJPY + " Japanese yen");
                    System.out.println(userDollar + " dollars is equal to: " + userGBP + " British pounds");
                    System.out.println(userDollar + " dollars is equal to: " + userRMB + " Chinese yuan");
                    System.out.println(userDollar + " dollars is equal to: " + userCHF + " Swiss francs");
        } else if (answer.equals("no")) {
            userDollar -= 1;
            answerAmt--;
                    System.out.println(userDollar + " dollars is equal to: " + userEuro + " euros");
                    System.out.println(userDollar + " dollars is equal to: " + userJPY + " Japanese yen");
                    System.out.println(userDollar + " dollars is equal to: " + userGBP + " British pounds");
                    System.out.println(userDollar + " dollars is equal to: " + userRMB + " Chinese yuan");
                    System.out.println(userDollar + " dollars is equal to: " + userCHF + " Swiss francs");
        }
        System.out.println("You have changed the dollar amount by: " + answerAmt + " dollar(s).");
        System.out.println("The average of all the conversions is: " + userAverage);
    }
}