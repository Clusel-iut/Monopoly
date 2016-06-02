package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the case "Caisse de Communauté"
 * 
 * @author cluselm
 *
 */
public class CaisseDeCommunaute extends Case {
	
	/**
	 * represent a card, it's a integer .
	 */
	public static int carte;

	/**
	 * Method to draw a card "Caisse de Communaute"
	 * @return a integer
	 */
	public static int tirerCarteCommunaute() 
	{
		carte = (int) (Math.random() * 5 + 1);
		return carte;		
	}
		
	
	/**
	 * @param position
	 * Allows to build a CaisseDeCommunaute in the board
	 */
	public CaisseDeCommunaute(int position)
	{
		this.position=position;
	}

}