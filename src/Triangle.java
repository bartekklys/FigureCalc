/**
 * Created by bartek on 20.03.16.
 */
public class Triangle extends Figure implements IPrint{

    private double edge;
    private double height;

    public Triangle(double edge) {
        this.edge = edge;
        calculateArea();
        calculatePerimeter();
    }

    @java.lang.Override
    public void calculateArea() {
        height = Math.sqrt(Math.pow(edge,2) - Math.pow((edge/2),2));
        setArea((edge * height)/2);
    }

    @java.lang.Override
    public void calculatePerimeter() {
        setPerimeter(edge * 3);
    }

    @Override
    public void print() {
        System.out.println("Pole: "+getArea());
        System.out.println("Obw: "+getPerimeter());

    }
}
