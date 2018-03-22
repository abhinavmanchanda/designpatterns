abstract class CaffeineBeverage
{
	final void prepareRecipe()
	{
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	void boilWater()
	{
		System.out.println("Boiling Water");
	}
	void pourInCup() 
	{
		System.out.println("Pour In Cup");
		
	}
}
 class Tea extends CaffeineBeverage
{
	public void brew()
	{
		System.out.println("Steeping the tea");
	}
	public void addCondiments()
	{
		System.out.println("Pouring into Cup");
	}
}
 class Coffee extends CaffeineBeverage
{
	public void brew()
	{
		System.out.println("Deeping Coffee through filter");}
	public void addCondiments()
	{
		System.out.println("Adding Sugar and Milk");}
}
 public class Solution
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
