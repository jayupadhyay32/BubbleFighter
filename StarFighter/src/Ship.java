import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class Ship {
	
	 
	 private Main main;
	  
	
	
	 public Ship(Main main){
		this.main = main;
	}
	 ArrayList<Ammo> list = new ArrayList<Ammo>();
	 static int ya = 700; 
	 int yPoly[] = {ya,ya,ya-50};
	 static int xPoly[] = {320,420,370};
	 int x1 = 0; // Movement of the ship which is left/right. (Acceleration)
	 
	 public static int getX()
	 {
		 return xPoly[0];
		 
	 }
	 
	 public int[] gety()
	 {
		 return yPoly;
	 }
	 
	
	 public static int getY()
	 {
		 return ya; 
	 }
	 
	 
	 public void move()
		{
			
			if(xPoly[0] + x1 >= 0 && xPoly[1] + x1 <= 785){
		    xPoly[0] = xPoly[0] + x1; 
			xPoly[1] = xPoly[1] + x1;
			xPoly[2] = xPoly[2] + x1;
			}
		}
	 
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillPolygon(xPoly, yPoly, yPoly.length);
		
		 
	}
	
	public void paintA(Graphics g){
		g.setColor(Color.ORANGE);
		g.fillOval(xPoly[0]+15, yPoly[0]-5, 10, 20);
		g.fillOval(xPoly[1]-30, yPoly[0]-5, 10, 20);
	}
	
	
	
		
	public void collision()
	{
	// If the vertical value of the meteor is lower than the tip of the triangle
    // and if the horizontal value of the meteor is between the left and right tips of the triangle.
    // Game exits, as the meteor collided with ship.
		
		
		
		
	}
	
	
	public void Fire()
	{
		Ammo newAmmo = new Ammo((xPoly[0]+xPoly[1])/2);
		list.add(newAmmo);
	}
	
	public void useAmmo()
	{
		for(Ammo x:list)
		{
			x.move();
		}
		
    }
	
	public void drawAmmo(Graphics g)
	{
		Ammo x;
		for(int i = 0; i<list.size(); i++)
		{
			list.get(i).Fire(g);
			if(list.get(i).getYi() < 0-list.get(i).size)
			x = list.remove(i);              // Destroy the graphics object. 
			
			
		}
		
    }
	



	public void keypressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			x1 = 5;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			x1 = -5; 
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			Fire(); 
		}
	}



	public void keyreleased(KeyEvent e){
		
		x1 = 0;
		
	}
	
	
	

}
