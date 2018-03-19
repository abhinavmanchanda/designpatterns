package com.comfycabs;


public class CabBillGenerator {
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

}
final class CabType
{
	 public static final CabType COMPACT = new CabType(10, 1);
	 public static final CabType COMFORT= new CabType(15,1);
	 public static final CabType LUXURY= new CabType(20,2);
	 public static final CabType SUV= new CabType(18,3);
	 
	public final int distanceCost;
	public final int timeCost;
	private CabType(int distance, int time) {	
		this.distanceCost = distance;
		this.timeCost = time;
	}
	
}
