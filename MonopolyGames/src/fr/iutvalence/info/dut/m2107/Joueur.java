package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the player
 * @author martithi
 *
 */
public class Joueur {

	
	/**
	 * Represents the money of a player at the start
	 */
	public static final int DEFAULT_MONEY = 1500;
	/**
	 * Represents the default's position horizontal of the player's button(pawn) on the board(IHM) in pixels.
	 */
	private static final int DEFAULT_XPOSITION = 450;
	/**
	 * Represents the default's position vertical of the player's button(pawn) on the board(IHM) in pixels.
	 */
	private static final int DEFAULT_YPOSITION = 480;
	/**
	 * Represents the default's position of the player's button(pawn) on the board.
	 */
	private static final int DEFAULT_PLAYERPOSITIONONTHEBOARD = 0;
	/**
	 * Player's last name
	 */
	private final String nom;
	/**
	 * Player's first name
	 */
	private final String prenom;
	/**
	 * Identifier of player
	 */
	private int num_joueur;
	/**
	 * Pawn's color
	 */
	private int couleur;
	/**
	 * Represents the position of the player's button(pawn) on the board.
	 */
	public int playerposition;
	/**
	 * Player's pawn's position on the IHM
	 */
	public int xposition;	
	/**
	 * Player's pawn's position on the IHM
	 */
	public int yposition;
	/**
	 * represents the money of the player
	 */
	public int money;

	

	/**
	 * Method to initialize a player
	 * @param Nom 
	 * @param Prenom 
	 */
	public Joueur(String Nom, String Prenom) 
	{
		this.nom = Nom;
		this.prenom = Prenom;
		this.xposition = DEFAULT_XPOSITION;
		this.yposition = DEFAULT_YPOSITION;
		this.money = DEFAULT_MONEY;
		this.playerposition = DEFAULT_PLAYERPOSITIONONTHEBOARD;		
	}
		
	/**
	 * Method to get the y position of the player in the IHM.
	 * @return x position
	 */
	
	public int getXPosition() 
	{
		return this.xposition;
	}
	
	/**
	 * Method to get the x position of the player in the IHM.
	 * @return y position
	 */
	
	public int getYPosition() 
	{
		return this.yposition;
	}
	
	/**
	 * Method to get the position of the player on the board.
	 * @return a position
	 */
	 
	public int getPlayerPosition() 
	{
		return this.playerposition;
	}	
	
	/**
	 * Allow to put the player in a case 
	 * @param newplayerposition 
	 */
	public void setPlayerPosition(int newplayerposition) 
	{
		this.playerposition = newplayerposition;
	}
	

	/**
	 * Allow to enter the name of the player
	 * The name of the player
	 */
	public void entrerNom() 
	
	{
		// ...
	}

	/**
	 * Advance the position of the pawn 
	 * @param avancer
	 */
	public void Avancer(int avancer)
	{
		this.xposition= ((this.xposition+avancer) % 40);
		
		
	}
	
	/**
	 * Allows to know the last'name of the player
	 * @return the last'name
	 */
	
	public String getLastname()
	{
		return this.nom;
	}
	
	/**
	 * Allows to know the first'name of the player
	 * @return the first'name
	 */
	public String getName()
	{
		return this.prenom;
	}
	
	/**
	 * return the money of the player
	 * @return money (integer)
	 */
	
	public int getMoney()
	{
		return this.money;
	}

	/**
	 * allows to update the money of the player
	 * @param newmoney
	 */
	public void setMoney(int newmoney) 
	{
		this.money = newmoney;
	}
	
	/**
	 * allows to add money to the player's money
	 * @param amount
	 */
	public void addMoney(int amount)
	{
		this.money += amount;
	}
	
	/**
	 * allows to remove money to the player's money
	 * @param amount
	 */
	public void deleteMoney(int amount)
	{
		this.money -= amount;
	}



	/**
	 * @return <false> if the player have any money 
	 * 		   <true> if the player havent't any money
	 */
	
	public boolean homeless()
	{
		if ( this.money < 0 )
		{
			return true;
		}
		return false;
	}



	/**
	 * Allows to access at the player's number
	 * @return number of the player
	 */
	public int getNum_joueur()
	{
		return this.num_joueur;
	}



	/**
	 * Allows to change the player's number
	 * @param num_joueur
	 */
	public void setNum_joueur(int num_joueur)
	{
		this.num_joueur = num_joueur;
	}



	/**
	 * Allows to have to color's player (color's pawn)
	 * @return color of the player (integer)
	 */
	
	public int getCouleur()
	{
		return this.couleur;
	}



	/**
	 * Allows to change the color of the player (color's pawn)
	 * @param couleur
	 */
	public void setCouleur(int couleur)
	{
		this.couleur = couleur;
	}





}
