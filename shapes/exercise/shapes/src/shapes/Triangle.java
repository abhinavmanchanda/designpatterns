package shapes;

public class Triangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC){

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int perimeter(){
        return sideA + sideB + sideC;
    }

    public double area(){
        int halfPerimeter = perimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
}
