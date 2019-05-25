package solid.single;

public class Square implements Shape {
    private double _length = 0;
    private double _height = 0;

    public Square(double height, double length) {
        _height = height;
        _length = length;
    }

    public double calculateArea() {
        return _height * _length;
    }
}
