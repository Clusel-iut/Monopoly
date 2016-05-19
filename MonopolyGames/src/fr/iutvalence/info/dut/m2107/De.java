package fr.iutvalence.info.dut.m2107;

import java.util.Random;

/**
 * @author clusel
 * 
 * it's the class which represents the dice. The dice is needed by players for advance in the game. 
 */
public class De {

	private int valeur_de1;
	private int valeur_de2;
	private int advance;
		

	
	
	/**
	 * launch 2 dices and 
	 * @return an integer between 1 and 6
	 * The player advance with the  cases. 
	 */
	@SuppressWarnings("javadoc")
	public int lancerDe() 
	
	{
			
		this.valeur_de1 = ((int) (Math.random() * 5 + 1));
		this.valeur_de2 = ((int) (Math.random() * 5 + 1));
		this.setAdvance((((this.getValeur_de1())+(this.getValeur_de2()))));
		return this.getAdvance();
		
		
	}

	/**
	 * if a player does a 2 sames intergers, he rerolls dices  
	 * 
	 * @return true if <this.valeur_de1>==<this.valeur_de2>
	 * else if return false
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
	 * @return th value of <advance>
	 */
	public int getAdvance()
	{
		return this.advance;
	}

	/**
	 * @param advance
	 */
	public void setAdvance(int advance)
	{
		this.advance = advance;
	}


	
}