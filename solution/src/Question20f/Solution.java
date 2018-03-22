
class Ticket
{
	int ticketno;
	String boarding;
	String departure;
	String flightTime;
	String flightNo;
	
	void selectDestinations()
	{
		System.out.println("Destinations selected");
	}
	void bookFlight()
	{
		System.out.println("Flight booked");
	}
	void selectSeat()
	{
		System.out.println("Seat Booked");
	}
}
class PremiumTicket extends Ticket
{
	
	String mealpackage;
	String drinkspackage;
	
   void selectMeal()
   {
	   System.out.println("Meal Selected");
   }
   void selectDrink()
   {
	   System.out.println("Drink Selected");
   }
}
class CheapTicket extends Ticket
{
}
class Solution
{
	 public static void main(String[]args)
	 {
		 CheapTicket ticket=new CheapTicket();
		 ticket.selectDestinations();
		 ticket.bookFlight(); 

		PremiumTicket ticket1=new PremiumTicket();
		 ticket1.selectDestinations();
		 ticket1.bookFlight();
		 ticket1.selectSeat();
		 ticket1.selectMeal();
		 ticket1.selectDrink();
		 
	 }

}
