package fr.iutvalence.info.dut.m2107;

import java.util.ArrayList;


/**
 * Class where methods of the Monopoly games are called
 * @author martithi
 *
 */
public class MonopolyGame

{
	/**
	 * 
	 */
		
	private int NbOfCurrentPlayer = 0;

	/**
	 * player inputs table
	 */
	private ArrayList<Joueur> Players;
	
	private Case[] plateau;
	
	/**
	 * rack inputs table
	 */
	private Rack racks;
	
	
	private int avancer1;

	/**
	 * represent the dice for advance on the board
	 */
	private De dice;
	/**
	 * Creates a new monopoly game
	 */
	
	public MonopolyGame()
	{
		this.racks = new Rack();
		this.Players = new ArrayList<Joueur>();	
		this.Players.add(new Joueur("Clu","jd"));
		this.Players.add(new Joueur("Rey","Quentin"));
		this.NbOfCurrentPlayer = this.Players.size() -1;
		this.plateau = new Case[39];
		this.plateau[0] = new CaseDepart();
		this.plateau[1] = new Gare();
		
		
		
	
		
	}
	
	private int position;
	
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
		boolean PasFini = false;
		Joueur currentplayer = this.Players.get(0);
		int i=0;
		while (i <= this.NbOfCurrentPlayer)
		{	
			this.avancer1 = this.dice.lancerDe();
			this.Players.get(i).Avancer(this.avancer1);
			this.position  =  this.Players.get(i).getPosition();
			Case cas = this.board[this.position];		
			
			
			
			i++;
			if player[i] == loose
					this.Players.remove(i);
					this.NbOfCurrentPlayer = this.Players.size();
			if i = NbOfCurrentPlayer
					i = 0;
		}
						
		
	}

	/**
	 * @return
	 */
	public ArrayList getNbOfPlayer()
	{
		return this.NbOfPlayer.get();
	}

	/**
	 * @param nbOfPlayer
	 */
	public void setNbOfPlayer(ArrayList nbOfPlayer)
	{
		this.NbOfPlayer = nbOfPlayer;
	}

	

}

