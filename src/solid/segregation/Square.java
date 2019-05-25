package solid.segregation;

public class Square implements Shape, ManageShape {
    @Override
    public double calculate() {
        return area();
    }

    @Override
    public double area() {
        return 0;
    }
}
