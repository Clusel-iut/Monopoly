package fr.iutvalence.info.dut.m2107;

/**
 * Represents the class Main
 * It's where we launch the game.
 * @author cluselm
 *
 */
public class Main
{

	/**
	 * 
	 * @param args
	 * ALGORITHM:
	 * 
	 * Play the game
	 * 
	 * currentPlayer = Player1
	 * while notFinished
	 * 		while isDouble()
	 * 			lancerDe()
	 * 		lancerDe()
	 * 		seDeplacer()
	 * 		action() --> ( acheter(), vendre(), .. )
	 * 		currentPlayer = the other player	
	 * 		
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//new MonopolyGame.Play;
		new IHM_Depart();
		new IHM_Joueur();

	}

}
