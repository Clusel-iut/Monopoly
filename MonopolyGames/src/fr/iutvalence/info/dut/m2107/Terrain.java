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
	 * it's the price that a player must pay when he is on the case
	 */
	protected int loyer;
	
	/**
	 * 
	 */
	protected int PrixMaison;
	
	/**
	 * It's the player who have the case
	 * He is null if nobody have the case
	 */
	protected Joueur Propriétaire;
	
	/**
	 * It's the name of the case
	 */
	protected String NomCase;
	
	/**
	 * It's the position of the case
	 */
	protected int Position;
	
	/**
	 * represents the type of the case
	 */
	public int CaseType;
	
	/**
	 * represents the group of the case
	 */
	public int CaseGroupe;
	
	
	
	/**
	 * @param LePrix
	 * @param LeLoyer
	 * @param LePrixMaison
	 * @param Proprio
	 * @param NomCase
	 * @param LaPosition
	 * @param TypeCase
	 * @param GroupeCase
	 */
	public Terrain(int LePrix, int LeLoyer, int LePrixMaison, Joueur Proprio, String  NomCasse, int LaPosition, int TypeCase, int GroupeCase)
	{
		super(thetype, LaPosition, LePrixMaison, LeLoyer, Proprio);
		this.prix_construire=LePrix;
		this.loyer=LeLoyer;
		this.PrixMaison=LePrixMaison;
		this.Propriétaire=Proprio;
		this.NomCase=NomCasse;
		this.Position=LaPosition;
		this.CaseType=TypeCase;
		this.CaseGroupe=GroupeCase;		
		
	}
	
	
	
	
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
	
	 /**
	 * @return
	 */
	public int getCasePosition()
	    {
	        return (this.Position);
	    }
	    
	    /**
	     * @return
	     */
	    public int getCasePrix()
	    {
	        return (this.prix_construire);
	    }

	    /**
	     * @return
	     */
	    public int getCaseLoyer()
	    {
	        return (this.loyer);
	    }

	    /**
	     * @return
	     */
	    public Joueur getCaseProprietaire()
	    {
	        return (this.Propriétaire);
	    }

	    /**
	     * @param CaseProprio
	     */
	    public void setCaseProprietaire(Joueur CaseProprio)
	    {
	        Propriétaire=CaseProprio;
	    }

	    /**
	     * @return
	     */
	    public boolean estaVendre()
	    {
	        return (this.Propriétaire==null);
	    }

	    public String getCaseName()
	    {
	        return (this.NomCase);
	    }
	    
	    public int getPrixMaison()
	    {
	        return (this.PrixMaison);
	    }
	    
	    public void setnbMaison(int NbreM)
	    {
	        this.nb_maisons=NbreM;
	    }
	    
	    public int getNbreMaison()
	    {
	        return (this.nb_maisons);
	    }

}