
public class Renderer implements Runnable {

	@Override
	public void run() {
		while(true){
		Main.game.repaint();
		}
	}

}
