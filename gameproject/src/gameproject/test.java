package gameproject;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.event.ActionEvent;



public class test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start !");
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					File musicPath = new File ("C:\\Users\\Ahmet Berkay\\eclipse-workspace\\Soundds\\Music.wav");
					
					if (musicPath.exists()) 
					{
						
					AudioInputStream audioInput  = AudioSystem.getAudioInputStream(musicPath);
						Clip clip  = AudioSystem.getClip();
						clip.open(audioInput);
						clip.start();
						
						//JOptionPane.showMessageDialog(null, "OK for paused..");
						
					}
					else {
						System.out.println("Dosya bulunamadý.");
					}
						
				}
				catch (Exception ex )
				{
						ex.printStackTrace () ; 
						
				}
				
				Game a = new Game();
				//BURAYA YAPIÞTIRMA 
				
				
				
				
				//test2 test2 = new test2();
				//test2.setVisible(true);
				contentPane.setVisible(false);
				

				/*JPanel deneme = new JPanel();
				deneme.add(a);
				deneme.setSize(200, 200);
				deneme.setVisible(true);*/
				
			//	a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
					/*Game a = new Game();
					a.setVisible(true);
					a.setSize(900, 900);*/
					//a.setVisible(false);
					//a.setDefaultCloseOperation(HIDE_ON_CLOSE);
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(167, 101, 120, 44);
		contentPane.add(btnNewButton);
	}
}

