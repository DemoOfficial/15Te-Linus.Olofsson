import java.net.URL;
import java.util.ArrayList;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



 public class Loop {
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			for (long i = 0; i < Long.MAX_VALUE; i++) {
				System.out.println(i);
				File newFile = new File("C:\\Users\\", String.format("%d.txt", i++));
			}
		});
		
		thread.start();
		
		ArrayList<JFrame> al = new ArrayList<>();
			JFrame frame = new JFrame();
			frame.setLocationByPlatform(true);
			frame.setSize(500, 500);
			frame.setVisible(true);
			showLoader(frame);
			al.add(frame);
		
	
	}	
	public static void showLoader(JFrame frameLoader){
		while(true){
	
        URL url = Loop.class.getResource("file://C://BS//crazyfrogbrothers.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        
        frameLoader.pack();
        frameLoader.getContentPane().add(label);
        frameLoader.setUndecorated(true);
        frameLoader.getContentPane().add(label);
        frameLoader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoader.pack();
        frameLoader.setLocationRelativeTo(null);
        frameLoader.setVisible(true);
	// ta bort/ lägg till för modifering och test Thread.sleep(1000);
	
	}
	
}}	

// Bara för jag kan