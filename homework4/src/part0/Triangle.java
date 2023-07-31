package part0;

public class Triangle implements Figure {
    private final int side;
    private final int height;
    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }
    @Override
    public double area() {

        return 0.5*side*height;
    }
}
