package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the case "Chance"
 * 
 * @author cluselm
 *
 */
public class Chance extends Case {
	
	/**
	 * Represents the card
	 */
	public static int card;

	/**
	 * Method to draw a card "Chance"
	 * @return int
	 */
	public static int tirerCarteChance() 
	{
		card = (int) (Math.random() * 2 + 1);
		return card;		
	}
		
	/**
	 * Allows to create a case Chance on the board
	 * @param position
	 */
	public Chance(int position)
	{
		this.position=position;
	}
}