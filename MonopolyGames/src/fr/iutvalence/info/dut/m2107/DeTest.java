package fr.iutvalence.info.dut.m2107;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeTest {

	@Test
	public void testDes() 
	{
		De de1 = new De();
		int value = de1.lancerDe();
		assertTrue(value > 0);
		assertTrue(value < 7);
		assertFalse(value < 1);
		assertFalse(value > 6);
	}
	
	
}
