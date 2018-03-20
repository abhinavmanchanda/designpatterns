class CabBillGenerator {
	int distance;
	String cabType;
	int time;
	int idealTime;
	 CabBillGenerator(int distance, String cabType,int time) {
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
		if(cabType.equals("SUV"))
		{
			idealTime=distance*3;
			if(time<idealTime)
			return(distance*19);
			else
				return(distance*19+(time-idealTime)*2);
		}
		if(cabType.equals("Mini-Bus"))
		{
			idealTime=distance*3;
			if(time<idealTime)
			return(distance*25);
			else
				return(distance*25+(time-idealTime)*3);
		}
		else return 0;
	}
	

}
public class Solution
{
	public static void main(String[]args)
	{
	int bill;
	CabBillGenerator billGenerator=new CabBillGenerator(10,"Compact", 29);
	bill=billGenerator.calculateCost();
	System.out.println("Your cab fare is:"+bill);
	CabBillGenerator billGenerator1=new CabBillGenerator(15,"Comfort", 48);
	bill=billGenerator1.calculateCost();
	System.out.println("Your cab fare is:"+bill);
	CabBillGenerator billGenerator2=new CabBillGenerator(20,"Luxury", 65);
	bill=billGenerator2.calculateCost();
	System.out.println("Your cab fare is:"+bill);
	CabBillGenerator billGenerator3=new CabBillGenerator(10,"SUV",34);
	bill=billGenerator3.calculateCost();
	System.out.println("Your cab fare is:"+bill);
	CabBillGenerator billGenerator4=new CabBillGenerator(20,"Mini-Bus",50);
	bill=billGenerator4.calculateCost();
	System.out.println("Your cab fare is:"+bill);
	}
}
