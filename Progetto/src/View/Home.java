package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.getContentPane().setLayout(null);
		
		JLabel DISCO = new JLabel("PAROGATI DISCO :)");
		DISCO.setForeground(Color.BLUE);
		DISCO.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 18));
		DISCO.setBackground(Color.MAGENTA);
		DISCO.setBounds(128, 21, 223, 51);
		frame.getContentPane().add(DISCO);
		
		JButton btnNewButton = new JButton("ACCEDI");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(59, 175, 120, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTRATI");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(254, 175, 120, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
