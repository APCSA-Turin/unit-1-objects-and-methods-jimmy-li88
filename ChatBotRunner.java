public class ChatBotRunner {

public static void main(String[] args) {
    ChatBot coba = new ChatBot("Coba", 7);
    coba.favDrink();
    coba.favFood();
    coba.funFact();
    coba.hobby();
    System.out.println("multiplied num = " + coba.multiplyNumbers(1, 2, 3));
    System.out.println("subtracted num = " + coba.subtractNumbers(5, 3));
}}
