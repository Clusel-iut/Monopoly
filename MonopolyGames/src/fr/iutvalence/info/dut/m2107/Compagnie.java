package fr.iutvalence.info.dut.m2107;

/**

 * @author cluselm
 * Represents cases where the player must pay tax
 *
 */
public class Compagnie extends Propri
{

	/**
	 * It's a constructor which allows to build a company on the board
	 * @param thetype
	 * @param position
	 * @param PriceForBuy
	 * @param Fine
	 * @param Propri
	 */
	public Compagnie(String thetype, int position, int PriceForBuy, int Fine, Joueur Propri) 
	
	{
		super(thetype, position, PriceForBuy, Fine, Propri);
	}
	
	
	
}