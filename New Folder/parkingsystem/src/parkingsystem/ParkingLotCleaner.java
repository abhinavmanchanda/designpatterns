/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsystem;

/**
 *
 * @author lenovo
 */
public class ParkingLotCleaner implements ParkingLotNotificationReceiver {

    public void display(int c)
    {
        System.out.println("Parking lot owner now informed about:"+c);
    }

    
}
