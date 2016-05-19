package fr.iutvalence.info.dut.m2107;

/**
 * Class representing the rack (the board) of the Monopoly game
 * 
 * @author martithi
 *
 */
public class Rack
{
	/**
	 * ???
	 */
	private final int x;
	private final int y;
	private static final int DEFAULT_X=0;
	private static final int DEFAULT_Y=0;
	
	/**
	 * Method to generate the board at the launch of the game 
	 * ???????
	 */
	public Rack()	
	{	
		this.x = DEFAULT_X;
		this.y = DEFAULT_Y;
	}
	
	/**
	 * ?????
	 * @param x0
	 * @param y0
	 */
	public Rack(int x0, int y0)	
	{	
		this.x = x0;
		this.y = y0;
	}

}
