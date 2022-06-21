package graphics;

public class EquilateralTriangle extends Graphics{
    private double sideLength;

    public EquilateralTriangle(){
        sideLength = 0;
    }
    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return 3*sideLength;
    }

    @Override
    public double getArea() {
        return sideLength*sideLength*Math.sqrt(3)/4;
    }

}
