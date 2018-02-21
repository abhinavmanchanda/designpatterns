package shapes;

public class Rectangle {

    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        //To change body of generated methods, choose Tools | Templates.
        this.breadth = breadth;
    }

    public float area() {
        return length * breadth;
    }
}
