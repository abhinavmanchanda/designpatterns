package shapes;

public class Rectangle {

    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float area() {
        return length * breadth;
    }

    public float perimeter() {
        return 2 * length * breadth;
    }

    public static Rectangle createSquare(int s) {
        return new Rectangle(s, s);
    }
}
