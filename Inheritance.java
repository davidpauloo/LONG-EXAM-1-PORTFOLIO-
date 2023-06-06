import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;

public class Inheritance extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inheritance frame = new Inheritance();
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
	public Inheritance() {
		setTitle("Base Frame");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inheritance.class.getResource("/PICS/PORTFOLIOICON.png")));
		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//button going to Basic Information.java
		JButton btnNewButton = new JButton("Basic Information");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasicInformation.main(null);
				Inheritance.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setForeground(SystemColor.activeCaption);
		
		btnNewButton.setBounds(34, 207, 115, 21);
		contentPane.add(btnNewButton);
		//button going to Skills.java
		JButton btnSkills = new JButton("Skills");
		btnSkills.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSkills.setForeground(SystemColor.activeCaption);
		btnSkills.setBackground(SystemColor.desktop);
		btnSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skills.main(null);
        		Inheritance.this.dispose();
			}
		});
		btnSkills.setBounds(34, 238, 115, 21);
		contentPane.add(btnSkills);
		//button going to EducationalBackground.java
		JButton btnEducationalBackground = new JButton("Educational Background");
		btnEducationalBackground.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEducationalBackground.setForeground(SystemColor.activeCaption);
		btnEducationalBackground.setBackground(SystemColor.desktop);
		btnEducationalBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EducationalBackground.main(null);
        		Inheritance.this.dispose();
			}
		});
		btnEducationalBackground.setBounds(10, 302, 156, 21);
		contentPane.add(btnEducationalBackground);
		//button going to Works.java
		JButton btnWords = new JButton("Works");
		btnWords.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnWords.setForeground(SystemColor.activeCaption);
		btnWords.setBackground(SystemColor.desktop);
		btnWords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Works.main(null);
        		Inheritance.this.dispose();
			}
		});
		btnWords.setBounds(34, 270, 115, 21);
		contentPane.add(btnWords);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Inheritance.class.getResource("/PICS/046 circle (1).png")));
		lblNewLabel.setBounds(10, 35, 156, 150);
		contentPane.add(lblNewLabel);
		
		
	}
}