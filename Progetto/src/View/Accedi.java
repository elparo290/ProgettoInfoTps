package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import Controller.Controller;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

/**
 * 	Classe per fare l'accesso con l'utente
 */

public class Accedi extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	JButton btnNewButton;
	JButton btnNewButton_1;
	
	/**
	 * Create the panel.
	 */
	public Accedi() {
		setBackground(Color.MAGENTA);
		setForeground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMAIL:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(386, 245, 159, 19);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(470, 245, 185, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(344, 293, 140, 13);
		add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(470, 287, 185, 19);
		add(passwordField);
		
		btnNewButton = new JButton("ACCEDI");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(429, 394, 136, 29);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("PAROGATI DISCO");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_2.setBounds(302, 10, 567, 71);
		add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("Indietro");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(849, 20, 166, 29);
		add(btnNewButton_1);

	}
	
	/**
	 * @return mail inserita 
	 */
	
	public JTextField getMail()
	{
		return textField;
	}
	
	/**
	 * @return password inserita 
	 */
	
	public JPasswordField getPassword()
	{
		return passwordField;
	}
	
	/**
	 * @return bottone accedi
	 */
	
	public JButton getAccedi() {
		return btnNewButton;
	}
	
	/**
	 * @return bottone esci
	 */
	
	public JButton getEsci() {
		return btnNewButton_1;
	}
	
	/**
	 * AddListener
	 * @param c Classe controller
	 */
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
	}
}
