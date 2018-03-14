class Ticket1
{
	int ticketno;
	String boarding;
	String departure;
	String FlightTime;
	String FlightNo;
	
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
	String FlightTime;
	String FlightNo;
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
class main
{
	 public static void main(String[]args)
	 {
		 
		PremiumTicket ticket=new PremiumTicket();
		 ticket.selectDestinations();
		 ticket.bookFlight();
		 ticket.selectSeat();
		 ticket.selectMeal();
		 ticket.selectDrink();
		 
	 }

}