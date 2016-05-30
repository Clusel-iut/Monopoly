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
		this.plateau[1] = new Propri("Belleville", 1, 60, 100, this.Players.get(1));
		this.plateau[2] = new CaisseDeCommunaute(2);
		this.plateau[3] = new Propri("Lecourbe", 3, 60, 100, this.Players.get(1));
		this.plateau[4] = new Impots();
		this.plateau[5] = new Gare(5,this.Players.get(1));
		this.plateau[6] = new Propri("Vaugirard", 6, 100, 150, this.Players.get(1));
		this.plateau[7] = new Chance(7);
		this.plateau[8] = new Propri("Coucelles", 8, 100, 150, this.Players.get(1));
		this.plateau[9] = new Propri("République", 9, 120, 200, this.Players.get(1));
		this.plateau[10] = new Propri("SimpleVisite", 10, 50, 100, this.Players.get(1));
		this.plateau[11] = new Propri("La Villette", 11, 140, 300, this.Players.get(1));
		this.plateau[12] = new Impots();
		this.plateau[13] = new Propri("Neuilly", 13, 140, 300, this.Players.get(1));
		this.plateau[14] = new Propri("Paradis", 14, 160, 350, this.Players.get(1));
		this.plateau[15] = new Gare(15,this.Players.get(1));
		this.plateau[16] = new Propri("Mozart", 16, 180, 400, this.Players.get(1));;
		this.plateau[17] = new CaisseDeCommunaute(17);
		this.plateau[18] = new Propri("Saint-Michel", 18, 180, 400, this.Players.get(1)); 
		this.plateau[19] = new Propri("Pigalle", 19, 200, 450, this.Players.get(1));
		this.plateau[20] = new Propri("Parc gratuit", 20, 50, 100, this.Players.get(1));
		this.plateau[21] = new Propri("Matignon", 21, 220, 500, this.Players.get(1));
		this.plateau[22] = new Chance(22);
		this.plateau[23] = new Propri("Malesherbes", 23, 220, 500, this.Players.get(1));
		this.plateau[24] = new Propri("Henri-Martin", 24, 240, 550, this.Players.get(1));
		this.plateau[25] = new Gare(25,this.Players.get(1));
		this.plateau[26] = new Propri("Saint-Honoré", 26, 260, 600, this.Players.get(1));
		this.plateau[27] = new Propri("La Bourse", 27, 260, 600, this.Players.get(1));
		this.plateau[28] = new Impots();
		this.plateau[29] = new Propri("La Fayette", 29, 280, 650, this.Players.get(1));
		this.plateau[30] = new AllerEnPrison();
		this.plateau[31] = new Propri("Breteuil", 31, 300, 700, this.Players.get(1));
		this.plateau[32] = new Propri("Foch", 32, 300, 700, this.Players.get(1));
		this.plateau[33] = new CaisseDeCommunaute(33);
		this.plateau[34] = new Propri("Capucines", 34, 320, 750, this.Players.get(1));;
		this.plateau[35] = new Gare(35,this.Players.get(1));
		this.plateau[36] = new Chance(36);
		this.plateau[37] = new Propri("Champs-Elysees", 37, 350, 800, this.Players.get(1));
		this.plateau[38] = new Propri("Taxe de luxe", 38, 50, 100, this.Players.get(1));
		this.plateau[39] = new Propri("La paix", 39, 400, 900, this.Players.get(1));

	
		
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
/*			if player[i] == loose
					this.Players.remove(i);
					this.NbOfCurrentPlayer = this.Players.size();
			if i = NbOfCurrentPlayer
					i = 0;   */
		}
						
		
	}

	/**
	 * @return
	 */
	public int getNbOfPlayer()
	{
		return this.NbOfCurrentPlayer;
	}

	/**
	 * @param nbOfPlayer
	 */
	public void setNbOfPlayer(int nbOfPlayer)
	{
		this.NbOfCurrentPlayer = nbOfPlayer;
	}

	

}

