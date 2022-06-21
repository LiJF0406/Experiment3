package graphics;

public class Rectangle extends Graphics{
    private double length;
    private double height;

    public Rectangle(){
        this(0,0);
    }
    public Rectangle(double length,double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+height);
    }

    @Override
    public double getArea() {
        return length*height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
