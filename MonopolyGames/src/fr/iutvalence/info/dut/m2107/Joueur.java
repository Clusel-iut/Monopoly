package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the player
 * @author martithi
 *
 */
public class Joueur {

	
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
	 * Player's pawn's position
	 */
	private int position;
	/**
	 * Money
	 */
	private int money;
	
	/**
	 * Represents the money of all players at the start
	 * @author cluselm
	 */
	public static final int DEFAULT_MONEY=1500;
	
	

	/**
	 * Method to initialize a player
	 * @param Nom 
	 * @param Prenom 
	 */
	public Joueur(String Nom, String Prenom) {
		
		this.nom=Nom;
		this.prenom=Prenom;
		this.money=DEFAULT_MONEY;
		
	
		
	}

	/**
	 * 
	 * @param position
	 */
	public void Position(int position) 
	{
		// TODO - implement Joueur.Position
		
	}

	/**
	 * Method to get the position of the player at any time
	 * @return position
	 */
	public int getPosition() 
	{
		return this.position;	
	}

	/**
	 * The name of the player
	 */
	public void entrerNom() 
	{
		// TODO - implement Joueur.entrerNom

	}

	/**
	 * Method to move on board
	 */
	public void seDeplacer() 
	{
		// TODO - implement Joueur.seD�placer
		
	}

	/**
	 * Method to do case's action
	 */
	public void action() 
	{
		// TODO - implement Joueur.action
		
	}

	/**
	 * advance the position of the pion 
	 * @param avancer
	 */
	public void Avancer(int avancer)
	{
		this.position= ((this.position+avancer) % 40);
		
		
	}
	
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public String getLastname()
	{
		return this.nom;
	}
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public String getName()
	{
		return this.prenom;
	}
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public int getMoney()
	{
		return this.money;
	}

	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public boolean homeless()
	{
		if (this.money <= 0)
			return true;
		return false;
	}

}
