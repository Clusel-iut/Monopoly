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
		this.plateau = new Case[40];
		this.plateau[0] = new Depart();
		this.plateau[1] = new Gare(1,this.Players.get(1));
		this.plateau[2] = new Propri("Belleville", 2, 50, 100, this.Players.get(1));
		this.plateau[3] = new CaisseDeCommunaute();
		this.plateau[4] = new Propri("Lecourbe", 4, 50, 100, this.Players.get(1));
		this.plateau[5] = new Impots();
		this.plateau[6] = new Gare(6,this.Players.get(1));
		this.plateau[7] = new Propri("Vaugirard", 7, 50, 100, this.Players.get(1));
		this.plateau[8] = new Chance();
		this.plateau[9] = new Propri("Coucelles", 9, 50, 100, this.Players.get(1));
		this.plateau[10] = new Propri("République", 10, 50, 100, this.Players.get(1));
		this.plateau[11] = new Propri("SimpleVisite", 11, 50, 100, this.Players.get(1));
		this.plateau[12] = new Propri("La Villette", 12, 50, 100, this.Players.get(1));
		this.plateau[13] = new Impots();
		this.plateau[14] = new Propri("Neuilly", 14, 50, 100, this.Players.get(1));
		this.plateau[15] = new Propri("Paradis", 15, 50, 100, this.Players.get(1));
		this.plateau[16] = new Gare(1,this.Players.get(1));
		this.plateau[17] = new Propri("Mozart", 17, 50, 100, this.Players.get(1));;
		this.plateau[18] = new CaisseDeCommunaute();
		this.plateau[19] = new Propri("Saint-Michel", 19, 50, 100, this.Players.get(1));
		this.plateau[20] = new Propri("Pigalle", 20, 50, 100, this.Players.get(1));
		this.plateau[21] = new Propri("Parc gratuit", 21, 50, 100, this.Players.get(1));
		this.plateau[22] = new Propri("Matignon", 22, 50, 100, this.Players.get(1));
		this.plateau[23] = new Chance();
		this.plateau[24] = new Propri("Malesherbes", 24, 50, 100, this.Players.get(1));
		this.plateau[25] = new Propri("Henri-Martin", 25, 50, 100, this.Players.get(1));
		this.plateau[26] = new Gare(1,this.Players.get(1));
		this.plateau[27] = new Propri("Saint-Honoré", 27, 50, 100, this.Players.get(1));
		this.plateau[28] = new Propri("La Bourse", 28, 50, 100, this.Players.get(1));
		this.plateau[29] = new Impots();
		this.plateau[30] = new Propri("La Fayette", 30, 50, 100, this.Players.get(1));
		this.plateau[31] = new AllerEnPrison();
		this.plateau[32] = new Propri("Breteuil", 32, 50, 100, this.Players.get(1));
		this.plateau[33] = new Propri("Foch", 33, 50, 100, this.Players.get(1));
		this.plateau[34] = new CaisseDeCommunaute();
		this.plateau[35] = new Propri("Capucines", 2, 50, 100, this.Players.get(1));;
		this.plateau[36] = new Gare(1,this.Players.get(1));
		this.plateau[37] = new Chance();
		this.plateau[38] = new Propri("Champs-Elysees", 2, 50, 100, this.Players.get(1));
		this.plateau[39] = new Propri("Taxe de luxe", 2, 50, 100, this.Players.get(1));
		this.plateau[40] = new Propri("La paix", 2, 50, 100, this.Players.get(1));
		this.plateau[41] = new Prison();
		
		
	
		
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
			Case lacase = this.plateau[this.position];		
			
			
			
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

