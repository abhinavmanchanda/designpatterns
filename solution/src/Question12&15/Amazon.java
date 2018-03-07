/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antipattern;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
class Item
{
    int productType;
    String name;
    int price;
    String author;
    String publisher;
    String specs;
    String colour;

    public Item(int productType, String name, int price, String specs, String author,String publisher,String colour) 
    {
        this.productType = productType;
        this.name = name;
        this.price = price;
        this.specs = specs;
        this.author = author;
        this.publisher=publisher;
        this.colour=colour;
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
        if(productType==2)
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

class  Amazon
{
    public static void main(String [] args)
    {
        System.out.println("Product type:1.E-Books 2.Other products 3.Music");
         Item item2=new Item(2,"acd",100,"specs",null,null,"grey");
        Item item=new Item(1,"acd",100,null,"author","abc publications",null);
        
        String str=item.productDetails();
       System.out.println("details:"+str); //printing details of ebooks
        item.buy();
        String str2=item2.productDetails();
       System.out.println("details:"+str2);// printing details of other products
        item2.buy();
     
    }
}