/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author lenovo
 */
public class Rectangle implements Shape {

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
