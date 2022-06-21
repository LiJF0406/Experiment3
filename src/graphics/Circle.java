package graphics;

public class Circle extends Graphics{
    private double radius;
    private static final double PI = 3.1415926;

    Circle(){
        radius = 0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
