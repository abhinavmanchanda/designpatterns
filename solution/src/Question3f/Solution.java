
package Question3f;

 class Question3f {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Question3f(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC  = sideC;
    }
    public Question3f(double sideA, double sideB)
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
        Question3f q=new Question3f(5,3,4);
        System.out.println(q.perimeter());
        System.out.println(q.area());
        Question3f q1=new Question3f(8,5);
        System.out.println(q.perimeter());
        System.out.println(q.area());
        
    }
}