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


public Triangle twosidesandangle_given(double side_b,double side_c,double angle_A) { 

double side_a=0; 

return new Triangle(Math.round(side_a), side_b, side_c); 
} 


} 

class Solution 
{ 
public static void main(String[]args) 
{ 

System.out.println(Triangle.twosidesandangle_given(8.0,5.0,Math.toRadians(60.0)).area()); 

} 
}