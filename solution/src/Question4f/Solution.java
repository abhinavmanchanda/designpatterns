

 class Triangle  {

    private final double sideA;
    private final double sideB;
    private final double sideC;
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideB;
    }
   public double area() {
        double halfPerimeter = (sideA+sideB+sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
 }

class IsocelesTriangle extends Triangle{
    public IsocelesTriangle(double base, double equalSide){
        super(base, equalSide, equalSide);
    }
}

class RightangledTriangle extends Triangle{
    public RightangledTriangle(double base, double height){
        super(base, height, Math.sqrt(base*base+height*height));
    }
}
   
 public class Solution{
    public static void main(String[]args)
      {
        Triangle triangle=new Triangle(5,3,4);
        System.out.println(triangle.area());
        IsocelesTriangle isoceles=new IsocelesTriangle(8,5);
        System.out.println(isoceles.area());
        RightangledTriangle rightAngledTriangle=new RightangledTriangle(4,3);
        System.out.println(rightAngledTriangle.area());
    }
}
