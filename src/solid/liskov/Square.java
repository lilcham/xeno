package solid.liskov;

public class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setLength(height);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setHeight(length);
    }
}
