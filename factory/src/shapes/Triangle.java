package shapes;

public class Triangle {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    public static Triangle createIsoceles(int base, int equalSide) {
        return new Triangle(base, equalSide, equalSide);
    }

    public static Triangle createRightAngled(int base, int height) {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return new Triangle(base, height, hypotenuse);
    }
}

// TODO code application logic here

