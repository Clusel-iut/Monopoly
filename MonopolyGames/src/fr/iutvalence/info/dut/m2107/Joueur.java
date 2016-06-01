package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the player
 * @author martithi
 *
 */
public class Joueur {

	
	public static final int DEFAULT_MONEY = 1500;
	private static final int DEFAULT_XPOSITION = 450;
	private static final int DEFAULT_YPOSITION = 480;
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
	public int xposition;
	public int yposition;
	/**
	 * Money
	 */
	public int money;

	

	/**
	 * Method to initialize a player
	 */
	public Joueur(String Nom, String Prenom) {
		
		this.nom=Nom;
		this.prenom=Prenom;
		this.xposition=DEFAULT_XPOSITION;
		this.yposition=DEFAULT_YPOSITION;
		this.money=DEFAULT_MONEY;
		
	}

	/**
	 * 
	 * @param position
	 */
	public void Position(int position) {
		// TODO - implement Joueur.Position
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to get the position of the player at any time
	 * @return position
	 */
	public int getXPosition() 
	{
		return this.xposition;
	}
	public int getYPosition() 
	{
		return this.yposition;
	}

	/**
	 * The name of the player
	 */
	public void entrerNom() {
		// TODO - implement Joueur.entrerNom
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to move on board
	 */
	public void seDeplacer() {
		// TODO - implement Joueur.seD�placer
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to do case's action
	 */
	public void action() {
		// TODO - implement Joueur.action
		throw new UnsupportedOperationException();
	}

	/**
	 * advance the position of the pion 
	 * @param avancer
	 */
	public void Avancer(int avancer)
	{
		this.xposition= ((this.xposition+avancer) % 40);
		
		
	}
	
	public String getLastname()
	{
		return this.nom;
	}
	public String getName()
	{
		return this.prenom;
	}
	public int getMoney()
	{
		return this.money;
	}

	public void deleteMoney(int amount)
	{
		this.money -= amount;
	}
	

}
