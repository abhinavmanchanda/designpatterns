package shapes2;

public class Rectangle {

    private final int length;
    private  int breadth;
    private final int type;

    public Rectangle(int length, int breadth,int type) {
        this.length = length;
        //To change body of generated methods, choose Tools | Templates.
        this.breadth = breadth;
        this.type=type;
    }
    

    public float area() {
        if(type==2)
            breadth=length;
        return length * breadth;
    }
    public float perimeter() {
        if(type==2)
            breadth=length;
        return 2*length*breadth;
    }
    
    
}
