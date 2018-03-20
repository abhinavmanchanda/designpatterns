

 class Triangle {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC  = sideC;
    }
    public Triangle(double sideA, double sideB)
    {
        //for isosceles triangle
        
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideB;
      
    }
  
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
}
public class Solution{
    public static void main(String[]args)
      {
        Triangle triangle1=new Triangle(5,3,4);
        System.out.println(triangle1.perimeter());
        System.out.println(triangle1.area());
        Triangle triangle2=new Triangle(8,5);
        System.out.println(triangle2.perimeter());
        System.out.println(triangle2.area());
        
    }
}
