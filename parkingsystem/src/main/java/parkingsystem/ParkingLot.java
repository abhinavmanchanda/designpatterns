package parkingsystem;

public class ParkingLot {
    private final int capacity;
    private int numberOfCars = 0;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public boolean park() {
        if(isFull()) return false;
        numberOfCars++;
        return true;
    }

    public void unpark() {
        numberOfCars--;
    }

    public boolean isFull() {
        return capacity == numberOfCars;
    }
}
