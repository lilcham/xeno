package solid.single;

public class Circle implements Shape {
    private double _radius = 0;

    public Circle(double radius) {
        _radius = radius;
    }

    public double calculateArea() {
        return 3.14 * Math.pow(_radius, 2);
    }
}
