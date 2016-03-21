/**
 * Created by bartek on 20.03.16.
 */
public class Square extends Figure implements IPrint{
    private double edge;

    public Square(double edge) {
        this.edge = edge;
        calculateArea();
        calculatePerimeter();
    }


    @java.lang.Override
    public void calculateArea() {
        setArea(edge * edge);
    }

    @java.lang.Override
    public void calculatePerimeter() {
        setPerimeter(4 * edge
        );
    }

    @java.lang.Override
    public void print() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
