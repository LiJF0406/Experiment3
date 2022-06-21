package graphics;

public abstract class Graphics {
    public abstract double getPerimeter();
    public abstract double getArea();
    public void show(){
        System.out.print("这是一个圆，周长是");
        System.out.print(getPerimeter());
        System.out.print("，面积是");
        System.out.println(getArea());
    }
}
