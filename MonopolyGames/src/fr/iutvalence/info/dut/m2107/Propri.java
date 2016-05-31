package fr.iutvalence.info.dut.m2107;

/**
 *  Represent a property case
 * @author reyqu
 *
 */
public class Propri extends Case {
	
	
	/**
	 * Says the name of player who have the property
	 */
	private static Joueur proprietaire;
	
	/**
	 * Says the price property
	 */
	private int prix_achat;
	
	/**
	 * Says the price who paid other player each time players go here
	 */
	private int prix_loyer;

	

	/**
	 * Represents the pay of player
	 */
	public void payerLoyer() 
	{
		
	}
	
	public Propri(String thetype, int position, int PriceForBuy, int Fine , Joueur Propri)
	{
		this.nom=thetype;
		this.position= position;
		this.prix_achat=PriceForBuy;
		this.prix_loyer=Fine;
		this.setProprietaire(Propri);
	}

	public int getPrix_achat() 
	{
		return prix_achat;
	}
	
	public int getPrix_Loyer() 
	{
		return prix_loyer;
	}

	
	/**
	 * Represents a property buy by a player 
	 */
	public Joueur getProprietaire() {
		return proprietaire;
	}

	public static void setProprietaire(Joueur newproprietaire) 
	{
		proprietaire = newproprietaire;
	}

	
	
	

}