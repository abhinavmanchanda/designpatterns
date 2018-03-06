
package pattern;


import java.util.Scanner;

abstract class Product
{
 
    String name;
    int price;
     public Product(String name, int price) 
    {
        this.name = name;
        this.price = price;
    }
    public Product()
    {
        
    }
    String productDetails()
    {
        return name + price;
    }

    void buy() {
        System.out.println("item delivered ");
    }
    
}
class ebook extends Product
{

    private final String author;
    private final String publisher;
    
   public ebook(String name,int price, String author,String publisher)
   {
       
       super(name,price);
        this.author = author;
        this.publisher = publisher;
   }
   String productDetails()
   {
       
       String details=super.productDetails();
       details = details + author;
       details = details + publisher;
       return details;
   }

}
class music extends Product
{
     String singer;
     String album;
     String language;
     String category;
    
   public music(String name,int price,String singer,String album,String language,String category)
   {
       super(name,price);
        this.singer = singer;
        this.album = album;
        this.language = language;
        this.category = category;
   }
   String productDetails()
   {
        String details=super.productDetails();
        details = details + singer;
        details = details + album;
        details = details + language;
        details = details + category;
        return details;
   }
   
 }
class otherproducts extends Product
{

    private final String specs;
    private final String colour;
    
   public otherproducts(String name,int price,String specs,String colour)
   {
       super(name,price);
        this.specs = specs;
        this.colour = colour;
   }
    String productDetails()
   {
      String details=super.productDetails();
      details = details + specs;
      details = details + colour;
      return details;
   }
    
}
class amazon3
{
    public static void main (String [] args)
    {
        
        Product book=new ebook("name ",100,"author ", "publisher ");
        String details=book.productDetails();
       System.out.println("details:"+details);
        book.buy();
        Product music=new music("name ",100,"singer ", "album ", "language ", "category ");
        details=music.productDetails();
        System.out.println("details:"+details);
        music.buy();
        Product op=new otherproducts("name ",100,"specs ", "colour ");
        details=op.productDetails();
       System.out.println("details:"+details);
        op.buy();
            
            
    }
}

