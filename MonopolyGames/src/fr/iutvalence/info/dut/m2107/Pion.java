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
	 * X position of the pawn
	 */
	private int xPosition;
	/**
	 * Y position of the pawn
	 */
	private int yPosition;
	/**
	 * Default x position of the pawn
	 */
	private static final int DEFAULT_XPOSITION = 450;
	/**
	 * Default y position of the pawn
	 */
	private static final int DEFAULT_YPOSITION = 460;

	
	/**
	 * Method to get the x position of a player's pawn
	 * @return xPosition
	 */
	public int getxPosition() {
		return this.xPosition;
	}
	/**
	 * Method to get the y position of a player's pawn
	 * @return yPosition
	 */
	public int getyPosition() {
		return this.yPosition;
	}
	/**
	 * Method to get the color of the pawn
	 * @return couleur
	 */
	public int getCouleur() {
		return this.couleur;
	}

	/**
	 * Constructor of a pawn
	 * @param couleur
	 */
	public Pion(int couleur) {
		this.couleur = couleur;
		this.xPosition = DEFAULT_XPOSITION;
		this.yPosition = DEFAULT_YPOSITION;
	}
}