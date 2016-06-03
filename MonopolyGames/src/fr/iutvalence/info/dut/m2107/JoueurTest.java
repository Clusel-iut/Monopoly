package fr.iutvalence.info.dut.m2107;

import static org.junit.Assert.*;

import org.junit.Test;

public class JoueurTest {

	@Test
	public void testMoneyArgent() 
	{
		Joueur j1 = new Joueur("oh","ah");
		int money = j1.getMoney();
		assertTrue(money == 1500);
		assertFalse(money != 1500);
	}
	
	@Test
	public void testXPosition() 
	{
		Joueur j1 = new Joueur("oh","ah");
		int xposition = j1.getXPosition();
		assertTrue(xposition == 450);
		assertFalse(xposition != 450);
	}
	
	@Test
	public void testYPosition() 
	{
		Joueur j1 = new Joueur("oh","ah");
		int yposition = j1.getYPosition();
		assertTrue(yposition == 480);
		assertFalse(yposition != 480);
	}

	@Test
	public void testPlayerPosition() 
	{
		Joueur j1 = new Joueur("oh","ah");
		int playerposition = j1.getPlayerPosition();
		assertTrue(playerposition == 0);
		assertFalse(playerposition != 0);
	}
}
