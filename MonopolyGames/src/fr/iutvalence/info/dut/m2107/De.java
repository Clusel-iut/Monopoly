package fr.iutvalence.info.dut.m2107;

import java.util.Random;

/**
 * @author clusel
 * 
 * it's the class which represents the dice. The dice is needed by players for advance in the game. 
 */
public class De {

	/**
	 * Value of dice 1
	 */
	private static int valeur_de1;
	
	/**
	 * Value of dice 2
	 */
	private static int valeur_de2;
	/**
	 * Value of the sum of the 2dices
	 */
	private static int advance;
		

	
	
	/**
	 * launch 2 dices and 
	 * @return an integer between 1 and 6
	 * The player advance with the  cases. 
	 */

	public static int lancerDe() 
	
	{
			
		valeur_de1 = ((int) (Math.random() * 5 + 1));
		valeur_de2 = ((int) (Math.random() * 5 + 1));
		advance = valeur_de1 + valeur_de2;
		return advance;
		
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
	public static int getValeur_de1()
	{
		return valeur_de1;
	}

	/**
	 * @return the value of <this.valeur_de2>
	 */
	public static int getValeur_de2()
	{
		return valeur_de2;
	}

	/**
	 * @return the value of <advance>
	 */
	public static int getAdvance()
	{
		return advance;
	}

	/**
	 * @param advance
	 */
	public static void setAdvance(int advance)
	{
		advance = advance;
	}


	
}
