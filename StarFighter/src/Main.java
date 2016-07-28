import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JPanel {
	
		
    Ship ship = new Ship(this);
	Meteor meteor = new Meteor(this);
	public static Main game;
	final int width =  800;
	public static final int height = 800; 
	
	public Main() {
		
		
		addKeyListener(new KeyListener(){
			
			
            public void keyReleased(KeyEvent e){
				ship.keyreleased(e);
			}
			
			public void keyPressed(KeyEvent e){
				ship.keypressed(e);
			}

			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			
		});
		setFocusable(true);
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWidth()
	{
		return width; 
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		ship.paint(g2);
		ship.paintA(g2);
		meteor.spawnMeteor(g2);
		ship.drawAmmo(g2);
		
	}
	
	public void collision()
	{
		
		
		
	}
	
	public void move() throws InterruptedException
	{
		ship.move();
		meteor.moveMeteor();
		ship.useAmmo();
		
		Thread.sleep(10); 
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		game = new Main();
		JFrame frame = new JFrame("BubbleFighter!   By: Jay U.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		frame.setSize(game.width, game.height);
		frame.setVisible(true);
	
		Thread thread = new Thread(new Renderer());
		thread.start();
		
		Thread thread2 = new Thread(new MeteorRenderer());
		thread2.start();
	
		
		
	while(true)
	{
		game.move();
		
		
	}
	
	
		
		
	}
	

}
