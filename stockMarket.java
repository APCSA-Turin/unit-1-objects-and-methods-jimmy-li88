import java.util.Scanner;

public class stockMarket {
    public static void main(String[] args) {
        Scanner stock = new Scanner(System.in);
        System.out.print("Enter the stock ticker: ");
        String stockTicker = stock.nextLine();
        System.out.print("Enter the number of shares: ");
        int shareNum = stock.nextInt();
        System.out.print("Enter the change in stock price as a positive or negative decimal: ");
        double stockChange = stock.nextDouble();
        stock.nextLine();
        System.out.println("change in stock value: " + Math.round(shareNum * stockChange));
    }
}