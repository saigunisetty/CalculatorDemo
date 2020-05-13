package com.ibm.JavaApp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest {
   
	App app = new App(2, 3);
	@Test
    public void twoAndThreeIsFive() throws Exception {
    	assertEquals(app.addFunction(2, 3),5);
    }

	@Test
    public void threeMinusTwoIsOne() throws Exception {
        assertEquals(app.subFunction(2, 3),1);
    }
    
	@Test
    public void threeXThreeIsNine() throws Exception {
        assertEquals(app.mulFunction(3, 3), 9);
    }
    
}
