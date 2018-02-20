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
public class Main {
     public static void main(String[] args) {
        System.out.println("Enter radius  circles");
        Scanner s=new Scanner(System.in);
        
        //Circle c=new Circle(radius);
        float area;
        int radius1=s.nextInt();
         PaintCalculator l=new PaintCalculator();
         area=l.paintRequired(new Circle(radius1));
          System.out.println("paint requires:"+area);
         System.out.println("Enter length and breadth of rec");
         int length=s.nextInt();
         int breadth=s.nextInt();
        area= l.paintRequired(new Rectangle(length, breadth));
         System.out.println("Enter the depth");
         int d=s.nextInt();
         
         System.out.println("paint requires:"+(area*d));
         
        /*float area=c.area();
        System.out.println("Enter area of circle is :"+area);
        float p=c.perimeter();
        System.out.println("Enter perimeter of circle is :"+p);*/
    }
}
