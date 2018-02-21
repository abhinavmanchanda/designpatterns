package parkingsystem;

public class ParkingLot {
    private final int capacity;
    private int numberOfCars = 0;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public boolean park() {
        if(numberOfCars == capacity) return false;
        numberOfCars++;
        return true;
    }
}
