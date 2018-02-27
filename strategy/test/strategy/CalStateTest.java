/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class CalStateTest {
    

    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void verifyGameOfLifeState() {
        CalState state=new CalState(); 
        State gof=new GameOfLife(); 
        state.setstate(gof);
        int[][] values = {{1,0,1},{0,0,0},{1,1,1}};
        state.calstate(3, 3, values, 1);
        int[][] expected = {{0,0,0},{1,0,1},{0,1,0}};
         Assert.assertArrayEquals(expected, values);
        
     }
}
