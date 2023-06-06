import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {

	private JFrame MainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainFrame = new JFrame();
		MainFrame.setAlwaysOnTop(true);
		MainFrame.setResizable(false);
		MainFrame.setTitle("DAVID INF223 PORTFOLIO\r\n");
		MainFrame.getContentPane().setBackground(new Color(0, 0, 0));
		MainFrame.getContentPane().setEnabled(false);
		MainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\INF223 DAVID PORTFOLIO\\bin\\PORTFOLIOICON.png"));
		MainFrame.getContentPane().setForeground(new Color(83, 35, 171));
		MainFrame.getContentPane().setLayout(null);
		
		JButton toNextButton = new JButton("ENTER WORLD!");
		toNextButton.addActionListener(new ActionListener() {
			//button going to the Inheritance main
			public void actionPerformed(ActionEvent e) {
				MainFrame.setVisible(false);
				Inheritance.main(null);
			
				
				}
		});
		toNextButton.setFocusPainted(false);
		toNextButton.setFocusTraversalKeysEnabled(false);
		toNextButton.setDefaultCapable(false);
		toNextButton.setBorderPainted(false);
		toNextButton.setBackground(new Color(0, 0, 0));
		toNextButton.setForeground(Color.WHITE);
		toNextButton.setBorder(null);
		toNextButton.setBounds(466, 314, 180, 23);
		MainFrame.getContentPane().add(toNextButton);
		
		JLabel mainImg = new JLabel("");
		mainImg.setForeground(Color.WHITE);
		mainImg.setIcon(new ImageIcon(MainPage.class.getResource("/PICS/NEWMAINPAGE.png")));
		mainImg.setBounds(0, 0, 809, 461);
		MainFrame.getContentPane().add(mainImg);
		MainFrame.setBounds(100, 100, 825, 500);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		


		       
		        
		     
		    }
		
	}
  