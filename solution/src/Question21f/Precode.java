class Tea 
{
	  void prepareRecipe()
		{
			boilWater();
			brewTeaBag();
			pourInCup();
			addLemon();
		}
	 void boilWater()
		{
			System.out.println("Boiling Water");
		}
		
	public void brewTeaBag()
	{
		System.out.println("Steeping the tea");
	}
	void pourInCup() 
	{
		System.out.println("Pour In Cup");
		
	}
	public void addLemon()
	{
		System.out.println("Pouring into Cup");
	}
}
 class Coffee 
{
	 void prepareRecipe()
		{
			boilWater();
			brewCoffeeGrinds();
			pourInCup();
			addSugarAndMilk();
		}
	void boilWater()
	{
			System.out.println("Boiling Water");
	} 
	public void brewCoffeeGrinds()
	{
		System.out.println("Deeping Coffee through filter");
	}
	void pourInCup() 
	{
		System.out.println("Pour In Cup");
		
	}
	public void addSugarAndMilk()
	{
		System.out.println("Adding Sugar and Milk");}
}
 class Solution
 {
	 public static void main(String[]args)
	 {
		 System.out.println("Recipe to prepare tea");
		 Tea tea=new Tea();
		 tea.prepareRecipe();
		 System.out.println("Recipe to prepare coffee");
		 Coffee coffee=new Coffee();
		 coffee.prepareRecipe();
	 }
 }