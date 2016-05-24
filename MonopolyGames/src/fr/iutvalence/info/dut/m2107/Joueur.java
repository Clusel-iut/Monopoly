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
	private String nom;
	/**
	 * Player's first name
	 */
	private String prenom;
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
	private double position;
	/**
	 * Money
	 */
	private Argent money;

	/**
	 * Method to initialize a player
	 */
	public Joueur(String Nom, String Prenom) {
		
		this.nom=Nom;
		this.prenom=Prenom;
		this.position=Case.start;
		this.money=1500;
		
	
		
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
	 */
	public void getPosition() {
		// TODO - implement Joueur.getPosition
		throw new UnsupportedOperationException();
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

}