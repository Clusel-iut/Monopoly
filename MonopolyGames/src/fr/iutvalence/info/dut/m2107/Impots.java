package fr.iutvalence.info.dut.m2107;

/**
 * Class representing taxes players have to pay
 * @author martithi
 *
 */
public class Impots extends Case {

	/**
	 * Represents the value of the taxe
	 */
	private static int somme;

	/**
	 * Method to pay taxes
	 */
	public void payer() 
	{
		//...
	}

	public Impots(int impot)
	{
		this.somme =  impot;
		
	}
	
	/**
	 * Get some of ???
	 * @return somme
	 */
	public static int getSomme()
	{
		return somme;
	}

	/**
	 * set money of ???
	 * @param somme
	 */
	public void setSomme(int somme)
	{
		this.somme = somme;
	}
	
	public int pay(int impot)
	{
		this.somme = this.somme - impot;
		return this.somme;
	}

}