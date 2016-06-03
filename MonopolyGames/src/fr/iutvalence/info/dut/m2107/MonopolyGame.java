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
	
	/**
	 * 
	 */
	private Case[] plateau;
	
	
	/**
	 * 
	 */
	private int avancer1;

	/**
	 * represent the dice for advance on the board
	 */
	private De dice;
	
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public int getAvancer1()
	{
		return this.avancer1;
	}

	/**
	 * @param avancer1
	 */
	public void setAvancer1(int avancer1)
	{
		this.avancer1 = avancer1;
	}

	/**
	 * Creates a new monopoly game
	 */
	
	public MonopolyGame()
	{
		this.Players = new ArrayList<Joueur>();
		this.Players.add(new Joueur("Clu","jd"));
		this.Players.add(new Joueur("Rey","Quentin"));
		this.NbOfCurrentPlayer = this.Players.size() -1;
		this.plateau = new Case[40];
		this.plateau[0] = new Depart();
		this.plateau[1] = new Propri("Belleville", 1, 60, 100, null);
		this.plateau[2] = new CaisseDeCommunaute(2);
		this.plateau[3] = new Propri("Lecourbe", 3, 60, 100, null);
		this.plateau[4] = new Impots(4,500);
		this.plateau[5] = new Gare(5,null);
		this.plateau[6] = new Propri("Vaugirard", 6, 100, 150, null);
		this.plateau[7] = new Chance(7);
		this.plateau[8] = new Propri("Coucelles", 8, 100, 150, null);
		this.plateau[9] = new Propri("Republique", 9, 120, 200, null);
		this.plateau[10] = new Propri("SimpleVisite", 10, 50, 100, null);
		this.plateau[11] = new Propri("La Villette", 11, 140, 300, null);
		this.plateau[12] = new Impots(12,600);
		this.plateau[13] = new Propri("Neuilly", 13, 140, 300, null);
		this.plateau[14] = new Propri("Paradis", 14, 160, 350, null);
		this.plateau[15] = new Gare(15,null);
		this.plateau[16] = new Propri("Mozart", 16, 180, 400, null);;
		this.plateau[17] = new CaisseDeCommunaute(17);
		this.plateau[18] = new Propri("Saint-Michel", 18, 180, 400, null); 
		this.plateau[19] = new Propri("Pigalle", 19, 200, 450, null);
		this.plateau[20] = new Propri("Parc gratuit", 20, 50, 100, null);
		this.plateau[21] = new Propri("Matignon", 21, 220, 500, null);
		this.plateau[22] = new Chance(22);
		this.plateau[23] = new Propri("Malesherbes", 23, 220, 500, null);
		this.plateau[24] = new Propri("Henri-Martin", 24, 240, 550, null);
		this.plateau[25] = new Gare(25,null);
		this.plateau[26] = new Propri("Saint-Honore", 26, 260, 600, null);
		this.plateau[27] = new Propri("La Bourse", 27, 260, 600, null);
		this.plateau[28] = new Impots(28,500);
		this.plateau[29] = new Propri("La Fayette", 29, 280, 650, null);
		this.plateau[30] = new Prison();
		this.plateau[31] = new Propri("Breteuil", 31, 300, 700, null);
		this.plateau[32] = new Propri("Foch", 32, 300, 700, null);
		this.plateau[33] = new CaisseDeCommunaute(33);
		this.plateau[34] = new Propri("Capucines", 34, 320, 750, null);;
		this.plateau[35] = new Gare(35,null);
		this.plateau[36] = new Chance(36);
		this.plateau[37] = new Propri("Champs-Elysees", 37, 350, 800, null);
		this.plateau[38] = new Propri("Taxe de luxe", 38, 50, 100, null);
		this.plateau[39] = new Propri("La paix", 39, 400, 900, null);

	
		
	}
	
	
	/**
	 * 
	 */
	private int position;
	
	/**
	 * 
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
		
		int i=0;		
		int value_card=0;		
		while (i <= this.NbOfCurrentPlayer)
		{	
			this.avancer1 = this.dice.lancerDe();			
			this.Players.get(i).Avancer(this.avancer1);			
			this.position  =  this.Players.get(i).getPlayerPosition();			
			Propri lacase = (Propri) this.plateau[this.position];			
			if (lacase.getPosition() == 7 || lacase.getPosition() == 22 || lacase.getPosition() == 36 )
			{
				value_card=Chance.tirerCarteChance();				
				if ( value_card == 1)
				{
					AllerEnPrison variable = new AllerEnPrison();
					this.Players.get(i).setPlayerPosition(variable.allerEnPrison()) ;
				}				
				if ( value_card == 2)
				{
					this.Players.get(i).addMoney(600);
				}
				if ( value_card == 3)
				{
					
					this.Players.get(i).deleteMoney(500);
				}				
				break;				
			}
			if (lacase.getPosition() == 2 || lacase.getPosition() == 17 || lacase.getPosition() == 33)
			{
				value_card=CaisseDeCommunaute.tirerCarteCommunaute();				
				if ( value_card == 1)
				{
					AllerEnPrison variable = new AllerEnPrison();
					this.Players.get(i).setPlayerPosition(variable.allerEnPrison()) ;
				}				
				if ( value_card == 2)
				{
					this.Players.get(i).addMoney(600);
				}				
				if ( value_card == 3)
				{
					this.Players.get(i).deleteMoney(500);
				}				
								
				else if (lacase.getPosition() == 30)
				{
					AllerEnPrison variable = new AllerEnPrison();
					this.Players.get(i).setPlayerPosition(variable.allerEnPrison()) ;
					continue;
				}
				else if (lacase.getPosition() == 28 || (lacase.getPosition()) == 12 || (lacase.getPosition()) == 4 )
				{
					this.Players.get(i).deleteMoney(500);
				}
			}
			else if (lacase.getProprietaire() == this.Players.get(i))
			{
				//he is the owner of the case
				if ( /* he want to sell */ i == 0 )
				{
					Propri.setProprietaire(null);
					this.Players.get(i).addMoney(lacase.getPrix_achat());
				}
				
				
			}
			else if ((lacase.getProprietaire() == null) && (this.Players.get(i).getMoney() + lacase.getPrix_achat()) >= 0 )
			{
				//ask to buy				
				//if the player want to be to the owner
				if ( /* he want */ i == 0)
				{
					Propri.setProprietaire(this.Players.get(i));
					this.Players.get(i).deleteMoney(lacase.getPrix_achat());
				}				
				break;				
			}
			else if (lacase.getProprietaire() != null)
			{
				this.Players.get(i).deleteMoney(lacase.getPrix_Loyer());
				lacase.getProprietaire().addMoney(lacase.getPrix_Loyer());
			}
					
			if (this.Players.get(i).homeless())
			{
				this.Players.remove(i);
				this.NbOfCurrentPlayer = this.Players.size();
			}
			
			if ( Banque.getBankMoney() == 0)
			{
				Banque.Banqueroute();
			}
			
			i++;
			
			if (i == this.NbOfCurrentPlayer)
			{
				i = 0;
			}
					   
			
		}
						
		
	}

	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
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

	
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public Case[] getPlateau()
	{
		return this.plateau;
	}

	/**
	 * @param plateau
	 */
	public void setPlateau(Case[] plateau)
	{
		this.plateau = plateau;
	}

	

}

