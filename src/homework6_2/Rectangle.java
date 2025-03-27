package homework6_2;

public class Rectangle extends Figure {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}
