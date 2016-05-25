package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the pawn of a player
 * @author martithi
 *
 */
public class Pion {

	/**
	 * The color of the pawn (represented by an integer)
	 */
	private int couleur;
	
	/**
	 * Both arguments are representing the x and y's position of the pawn on the board
	 */
	private int xPosition;
	private int yPosition;
	private static final int DEFAULT_XPOSITION = 0;
	private static final int DEFAULT_YPOSITION = 0;

	
	/**
	 * Method to get the position of a player's pawn
	 */
	public int getxPosition() {
		return this.xPosition;
	}
	public int getyPosition() {
		return this.yPosition;
	}
	public int getCouleur() {
		return this.couleur;
	}

	public Pion(int couleur) {
		this.couleur = couleur;
		this.xPosition = DEFAULT_XPOSITION;
		this.yPosition = DEFAULT_YPOSITION;
	}
}