public class quiz {

    public static void main(String[] args) {
        double len1 = 0.1;
        double len2 = 0.05;
        double len3 = 0.1;
        double total = len1 + len2 + len3;
        int minLength = (int) (total + 0.5);
        System.out.println(minLength);
    }
}
