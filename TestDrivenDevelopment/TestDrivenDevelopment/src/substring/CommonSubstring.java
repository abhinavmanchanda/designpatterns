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

    int find(String smaller, String larger) {
        if(smaller.equals(larger))
            return smaller.length();
        else if(larger.contains(smaller))
                {
                    return smaller.length();
                }
        else
            return 0;
    }
    
}
