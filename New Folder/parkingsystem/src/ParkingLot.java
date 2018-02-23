
public class ParkingLot {
    public int db;
    public int capacity;
       ParkingLot(int db,int capacity) 
        {
            this.db=db;
            this.capacity=capacity;
        }
       public int park()
       {
           if(db!=capacity)
               db++;
           else
               System.out.println("PARKING LOT FULL");
                    return db;
       }
         public int unpark()
       {
           if(db>0)
               db--;
           else
               System.out.println("PARKING LOT EMPTY");
                return db;    
       }
}
