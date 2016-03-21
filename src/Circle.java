/**
 * Created by bartek on 20.03.16.
 */
public class Circle extends Figure implements IPrint {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    @java.lang.Override
    public void calculateArea() {
        setArea(3.14*radius*radius);;
    }

    @java.lang.Override
    public void calculatePerimeter() {
        setPerimeter(6.28*radius);
    }

    @java.lang.Override
    public void print() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
