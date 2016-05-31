package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the case "Chance"
 * 
 * @author martithi
 *
 */
public class Chance extends Case {
	
	public static int carte;

	/**
	 * Method to draw a card "Chance"
	 * Return a int
	 */
	public static int tirerCarteChance() 
	{
		carte = (int) (Math.random() * 2 + 1);
		return carte;		
	}
		
	public Chance(int position)
	{
		this.position=position;
	}
}