/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes2;

/**
 *
 * @author lenovo
 */


    
    public class Triangle {

    private final double sideA;
    private final double sideB;
    private double sideC;
    private final int type;

    public Triangle(double sideA, double sideB, double sideC,int type)
    {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type=type;
    }
    
   

    public double perimeter(){
        if(type==4)
            sideC= Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));
        else if(type==5)
            sideC=sideA;
            return sideA + sideB + sideC;
    }

    public double area(){
        double halfPerimeter = perimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
}

        // TODO code application logic here
   
    

