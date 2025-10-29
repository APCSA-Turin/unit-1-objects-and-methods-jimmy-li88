package U1T12;

public class rightTrianglerunner {
    public static void main(String[] args) {
        rightTriangle triangle1 = new rightTriangle(3, 4);
        System.out.println("Hypotenuse: " + triangle1.getHypotenuse());
        rightTriangle triangle2 = new rightTriangle(6.5, 10.7);
        System.out.println("Hypotenuse: " + triangle2.getHypotenuse());
    }
}
