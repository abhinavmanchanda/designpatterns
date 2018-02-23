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
public class Main {
    public static void main(String []args){
         
        
        int c=0;
        ParkingLot parkingLot = new ParkingLot(100);
        parkingLot.addNotificationReceiver(new DisplayBoard());
        parkingLot.addNotificationReceiver(new IndoorDisplayBoard());
        parkingLot.addNotificationReceiver(new SmsNotificationReceiver());
       parkingLot.park();
       
       parkingLot.park();
       //c= parkingLot.unpark();
       parkingLot.park();
       
      /* 
       c=parkingLot.unpark();
          fd.fuctiontoexecute(new DisplayBoard(c)); 
       fd.fuctiontoexecute(new ParkingLotCleaner(c));
       c= parkingLot.park();
        fd.fuctiontoexecute(new DisplayBoard(c)); 
       fd.fuctiontoexecute(new ParkingLotCleaner(c));*/
       
        
        
    }
}
