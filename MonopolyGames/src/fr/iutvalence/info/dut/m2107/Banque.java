package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the bank's system
 * 
 * @author martithi
 *
 */
public class Banque {
	
	/**
	 * At the beginning, the bank have this money 
	 */
	private static final int DEFAULT_BANK_MONEY = 20000;

	/**
	 * Represents the money of the bank.
	 */
	private static int bank_money;

	
	

	/**
	 * Initializes the money of the bank
	 */
	public Banque()
	{
		bank_money=DEFAULT_BANK_MONEY;
	}
	
	
	/**
	 * @return the money of the bank
	 */
	public static int getBankMoney()
	{
		return bank_money;
	}
	


}