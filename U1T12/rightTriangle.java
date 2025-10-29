package U1T12;

public class rightTriangle {
    private double height; 
    private double base;

    public rightTriangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHypotenuse() {
        return Math.sqrt(height * height + base * base);
    }
}
