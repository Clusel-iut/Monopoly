package fr.iutvalence.info.dut.m2107;

/**
 * @author clusel
 * 
 * it's the class which represents the dice. The dice is needed by players for advance in the game. 
 */
public class De {

	/**
	 * Value of dice 1
	 */
	private int valeur_de1;
	
	/**
	 * Value of dice 2
	 */
	private int valeur_de2;
	/**
	 * Value of the sum of the 2dices
	 */
	private int advance;
		

	
	
	/**
	 * launch 2 dices and 
	 * @return an integer between 1 and 6
	 * The player advance with the  cases. 
	 */

	public int lancerDe() 
	
	{
			
		this.valeur_de1 = ((int) (Math.random() * 2 + 1));
		this.valeur_de2 = ((int) (Math.random() * 2 + 1));
		this.advance = this.valeur_de1 + this.valeur_de2;
		return this.advance;
		
	}

	/**
	 * if a player does a 2 same integers, he re-rolls dices  
	 * 
	 * @return <true> if <this.valeur_de1> == <this.valeur_de2>
	 * else if return <false>
	 * 
	 */
	public boolean isDouble()
	{
		if (this.getValeur_de1()==this.getValeur_de2())
		{
			return false;
		}
		return true;
	}

	/**
	 * @return the value of <this.valeur_de2>
	 */
	public int getValeur_de1()
	{
		return this.valeur_de1;
	}
	/**
	 * @return the value of <this.valeur_de2>
	 */
	public int getValeur_de2()
	{
		return this.valeur_de2;
	}

	/**
	 * @return the value of <advance>
	 */
	public int getAdvance()
	{
		return this.advance;
	}

	/**
	 * @param advance
	 * Allows to advance how you want
	 */
	public void setAdvance(int advance)
	{
		this.advance = advance;
	}


	
}
