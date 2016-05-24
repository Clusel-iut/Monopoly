package fr.iutvalence.info.dut.m2107;


/**
 * Class where methods of the Monopoly games are called
 * @author martithi
 *
 */
public class MonopolyGame
{
	
	/**
	 * player inputs table
	 */
	private Joueur[] players;

	/**
	 * rack inputs table
	 */
	private Rack racks;


	/**
	 * Creates a new monopoly game
	 */
	public MonopolyGame()
	{

	this.racks = new Rack();	
	this.players = new Joueur[2];
	this.players[0] = new Joueur();
	this.players[1] = new Joueur();
		
	}
	
	/**
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
	 * 		action()
	 * 		currentPlayer = the other player
	 * 			
	 * 				
	 * 		
	 * 		
	 */	
	public void Play()
	{
		this.players=players[0]
		while (notFinished)
			if (De.isDouble())
				De.lancerDe()
			
	
		
	
			
				
		
	}
	}
	

}
