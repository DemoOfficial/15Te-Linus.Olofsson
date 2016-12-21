import javax.swing.JFrame;

public class Loop {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			for(int i = 0; i < Integer.MAX_VALUE; i++) {
				System.out.println(i);
			}
		});
		
		thread.start();
		
		while(true){ 
			JFrame frame = new JFrame();
			frame.setLocationByPlatform(true);
			frame.setSize(500, 500);
			frame.setVisible(true);
			// ta bort/ lägg till för modifering och test Thread.sleep(1000);
		}
	}
}
// Bara för jag kan