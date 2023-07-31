package part0;

public class Circle implements Figure {
    private final int side;

    public Circle(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 3.14*side*side;
    }
}
