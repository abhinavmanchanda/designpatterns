

 abstract class TemplateClass 
{
    final void readbook()
    {
        viewBookList();
        selectBook();
        int price=calculateBill();
        printBill(price);
    }

    void viewBookList()
    {
        System.out.println("The List of books:1.ABC 2.XYZ 3.PQR");
    }

     void selectBook()
    {
        System.out.println("You have selected the book ABC");
    }

     void printBill(int price)
    {
       System.out.println("Your bill is Rs"+price);
    }

    abstract int calculateBill();
   
}
class Rent extends TemplateClass
{
    int calculateBill()
    {
       System.out.println("Bill  for renting this book is Rs.20");
       return 20;
    }
    
}
class Purchase extends TemplateClass
{
    int calculateBill()
    {
       System.out.println("Bill  for purchasing this book is Rs.100");
       return 100;
    }
    
}
class ReadHere extends TemplateClass
{
    int calculateBill()
    {
       System.out.println("Bill  for reading this book in the store is Rs.10");
       return 10;
    }
    
}
class Main
{
    public static void main(String[]args)
    {
        Rent rent=new Rent();
        rent.readbook();
        Purchase purchase=new Purchase();
        purchase.readbook();
        ReadHere read=new ReadHere();
        read.readbook();
        
    }
}