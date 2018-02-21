/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substring;

/**
 *
 * @author lenovo
 */
public class CommonSubstring {
int i=0,j=0;
    int find(String smaller, String larger) {
        if(larger.contains(smaller))
            return smaller.length();
        else if(smaller.equals(""))//for test 1&2
            return 0;
       
        else 
        {
           
               
                   while( j<larger.length()&&smaller.charAt(i)!=larger.charAt(j))
                   j++;
                   while(j<larger.length()&&smaller.charAt(i)==larger.charAt(j) )
                   {i++;j++;}
                   return i;
               
             //return 0;
        }
      
    }
    
}
