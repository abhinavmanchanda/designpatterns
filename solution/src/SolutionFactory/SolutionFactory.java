
package SolutionFactory;
class Triangle {

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
 class Rectangle {

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
class Solution
{
    public static void main(String[]args)
    {
       
         System.out.println(Triangle.createIsoceles(8,5).area());
        
    }
}

