/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class DisplayBoard {
    int db=0;int capacity=100;
    ParkingLot pa=new ParkingLot(db,capacity);
   db=pa.park();
}
