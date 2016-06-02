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
	private int somme = 2000;
	
	/**
	 * represents the type of the case
	 */
	public String start="Depart";
	/**
	 * represents the position  of the case
	 */
	public int startposition=0;
	/**
	 * represents the name of the case
	 */
	public String namestart="Depart";
	
	
	/**
	 * Allows to create the start's case on the board
	 */
	public Depart()
	{
		this.type = this.start;
		this.position = this.startposition;
		this.nom = this.namestart;
	}
	

	/**
	 * Method to give money to the player when he passed by the start'case
	 */
	public void verserArgent()	
	{
			// add 2000 
			// money of the player + this.somme
	}



}