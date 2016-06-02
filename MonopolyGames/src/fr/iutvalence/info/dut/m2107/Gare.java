package fr.iutvalence.info.dut.m2107;


/**
 * Represents the station's case
 * If a player is the owner of the station, the player must give a rent.
 * @author cluselm
 *
 */
public class Gare extends Propri {
	
	
	/**
	 * 	Create a station'case on the board with a type, a position, a buy's price, a rent's price and a owner
	 * @param position
	 * @param Propri
	 */
	public Gare(int position, Joueur Propri)
	
	{
		super("Gare",  position,  250, 100, Propri);
		
	}
	
	
}