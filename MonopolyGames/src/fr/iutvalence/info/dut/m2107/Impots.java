package fr.iutvalence.info.dut.m2107;

/**
 * Class representing taxes players have to pay
 * @author martithi
 *
 */
public class Impots extends Case {

	/**
	 * Represents the value of the tax
	 */
	public int valueofthetax;

	/**
	 * @param position
	 * @param impot
	 */
	public Impots(int position, int impot)
	{
		this.position = position;
		this.valueofthetax =  impot;
	}
	
	/**
	 * get the price of the tax
	 * @return value
	 */
	public int getValueOfTheTax()
	{
		return this.valueofthetax;
	}

	/**
	 * set the value of the tax's case
	 * @param newtax 
	 */
	public void setValueOfTheTax(int newtax)
	{
		this.valueofthetax = newtax;
	}
	
	/**
	 * @param tax
	 * @return 
	 */
	@SuppressWarnings("javadoc")
	public int pay(int tax)
	{
		this.valueofthetax = this.valueofthetax - tax;
		return this.valueofthetax;
	}

}