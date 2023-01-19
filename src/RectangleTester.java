import java.util.*;

public class RectangleTester {

    public static void main(String[] args) {

        System.out.println("Please enter a Height: ");
        Scanner scan = new Scanner(System.in);
        double height = scan.nextDouble();

        System.out.println("Please enter a width");
        scan = new Scanner(System.in);
        double width = scan.nextDouble();

        Rectangle Rect1 = new Rectangle(height, width);
        Rectangle Rect2 = new Rectangle(60, 30);

        System.out.println(Rect1.getArea());
        System.out.println(Rect2.getArea());

        System.out.println(Rect1.getPerimeter());
        System.out.println(Rect2.getPerimeter());

    }
}
