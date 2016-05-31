package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the bank's system
 * 
 * @author martithi
 *
 */
public class Banque {
	
	private static final int DEFAULT_BANK_MONEY = 20000;

	private int bank_money;

	
	

	public Banque()
	{
		this.bank_money=DEFAULT_BANK_MONEY;
	}
	
	/**
	 * Determines the money that a player has to give by the method verserArgent
	 */
	Joueur verserArgent;
	
	/**
	 * Represents the money the bank have
	 */
	private int solde;

	
	
	
	
	public int getBankMoney()
	{
		return this.bank_money;
	}
	
	
	
	/**
	 * Method to receive money
	 */
	public void recevoirArgent() {
		// TODO - implement Banque.recevoirArgent
		throw new UnsupportedOperationException();
	}

	
	/**
	 * Method to give money
	 */
	public void verserArgent() {
		// TODO - implement Banque.verserArgent
		throw new UnsupportedOperationException();
	}

}