package graphics;

public class GraphicsTest {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        c.show();

        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.show();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3);
        equilateralTriangle.show();
    }
}
