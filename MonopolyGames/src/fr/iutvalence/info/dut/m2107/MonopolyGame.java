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
	private static ArrayList<Joueur> Players;
	
	/**
	 * 
	 */
	private Case[] plateau;
	
	/**
	 * rack inputs table
	 */
	private Rack racks;
	
	
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
	
	@SuppressWarnings("static-access")
	public MonopolyGame()
	{
		this.racks = new Rack();
		Players = new ArrayList<Joueur>();
		this.Players.add(new Joueur("Clu","jd"));
		this.Players.add(new Joueur("Rey","Quentin"));
		this.NbOfCurrentPlayer = this.Players.size() -1;
		this.setPlateau(new Case[40]);
		this.getPlateau()[0] = new Depart();
		this.getPlateau()[1] = new Propri("Belleville", 1, 60, 100, this.Players.get(1));
		this.getPlateau()[2] = new CaisseDeCommunaute(2);
		this.getPlateau()[3] = new Propri("Lecourbe", 3, 60, 100, this.Players.get(1));
		this.getPlateau()[4] = new Impots(500);
		this.getPlateau()[5] = new Gare(5,this.Players.get(1));
		this.getPlateau()[6] = new Propri("Vaugirard", 6, 100, 150, this.Players.get(1));
		this.getPlateau()[7] = new Chance(7);
		this.getPlateau()[8] = new Propri("Coucelles", 8, 100, 150, this.Players.get(1));
		this.getPlateau()[9] = new Propri("Republique", 9, 120, 200, this.Players.get(1));
		this.getPlateau()[10] = new Propri("SimpleVisite", 10, 50, 100, this.Players.get(1));
		this.getPlateau()[11] = new Propri("La Villette", 11, 140, 300, this.Players.get(1));
		this.getPlateau()[12] = new Impots(600);
		this.getPlateau()[13] = new Propri("Neuilly", 13, 140, 300, this.Players.get(1));
		this.getPlateau()[14] = new Propri("Paradis", 14, 160, 350, this.Players.get(1));
		this.getPlateau()[15] = new Gare(15,this.Players.get(1));
		this.getPlateau()[16] = new Propri("Mozart", 16, 180, 400, this.Players.get(1));;
		this.getPlateau()[17] = new CaisseDeCommunaute(17);
		this.getPlateau()[18] = new Propri("Saint-Michel", 18, 180, 400, this.Players.get(1)); 
		this.getPlateau()[19] = new Propri("Pigalle", 19, 200, 450, this.Players.get(1));
		this.getPlateau()[20] = new Propri("Parc gratuit", 20, 50, 100, this.Players.get(1));
		this.getPlateau()[21] = new Propri("Matignon", 21, 220, 500, this.Players.get(1));
		this.getPlateau()[22] = new Chance(22);
		this.getPlateau()[23] = new Propri("Malesherbes", 23, 220, 500, this.Players.get(1));
		this.getPlateau()[24] = new Propri("Henri-Martin", 24, 240, 550, this.Players.get(1));
		this.getPlateau()[25] = new Gare(25,this.Players.get(1));
		this.getPlateau()[26] = new Propri("Saint-Honore", 26, 260, 600, this.Players.get(1));
		this.getPlateau()[27] = new Propri("La Bourse", 27, 260, 600, this.Players.get(1));
		this.getPlateau()[28] = new Impots(500);
		this.getPlateau()[29] = new Propri("La Fayette", 29, 280, 650, this.Players.get(1));
		this.getPlateau()[30] = new AllerEnPrison();
		this.getPlateau()[31] = new Propri("Breteuil", 31, 300, 700, this.Players.get(1));
		this.getPlateau()[32] = new Propri("Foch", 32, 300, 700, this.Players.get(1));
		this.getPlateau()[33] = new CaisseDeCommunaute(33);
		this.getPlateau()[34] = new Propri("Capucines", 34, 320, 750, this.Players.get(1));;
		this.getPlateau()[35] = new Gare(35,this.Players.get(1));
		this.getPlateau()[36] = new Chance(36);
		this.getPlateau()[37] = new Propri("Champs-Elysees", 37, 350, 800, this.Players.get(1));
		this.getPlateau()[38] = new Propri("Taxe de luxe", 38, 50, 100, this.Players.get(1));
		this.getPlateau()[39] = new Propri("La paix", 39, 400, 900, this.Players.get(1));

	
		
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
		int valeur_carte=0;		
		while (i <= this.NbOfCurrentPlayer)
		{	
			this.avancer1 = this.dice.lancerDe();			
			this.Players.get(i).Avancer(this.avancer1);			
			this.position  =  this.Players.get(i).getPosition();			
			Propri lacase = (Propri) this.plateau[this.position];			
			if (lacase.getPosition() == 7 || lacase.getPosition() == 22 || lacase.getPosition() == 36 )
			{
				valeur_carte=Chance.tirerCarteChance();				
				if ( valeur_carte == 1)
				{
					this.Players.get(i).getPosition() ;
				}				
				if ( valeur_carte == 2)
				{
					this.Players.get(i).getMoney() + addMoney(1200);
				}				
				if ( valeur_carte == 3)
				{
					this.Players.get(i).getMoney() + deleteMoney(1500);
				}				
				break;				
			}
			if (lacase.getPosition() == 2 || lacase.getPosition() == 17 || lacase.getPosition() == 33)
			{
				valeur_carte=CaisseDeCommunaute.tirerCarteCommunaute();				
				if ( valeur_carte == 1)
				{
					this.Players.get(i).getPosition() = AllerEnPrison();
				}				
				if ( valeur_carte == 2)
				{
					this.Players.get(i).getMoney() + addMoney(1200);
				}				
				if ( valeur_carte == 3)
				{
					this.Players.get(i).getMoney() + deleteMoney(1500);
				}				
				break;				
			}
			else if ((lacase.getProprietaire() == null) || (this.Players.get(i).getMoney() + Argent.deleteMoney(lacase.getPrix_achat())) <= 0 )
			{
				//ask to buy				
				//if the player want to be to the owner
				if ( // he want)
				{
					Propri.setProprietaire(this.Players.get(i));
				}				
				break;				
			}
			else if (lacase.getProprietaire() != null)
			{
				(this.Players.get(i).getMoney() + Argent.deleteMoney(lacase.getPrix_Loyer()));
			}
			else if (lacase.getPosition() == 30)
			{
				this.Players.get(i).getPosition() = AllerEnPrison();
				continue;
			}
			else if (lacase.getPosition() == 28 || (lacase.getPosition()) == 12 )
			{
				this.Players.get(i).getMoney().pay(Impots.getSomme());
			}
			
			
			if (this.Players.get(i).homeless())
			{
				this.Players.remove(i);
				this.NbOfCurrentPlayer = this.Players.size();
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

