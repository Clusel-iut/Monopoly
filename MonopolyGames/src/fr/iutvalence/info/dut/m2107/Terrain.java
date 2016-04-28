package fr.iutvalence.info.dut.m2107;

/**
 * @author cluselm
 *
 */
public class Terrain extends Propri {


	private int prix_construire;
	private int nb_maisons;
	private int couleur;
	
	
	public int getPrix_construire()
	
	{
		return prix_construire;
	}
	
	
	public void setPrix_construire(int prix_construire)
	
	
	{
		this.prix_construire = prix_construire;
	}
	
	
	public int getNb_maisons()
	
	{
		return nb_maisons;
	}
	
	public void setNb_maisons(int nb_maisons)
	
	{
		this.nb_maisons = nb_maisons;
	}
	
	public int getCouleur()
	{
		return couleur;
	}
	public void setCouleur(int couleur)
	{
		this.couleur = couleur;
	}

}