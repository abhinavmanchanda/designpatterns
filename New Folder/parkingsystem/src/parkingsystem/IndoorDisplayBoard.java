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
public class IndoorDisplayBoard implements ParkingLotNotificationReceiver{
   
  public void display(int c)
    {
        //This method is intentionally left blank, and is present only to help explain the concept.
        //While doing this assignment, assume that the implementationis present.
        System.out.println("Display board now displays:" + c);
    }
}
