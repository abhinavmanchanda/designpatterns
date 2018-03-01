
package observe;

class DisplayBoard implements NotificationReceiver {

    public void display(int c)
    {
        //This method is intentionally left blank, and is present only to help explain the concept.
        //While doing this assignment, assume that the implementationis present.
        System.out.println("Display board now displays:" + c);
    }
}

public class IndoorDisplayBoard{
   
  public void display(int c)
    {
        //This method is intentionally left blank, and is present only to help explain the concept.
        //While doing this assignment, assume that the implementationis present.
        System.out.println("Display board now displays:" + c);
    }
}
public class SmsNotificationReceiver {

    public void display(int c)
    {
        System.out.println("Parking lot owner now informed about:"+c);
    }

    
}

 class Main {
    public static void main(String []args){
         
        
        int c=0;
        ParkingLot parkingLot = new ParkingLot(100);
        parkingLot.addNotificationReceiver(new DisplayBoard());
         parkingLot.addNotificationReceiver(new IndoorDisplayBoard());
        parkingLot.addNotificationReceiver(new SmsNotificationReceiver());
       parkingLot.park();
       parkingLot.park();
       parkingLot.park();
     
    }
}

class ParkingLot {

    private final int capacity;
    private int numberOfCars = 0;
    private List <DisplayBoard> receivers = new ArrayList<DisplayBoard>();
    public ParkingLot(int capacity) {
        this.capacity = capacity;
        notifyparkingspacechange();
    }

    public boolean park() {
        if (isFull()) {
            return false;
        }
        numberOfCars++;
        notifyparkingspacechange();
        return true;
    }
    
    public void addNotificationReceiver(DisplayBoard displayBoard){
        receivers.add(displayBoard);
    }

     public void unpark() {
        numberOfCars--;
        notifyparkingspacechange();
    }
     
     private void notifyparkingspacechange() {
        
        for(NotificationReceiver r : receivers)
            r.display(numberOfCars);
       
    }

    public boolean isFull() {
        return capacity == numberOfCars;
    }
}


