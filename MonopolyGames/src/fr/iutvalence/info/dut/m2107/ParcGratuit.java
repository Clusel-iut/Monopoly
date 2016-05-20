package fr.iutvalence.info.dut.m2107;

/**
 * Class representing free park
 * @author martithi
 *
 */
public class ParcGratuit extends Case {

	/**
	 * It's the total value a player will earn if he arrives on the case ParcGratuit
	 */
	private int somme;

	/**
	 * The method to receive the Parc Gratuit's money
	 */
	public void recevoirArgent() {
		// TODO - implement ParcGratuit.recevoirArgent
		throw new UnsupportedOperationException();
	}

	/**
	 * Methos to put money on Parc Gratuit's case
	 */
	public void verserArgent() {
		// TODO - implement ParcGratuit.verserArgent
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to know how much money is on it
	 * @return somme
	 */
	public int getSomme()
	{
		return somme;
	}
	/**
	 * ???
	 * @param somme
	 */
	public void setSomme(int somme)
	{
		this.somme = somme;
	}

}