package solid.single;

import java.util.List;

public class AreaCalculator {
    private List<Shape> _shapes;

    public AreaCalculator(List<Shape> shapes) {
        _shapes = shapes;
    }

    public double sumArea() {
        double totalArea = 0;

        for (Shape shape : _shapes) {
            totalArea += shape.calculateArea();
        }

        return totalArea;
    }

    public void outPut() {
        System.out.println("Total are: " + this.sumArea());
    }
}
