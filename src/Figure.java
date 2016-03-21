/**
 * Created by bartek on 20.03.16.
 */
public abstract class Figure {
    private double area;
    private double perimeter;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
