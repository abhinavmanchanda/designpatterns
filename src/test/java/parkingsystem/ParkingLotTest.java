package parkingsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {

    @Test
    public void parkACarIfTheParkingLotHasSpace(){
        ParkingLot parkingLot = new ParkingLot(1);
        boolean isParked = parkingLot.park();
        assertTrue(isParked);
    }

    @Test
    public void doNotParkTheCarIfLotIsFull(){
        ParkingLot parkingLot = new ParkingLot(2);
        assertTrue(parkingLot.park());
        assertTrue(parkingLot.park());
        assertFalse(parkingLot.park());
    }

    

}
