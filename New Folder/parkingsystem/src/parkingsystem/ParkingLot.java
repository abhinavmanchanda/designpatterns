package parkingsystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private final int capacity;
    private int numberOfCars = 0;
    private List<ParkingLotNotificationReceiver> receivers = new ArrayList<ParkingLotNotificationReceiver>();

    //private function f;
    public ParkingLot(int capacity) {
        this.capacity = capacity;

        //f.display();
    }

    public boolean park() {
        if (isFull()) {
            return false;
        }

        numberOfCars++;
        notifyparkingspacechange();
        return true;
    }
    
    public void addNotificationReceiver(ParkingLotNotificationReceiver receiver){
        receivers.add(receiver);
    }

    private void notifyparkingspacechange() {
        
        for(ParkingLotNotificationReceiver r : receivers)
            r.display(numberOfCars);
        
       
    }

    public void unpark() {
        numberOfCars--;
        //return numberOfCars;
                notifyparkingspacechange();
    }

    public boolean isFull() {
        return capacity == numberOfCars;
    }
}
