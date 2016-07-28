import java.awt.Color;
import java.awt.Graphics;


public class Ammo {
	
	
	int x1;
	private int Yi = Ship.getY()-50;
	int size = 5; 
	
	public Ammo(int x1)
	{
		
		this.x1 = x1;
		
	}
	
	public int getYi()
	{
		return Yi;
	}
	
	
    public void Fire(Graphics g) 
    {
    	g.setColor(Color.BLACK);
    	g.fillRect(x1, Yi, size, size);
    	
    }
     
    public void move()
    {
    	Yi = Yi-5; 
    }
     
     
}
