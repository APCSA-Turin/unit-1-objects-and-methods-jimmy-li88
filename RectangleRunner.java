import java.util.Scanner;

public class RectangleRunner {
    int len = 65;
    int wid = len + 10;
    Rectangle rect1 = new Rectangle(len, wid);
    Rectangle rect2 = new Rectangle(10.0, 30.0);
    Rectangle rect3 = new Rectangle(0);

    public static void main(String[] args) {
        
    }
}
// //   System.out.println("plot 1 length" + rect1.getLength());
//         System.out.println("plot 1 width" + rect1.getWidth());
//         System.out.println("plot 1 area" + rect1.calculateArea());
//         System.out.println("plot 2 length" + rect2.getLength());
//         System.out.println("plot 2 width" + rect2.getWidth());
//         System.out.println("plot 2 area" + rect2.calculateArea());
//         System.out.println("plot 3 length" + rect3.getLength());
//         System.out.println("plot 3 width" + rect3.getWidth());
//         System.out.println("plot 3 area" + rect3.calculateArea());

// //Rectangle rect1 = new Rectangle(150, 200);
//         Rectangle rect2 = new Rectangle(125);
//         Rectangle rect3 = new Rectangle();
//         rect1.setWidth(75);
//         rect2.setWidth(75);
//         rect3.setWidth(75);
//         rect2.setLength(75);
//         System.out.println("the three plots requires " + (rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea()) + " square feet of sod");