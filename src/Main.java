import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(0);

        // circle
        Circle circle = new Circle(point, 0);
        point.display();
        circle.display();
        circle.moveRight(20);
        circle.display();

        // rectangle extends Polygon
        System.out.println();
        Rectangle rect  = new Rectangle(point, 10, 10);
        System.out.println(rect.toString());
        rect.moveRight(10);
        rect.display();

        // triangle extends Polygon
        System.out.println();
        Triangle triangle  = new Triangle(new Point(4), new Point(5), new Point(6));
        triangle.display();
        triangle.moveDown(10);
        triangle.display();

    }
}