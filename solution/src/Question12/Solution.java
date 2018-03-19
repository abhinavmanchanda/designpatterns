

import java.util.Scanner;

class Item2
{
    int productType;
    String name;
    int price;
    String specs;
    String author;
    String publisher;
    String colour;
    String singer;
    String album;
    String Language;
    String category;

    public Item2(int productType, String name, int price, String specs, String author,String publisher,String colour,String singer,String album,String Language,String category) 
    {
        this.productType = productType;
        this.name = name;
        this.price = price;
        this.specs = specs;
        this.author = author;
        this.publisher=publisher;
        this.colour=colour;
        this.singer = singer;
        this.album = album;
        this.Language = Language;
        this.category = category;
    }
    
   
  
    String productDetails()
    {
        
        String details=" ";
        details = details + name;
        details = details + price;
        if (productType==1)
        { details = details + author;
           details = details + publisher;
        }
        
        if (productType==3)
        {
          details = details + singer;
          details = details + album;
          details = details + Language;
          details = details + category;
        }
        else 
        { details = details + specs;
          details = details + colour;
        }
         return details;
    }
    
       
    void buy(){
        if(productType == 1) 
            sendToEmail();
        else if(productType==3)
            sendToMusicPlayer();
        else 
           sendToAdd();
    }
    
    void sendToAdd()
    {
        System.out.println("item shipped to address");
    }
    void sendToEmail()
    {
         System.out.println("item send to email");
    }
    void sendToMusicPlayer()
    {
         System.out.println("item send to music player");
    }
 
 

}

public class Solution
{
    public static void main(String [] args)
    {
        System.out.println("Product type:1.E-Books 2.Other products 3.Songs");
        Item2 item1=new Item2(1,"book",100,null,"author","abc publications",null,null,null,null,null);
        String str=item1.productDetails();
       //  printing details of other products stored in str
        item1.buy();
        Item2 item2=new Item2(2,"item",100,"specs",null,null,"grey",null,null,null,null);
        String str2=item2.productDetails();
        // printing details of other products stored in str2
        item2.buy();
        Item2 item3=new Item2(3,"song",100,null,null,null,null,"singer","album","language","category");
        String str3=item3.productDetails();
       //  printing details of other products stored in str3
        item3.buy();
    }
}