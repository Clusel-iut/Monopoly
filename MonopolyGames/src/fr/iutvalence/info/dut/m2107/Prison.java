package fr.iutvalence.info.dut.m2107;

/**
 * @author reyqu
 * Represents the jail which is a case
 */
public class Prison extends Case {

	/**
	 * Represents the list of players in jail
	 */
	private String nom_prisonnier;
	
	/**
	 * Represents the number of players in jail
	 */
	private int nb_prisonniers;
	
	/**
	 * Constructor of the jail's case
	 */
	public Prison()
	{
		this.type = "Prison";
		this.position = 30;
		this.nom = "Prison";
		
	}
	
	/**
	 * Method to get the name of 
	 * @return nom_prisonnier
	 */
	public String getNom_Prisonnier()
	{
		return this.nom_prisonnier;
	}
	
	/**
	 * Method to get the number of player on case prison
	 * @return nb_prisonnier
	 */
	public int getNbPrisonnier()
	{
		return this.nb_prisonniers;
	}

}