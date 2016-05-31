package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the case "Caisse de Communauté"
 * 
 * @author cluselm
 *
 */
public class CaisseDeCommunaute extends Case {
	
	public static int carte;

	/**
	 * Method to draw a card "Caisse de Communaut�"
	 */
	public int tirerCarteChance() 
	{
		carte = (int) (Math.random() * 5 + 1);
		return carte;		
	}
		
	
	public CaisseDeCommunaute(int position)
	{
		this.position=position;
	}

}