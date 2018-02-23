package parkingsystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private final int capacity;
    private int numberOfCars = 0;
    private List<DisplayBoard> receivers = new ArrayList<DisplayBoard>();

    //private function f;
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
