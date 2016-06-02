package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the different case which are composing the boardgame 
 * 
 * @author martithi
 *
 */
public class Case {

	/**
	 * Represents the type of the case
	 */
	protected String type;
	
	/**
	 * Indicates the position of the case on the board
	 */
	protected int position;
	
	/**
	 * The name of the case (can be a place or jail or start or card to draw...)
	 */
	protected String nom;

	/**
	 * Method to get the type of the case
	 * @return type
	 */
	public String getType() 
	{
		return this.type;		
	}
	
	/**
	 * @return name of the player
	 */
	public String getName()
	{
		return this.nom;
	}
	
	/**
	 * @return the position of the player
	 */
	public int getPosition()
	{
		return this.position;
	}
	
	
	

}