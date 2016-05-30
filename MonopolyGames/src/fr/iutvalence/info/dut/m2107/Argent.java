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
		this.money=Joueur.DEFAULT_MONEY;
	}
	
	
	public Argent(int x)
	{
		this.money=x;
		
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
	 * @param amount 
	 */
	public void addMoney(int amount)
	{
		money += amount;		
	}
	
	/**
	 * @param amount
	 */
	public void deleteMoney(int amount)
	{
		this.money -= amount;
	}
	
	


	
}
