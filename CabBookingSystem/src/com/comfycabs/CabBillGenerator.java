package com.comfycabs;

import com.comfycabs.CabBillGenerator.CabType;

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
	
	 enum CabType
	{
		 COMPACT(10, 1), COMFORT(15,1), LUXURY(20,2), SUV(18,3);
		 
		private int distanceCost;
		private int timeCost;
		private CabType(int distance, int time) {	
			this.distanceCost = distance;
			this.timeCost = time;
		}
		
	}
	

}
