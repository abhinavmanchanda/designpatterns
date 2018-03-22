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
public class Solution{ 
public static void main(String[] args) 
{ 
PaintCostCalculator calculator=new PaintCostCalculator(); 
System.out.println(calculator.paintCostRequired(new Circle(5))); 
System.out.println(calculator.paintCostRequired(new Rectangle(3, 4))); 
} 
}

