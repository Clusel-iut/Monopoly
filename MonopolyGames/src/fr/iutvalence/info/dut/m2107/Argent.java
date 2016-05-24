package fr.iutvalence.info.dut.m2107;


/**
 * Class representing the player's money
 * 
 * @author martithi
 *
 */

public class Argent
{
	
	/**
	 * Represent the money
	 * @author cluselm
	 */
	private int money;
		
	
	/**
	 * Represents the money of all players at the start
	 * @author cluselm
	 */
	private static final int DEFAULT_MONEY=1500;
	
	/**
	 * represents the money of the player 1
	 * @author cluselm
	 */
	private int money_player1;
	
	/**
	 * represents the money of the player 2
	 * @author cluselm
	 */
	private int money_player2;	
	
	
	
	/**
	 * This constructor initialize the money for the start of the game
	 */
	public Argent()
	{
		this.money_player1=DEFAULT_MONEY;
		this.money_player2=DEFAULT_MONEY;
	}
	

	
	
	/**
	 * @return the money of the player.
	 * @author cluselm
	 */
	public int getMoney()
	
	{
		return this.money;
	}
	
	/**
	 * @param money
	 * @author cluselm
	 */
	public void addORdelete(int money)
	
	{
		this.money = (this.money + money);
		
	}
	
	
}
