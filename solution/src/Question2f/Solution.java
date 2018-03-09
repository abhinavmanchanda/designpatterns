interface Shape {

    float area();
    
}

 class Circle implements Shape {

    private int radius;
    Circle(int radius)
    {
        this.radius=radius;
    }
    public float area()
    {
       return(float) (2*(3.14*radius*radius)+6); 
    }
}
class Rectangle implements Shape {

    private final int length;
    private final int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
   public float area()
   {
       return ((length*breadth)*2+6);
   }
}
 class PaintCostCalculator{
float paintCostRequired(Shape s)
    {
        return s.area();
    }
      
      
}
public class Solution{
 public static void main(String[] args)
 {
         PaintCostCalculator calculator=new PaintCostCalculator();
         
         System.out.println(calculator.paintCostRequired(new Circle(5)));
         System.out.println(calculator.paintCostRequired(new Rectangle(3, 4)));     
    }
}




