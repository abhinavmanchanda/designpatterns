package parkingsystem;

public class ParkingLot {

    private final int capacity;
    private int numberOfCars = 0;

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

    private void notifyparkingspacechange() {
        functiondecider fd = new functiondecider();
        fd.fuctiontoexecute(new DisplayBoard(numberOfCars));
        fd.fuctiontoexecute(new ParkingLotCleaner(numberOfCars));
        fd.fuctiontoexecute(new IndoorDisplayBoard(numberOfCars));
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
