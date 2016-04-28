package fr.iutvalence.info.dut.m2107

public class Rack
{
	private final int x;
	private final int y;
	private static final int DEFAULT_X=0;
	private static final int DEFAULT_Y=0;
	
	public Rack()	
	{	
		this.x = DEFAULT_X;
		this.y = DEFAULT_Y;
	}
	
	
	public Rack(int x0, int y0)	
	{	
		this.x = x0;
		this.y = y0;
	}

}
