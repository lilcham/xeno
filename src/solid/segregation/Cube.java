package solid.segregation;

public class Cube implements Shape, SolidShape, ManageShape {
    @Override
    public double calculate() {
        return area() * volume();
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
