package parkingsystem;

/**
 *
 * @author lenovo
 */
public  class DisplayBoard implements function {
int c;
    DisplayBoard(int c)
    {
        this.c=c;
    }
   


    public void display()
    {
        //This method is intentionally left blank, and is present only to help explain the concept.
        //While doing this assignment, assume that the implementationis present.
        System.out.println("Display board now displays:" + c);
    }
}
