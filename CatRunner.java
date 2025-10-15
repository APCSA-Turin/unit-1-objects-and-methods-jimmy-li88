public class CatRunner{
    public static void main(String[] args) {

        Cat cat1 = new Cat("coba", 3, 4.5);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("bear", 8, 6.0);
        cat2.printCatInfo();
        cat2.introduce();
        
}}
