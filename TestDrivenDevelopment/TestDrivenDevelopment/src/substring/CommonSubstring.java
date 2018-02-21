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
int i=0,j=0,flag=0;
    int find(String smaller, String larger) {
        if(larger.contains(smaller))
            return smaller.length();
        else if(smaller.equals(""))//for test 1&2
            return 0;
        else 
        {
                   while( j<larger.length()&&smaller.charAt(i)!=larger.charAt(j))
                   j++;
                   while(j<larger.length()&&smaller.charAt(i)==larger.charAt(j))
                   {i++;j++;}
                   if(i!=0)
                   return i;
                   else
                   {
                       i=0;j=0;
                       for(i=0;i<smaller.length();i++)
                       {
                           for(j=0;j<larger.length();j++)
                           {
                               if(smaller.charAt(i)==larger.charAt(j))
                               { flag++;i++;}
                           }
                           if(flag!=0)
                               return flag;
                           
                               
                       }
                   }
        }
         return 0;
    }
    
}
