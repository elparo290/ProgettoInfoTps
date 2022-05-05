package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accedi {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField txtUserId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accedi window = new Accedi();
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
	public Accedi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setToolTipText("davide");
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(129, 150, 151, 20);
		frame.getContentPane().add(passwordField);
		
		txtUserId = new JTextField();
		txtUserId.setBounds(129, 114, 151, 20);
		frame.getContentPane().add(txtUserId);
		txtUserId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("EMAIL:");
		lblNewLabel.setLabelFor(txtUserId);
		lblNewLabel.setBounds(85, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD:");
		lblNewLabel_1.setBounds(61, 153, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("ACCEDI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(160, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
