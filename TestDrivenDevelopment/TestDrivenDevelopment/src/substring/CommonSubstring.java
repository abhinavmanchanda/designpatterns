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
int i=0,j=0,max=0;
    int find(String smaller, String larger)
    {
        if(smaller.equals(""))//for empty string
         { 
            return 0;
        }
        else
        {
            for(i=0;i<smaller.length();i++)
                {
                    for(j=smaller.length();j>i;j--)
                        {
                            if(larger.contains(smaller.substring(i, j)))
                               {
                                   if((j-i)>max)
                                       max=(j-i);
                               }
                        }
                }
                      
                    return max;
        }
                     
                                    
    }
}
    

