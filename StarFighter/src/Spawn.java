import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JOptionPane;


// This class's purpose is to be called by the Meteor class, and generate meteors randomly.
// Each Spawn will generate a meteor, once collision occurs, the meteor will be destroyed. 

public class Spawn {
	
	private static Main main;
	
	private int size = 50;
	private int vertical = 0;                                            // Meteor is initialized at the top.
	private int horizontal = (int) ((main.height-size)*Math.random());   // Random horizontal spawn.
	
	public void spawn(Graphics g)
	{
		
		g.setColor(Color.GRAY);
		g.fillOval(horizontal, vertical, size, size);
		g.setColor(Color.WHITE);
		g.fillOval(horizontal+2,vertical+2,size-5,size-5); 
		
		
	}
	
	
	public void collision()
	{
		// If the vertical value of the meteor is lower than the tip of the triangle
	    // and if the horizontal value of the meteor is between the left and right tips of the triangle.
	    // Game exits, as the meteor collided with ship.
		
		Rectangle rect1 = new Rectangle(Ship.getX(), 650, 100, 50);           // Rectangle which will capture the racquet.
    	Rectangle rect2 = new Rectangle(horizontal,vertical,50,50); 
		
		
		
		if(rect1.intersects(rect2)) // intersects
		{
			JOptionPane.showMessageDialog(null, " Game Over! You collided with the bubble. ");
			System.exit(0);
		}
		
		
		
		
	}
	
	
	
	public void move()
	{
		vertical = vertical+2; 
		 
	}
	
	

}
