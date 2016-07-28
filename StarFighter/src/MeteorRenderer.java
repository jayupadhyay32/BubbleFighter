
public class MeteorRenderer implements Runnable {

	@Override
	public void run() {
		
		while(true)
		{
		
			long sec = System.currentTimeMillis();
			Meteor.Generate();
			try {
				Thread.sleep(1000- sec%1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}

}
