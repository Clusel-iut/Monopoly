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
	private Rack[] racks;


	/**
	 * Creates a new monopoly game
	 */
	public MonopolyGame()
	{

	this.racks = new Rack[2];
	this.racks[0]= new Rack();
	this.racks[1] = new Rack();
	this.players = new Joueur[2];
	this.players[0] = new Joueur();
	this.players[1] = new Joueur();
		
	}
	

}
