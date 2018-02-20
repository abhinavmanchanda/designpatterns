/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Circle implements Shape {

    /**
     * @param args the command line arguments
     */
    private int radius;
    Circle(int radius)
    {
        this.radius=radius;
    }
    public float area()
    {
       return(float) (3.14*radius*radius); 
    }
    float perimeter()
    {
        return (float)(2*3.14*radius);
    }
   
    
}
