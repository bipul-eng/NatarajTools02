package com.bk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
	
	public static App app;
	
	@BeforeAll
	public static void setUpOnce()
	{
		app=new App();
	}
   
	@Test
	public void testWithPositiveValues()
	{
		int expected = app.add(20, 30);
		
		int actual=50;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWithNegatives()
	{
		int expected=app.add(30, -20);
		
		int actual=10;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWithZeros()
	{
		int expected=app.add(0, 0);
		
		int actual=0;
		
		assertEquals(expected, actual);
	}
}
