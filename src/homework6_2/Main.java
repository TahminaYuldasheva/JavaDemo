package homework6_2;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(5, 4, 3),
                new Rectangle(3, 6),
                new Circle(4),
                new Rectangle(7, 2),
                new Triangle(6, 5, 5)
        };

        double totalPerimeter = 0;
        double totalArea = 0;

        for (Figure figure : figures) {
            totalPerimeter += figure.perimeter();
            totalArea += figure.square();
        }
        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
        System.out.println("Сумма площадей всех фигур: " + totalArea);

    }
}

