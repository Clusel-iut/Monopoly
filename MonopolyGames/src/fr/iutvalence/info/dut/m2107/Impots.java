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
	public int somme;

	/**
	 * Method to pay taxes
	 */
	public void payer() 
	{
		//...
	}

	/**
	 * @param position
	 * @param impot
	 */
	public Impots(int position, int impot)
	{
		this.position = position;
		this.somme =  impot;
		
	}
	
	/**
	 * Get some of ???
	 * @return somme
	 */
	public int getSomme()
	{
		return this.somme;
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