package fr.iutvalence.info.dut.m2107;

/**
 * Class representing a terrain ???
 * 
 * @author martithi
 *
 */
public class Terrain extends Propri {

	/**
	 * Price to build
	 */
	private int prix_construire;
	
	/**
	 * Number of house on the terrain
	 */
	private int nb_maisons;
	
	/**
	 * Color of houses etc, that is to say at which player are they 
	 */
	private int couleur;
	
	/**
	 * Method to get the price to build on this place
	 * @return prix_construire
	 */
	public int getPrix_construire()
	
	{
		return prix_construire;
	}
	
	/**
	 * Method to set the price to build
	 * @param prix_construire
	 */
	public void setPrix_construire(int prix_construire)
	
	
	{
		this.prix_construire = prix_construire;
	}
	
	/**
	 * Method to view the number of houses
	 * @return nb_maisons
	 */
	public int getNb_maisons()
	
	{
		return nb_maisons;
	}
	
	/**
	 * Method to set number of houses   
	 *
	 * ???????????????
	 * 
	 * @param nb_maisons
	 */
	public void setNb_maisons(int nb_maisons)
	
	{
		this.nb_maisons = nb_maisons;
	}
	
	/**
	 * Method to view player's color to identify who is at who
	 * @return couleur
	 */
	public int getCouleur()
	{
		return couleur;
	}
	
	/**
	 * Method to set color 
	 * 
	 * ????????????????
	 * 
	 * @param couleur
	 */
	public void setCouleur(int couleur)
	{
		this.couleur = couleur;
	}

}