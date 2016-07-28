import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Meteor {
	
	private Main main;
	public Meteor(Main main)
	{
		this.main = main;
	}
//	private int size = 50;
//	private int x = (int) ((main.height-size)*Math.random());        // Will implement a random number generator for X coordinate.
	private static int y1 = 0;        // Y coordinate can be moved around in the vicinity of X, but not too downwards.
	
	static ArrayList<Spawn> list = new ArrayList<Spawn>();
	
	public static int getY1()
	{
		return y1;
	}
	
	
//	public void paint(Graphics g)
//	{
//		g.setColor(Color.GRAY);
//		g.fillOval(x, y1, size, size);
//		g.setColor(Color.WHITE);
//		g.fillOval(x+2,y1+2,size-5,size-5);
//	}
	
//	public void move()
//	{
//		y1 = y1+3; 
//		 
//	}
	
	public static void Generate()
	{
		
		list.add(new Spawn());    // Create a meteor object and insert into the arraylist.
		
	}
	
	public void spawnMeteor(Graphics g)
	{
		
		
		for(int i = 0; i<list.size(); i++)
		{
			list.get(i).spawn(g);       // Create graphics object. 
			list.get(i).collision();
		}
		
		
	}
	
	public void moveMeteor()
	{
		
		for(Spawn s:list)
		{
			s.move();
		}
		
	}
	
	

}
