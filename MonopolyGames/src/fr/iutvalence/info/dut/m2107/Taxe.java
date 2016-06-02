package fr.iutvalence.info.dut.m2107;

/**
 * Class representing taxes in the game
 * 
 * @author martithi
 *
 */
public class Taxe extends Case {

	/**
	 * Total value of the taxe
	 */
	private int somme;

	/**
	 * Method to pay taxes
	 */
	public void payer() {
		// TODO - implement Taxe.payer
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to view total value of taxes
	 * @return somme
	 */
	public int getSomme()
	{
		return this.somme;
	}

	/**
	 * Method to set the value of taxes
	 * @param somme
	 */
	public void setSomme(int somme)
	{
		this.somme = somme;
	}

}