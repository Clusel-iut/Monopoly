package fr.iutvalence.info.dut.m2107;

/**
 * Represents the first case of the game.
 * Each times a player pass by the case, he earns 2000euros.
 * @author cluselm
 *
 */
public class Depart extends Case {

	/**
	 * The money's value to give to a player
	 */
	private int somme;
	
	public String start="Depart";
	public int startposition=0;
	public String namestart="Depart";
	
	
	public Depart()
	{
		this.type = start;
		this.position = startposition;
		this.nom = namestart;
	}
	

	/**
	 * Method to give money to the player
	 */
	public void verserArgent()	
	{
		
		
	}


	/**
	 * Method to get the money of ???
	 * @return somme
	 */
	public int getSomme()
		{
		return somme;
		}

	/**
	 * Method to set the money of ???
	 * @param somme
	 */
	public void setSomme(int somme)
		{
		this.somme = somme;
		}

}