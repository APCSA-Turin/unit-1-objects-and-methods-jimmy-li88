public class Receipt {
    public static void main(String[] args) {
        String customer = "Stacey";
        double moneyGot = 40.00;
        double applePrice = 0.60;
        double pinapplePrice = 3.59;
        double ricePrice = 1.39;
        final double LB = 2.2;
        int appleQnt = 1; 
        int pinappleQnt = 2;
        int riceQnt = 3;
        int totalQnt = appleQnt + pinappleQnt + riceQnt;
        System.out.println("--------------------------------");
        System.out.println("Customer: " + customer);
        System.out.println("Apple: $" + applePrice);
        System.out.println("Pineapple: $" + pinapplePrice);
        System.out.println("Rice: $" + ricePrice);
        System.out.println("total amount of items:" + totalQnt);
        System.out.println("Total price: $" + (applePrice + (pinapplePrice*2) + (3*2*LB* ricePrice)));
        System.out.println("average amount per item: $" + (applePrice + (pinapplePrice*2) + (3*2*LB* ricePrice))/6);
        System.out.println("Cash given: $" + moneyGot);
        System.out.println("change: $" + (moneyGot - (applePrice + (pinapplePrice*2) + (3*2*LB* ricePrice))));
        System.out.println("--------------------------------");
    }
}
