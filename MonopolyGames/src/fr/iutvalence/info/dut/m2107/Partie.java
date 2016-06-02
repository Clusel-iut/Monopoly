package fr.iutvalence.info.dut.m2107;
/**
 * 
 * @author Portable
 *
 */
public class Partie {

	/**
	 * Number of player
	 */
	@SuppressWarnings("unused")
	private int nb_joueur;
	
	/**
	 * The number of cards remaining
	 */
	@SuppressWarnings("unused")
	private int pile_carte_chance;
	/**
	 * The number of cards remaining
	 */
	@SuppressWarnings("unused")
	private int pile_carte_communaute;
	
	
	
	/**
	 * State of the game
	 */
	private String etat;
	
	/**
	 * Method to change of player
	 */
	public void changerJoueur() {
		
	}
	
	
	/**
	 * Method to get the state of the game ("in progress", "ended")
	 * @return etat
	 */
	public String getState()
	{
		return this.etat;
	}

}