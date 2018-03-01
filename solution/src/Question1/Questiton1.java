/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

class PaintCostCalculator{

float paintCostRequired(Rectangle r)
    {
        return (2*r.area()+6);
    }
      
float paintCostRequired(Circle c)
    {
        return (2*c.area()+6);
    }
      
}
class Rectangle {

    private final int length;
    private final int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
   public float area()
   {
       return length*breadth;
   }
}

class Circle{

    private int radius;
    Circle(int radius)
    {
        this.radius=radius;
    }
    public float area()
    {
       return(float) (3.14*radius*radius); 
    }
}
public class Questiton1{
     public static void main(String[] args)
	 {
         PaintCostCalculator calculator=new PaintCostCalculator();
         System.out.println((int)calculator.paintCostRequired(new Circle(5)));
         System.out.println((int)calculator.paintCostRequired(new Rectangle(3, 4)));     
    }
}
