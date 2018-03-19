package com.comfycabs;

public class CabBillGenerator {
	int distance;
	String cabType;
	int time;
	int idealTime;
	public CabBillGenerator(int distance, String cabType,int time) {
		this.distance=distance;
		this.cabType=cabType;
		this.time=time;
	}

	public int calculateCost() {
		if(cabType.equals("Compact"))
		{
			idealTime=distance*3;
			if(time<idealTime)
			return(distance*10);
			else
				return(distance*10+(time-idealTime)*1);
		}
		
		if(cabType.equals("Comfort"))
		{
			idealTime=distance*3;
			if(time<idealTime)
			return(distance*15);
			else
				return(distance*15+(time-idealTime)*1);
		}
		if(cabType.equals("Luxury"))
		{
			idealTime=distance*3;
			if(time<idealTime)
			return(distance*20);
			else
				return(distance*20+(time-idealTime)*2);
		}
		else return 0;
	}
	

}
