package Ct;
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
class CheapTicket
{
	
}
class main
{
	 public static void main(String[]args)
	 {
		 
		CheapTickets ticket=new CheapTicket();
		 ticket.selectDestinations();
		 ticket.bookFlight();
		
	 }

}