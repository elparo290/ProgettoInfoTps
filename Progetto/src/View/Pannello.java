package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Pannello {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pannello window = new Pannello();
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
	public Pannello() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("INIZIA");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(175, 130, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("BENVENUTO");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setBounds(161, 43, 226, 127);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("PAROGATI DISCO :)");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(Color.MAGENTA);
		lblNewLabel_1.setBounds(10, 216, 219, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
