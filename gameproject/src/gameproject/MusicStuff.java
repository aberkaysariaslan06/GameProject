package gameproject;


	import java.io.File;
	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;
	import javax.swing.JOptionPane;

	public class MusicStuff {
		public static void playMusic (String musicLocation) {
			
			try 
			{
				File musicPath = new File (musicLocation);
				
				if (musicPath.exists()) 
				{
					
				AudioInputStream audioInput  = AudioSystem.getAudioInputStream(musicPath);
					Clip clip  = AudioSystem.getClip();
					clip.open(audioInput);
					clip.start();
					
					JOptionPane.showMessageDialog(null, "OK for paused..");
					
				}
				else {
					System.out.println("Dosya bulunamad�.");
				}
					
			}
			catch (Exception ex )
			{
					ex.printStackTrace () ; 
					
			}
			

	}

}
