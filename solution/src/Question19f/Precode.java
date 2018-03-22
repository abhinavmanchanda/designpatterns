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
class PremiumTicket
{
	int ticketno;
	String boarding;
	String departure;
	String flightTime;
	String flightNo;
	String mealpackage;
	String drinkspackage;
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
   void selectMeal()
   {
	   System.out.println("Meal Selected");
   }
   void selectDrink()
   {

	   System.out.println("Drink Selected");
   }
}
class Solution
{
	 public static void main(String[]args)
	 {
		
		CheapTickets ticket=new CheapTicket();
		 ticket.selectDestinations();
		 ticket.bookFlight(); 
		PremiumTicket ticket=new PremiumTicket();
		 ticket.selectDestinations();
		 ticket.bookFlight();
		 ticket.selectSeat();
		 ticket.selectMeal();
		 ticket.selectDrink();
		 
	 }

}