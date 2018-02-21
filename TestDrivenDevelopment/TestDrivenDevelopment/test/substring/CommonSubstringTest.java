package substring;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import substring.CommonSubstring;

/**
 *
 * @author lenovo
 */
public class CommonSubstringTest {
    @Test
    public void returnZeroWhenBothInputsAreEmpty() {
       
        CommonSubstring commonSubstring= new CommonSubstring();
        int result=commonSubstring.find("","");
        assertEquals(0,result);
    }
     @Test
    public void returnZeroWhenOneInputsIsEmpty() {
       
        CommonSubstring commonSubstring= new CommonSubstring();
        int result=commonSubstring.find("","as");
        assertEquals(0,result);
    }
     @Test
    public void returnLengthWhenBothInputsAreEqual() {
       
        CommonSubstring commonSubstring= new CommonSubstring();
        int result=commonSubstring.find("ab","ab");
       
        assertEquals(2,result);
    }
     @Test
    public void returnZeroWhenBothStringsUnequal() {
       
        CommonSubstring commonSubstring= new CommonSubstring();
        int result=commonSubstring.find("abc","def");
           System.out.println("res:"+result);
        assertEquals(0,result);
    }
     @Test
    public void returnLengthWhenSmallerIsSubstringOfLarger() {
       
        CommonSubstring commonSubstring= new CommonSubstring();
        int result=commonSubstring.find("12ab","12abghjk");
       
        assertEquals(4,result);
    }
   @Test
    public void returnLengthWhenBeginningOfSmallerIsSubstringOfLarger() {
       
        CommonSubstring commonSubstring= new CommonSubstring();
        int result=commonSubstring.find("abcdef","hijabcklm");
        //System.out.println("res:"+result);
        assertEquals(3,result);
    }
    @Test
    public void returnLengthWhenBothStringsHaveACommonSubstring() {
       
        CommonSubstring commonSubstring= new CommonSubstring();
        int result=commonSubstring.find("zxabcdef","hijabcklm");
        System.out.println("res:"+result);
        assertEquals(3,result);
    }
   
}
