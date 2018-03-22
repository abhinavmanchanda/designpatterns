
 class CabBillGenerator {
	int distance;
	CabType cabType;
	int time;
	public CabBillGenerator(int distance, CabType cabType,int time) {
		this.distance=distance;
		this.cabType=cabType;
		this.time=time;
	}

	public int calculateCost() {
		int idealTime=distance*3;
		int timeExceeded=0;
		
		if(time>idealTime)
			timeExceeded = time-idealTime;
		return (distance*cabType.distanceCost+cabType.timeCost*timeExceeded);
		
		
	}
	
	 enum CabType
	{
		 COMPACT(10, 1), COMFORT(15,1), LUXURY(20,2), SUV(10,34),MINIBUS(20,50);
		 
		private int distanceCost;
		private int timeCost;
		private CabType(int distanceCost, int timeCost) {
			
			this.distanceCost = distanceCost;
			this.timeCost = timeCost;
		}
		
	}
	

}
public class Solution
{ 
public static void main(String[]args) 
{ 
int bill; 
CabBillGenerator billGenerator=new CabBillGenerator(10,CabType.COMPACT, 29); 
bill=billGenerator.calculateCost(); 
System.out.println("Your cab fare is:"+bill); 
} 
}