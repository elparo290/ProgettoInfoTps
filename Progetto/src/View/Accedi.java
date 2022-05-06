package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import Controller.Controller;

import javax.swing.JPasswordField;
import javax.swing.JButton;

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
		lblNewLabel.setBounds(94, 152, 143, 13);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(161, 152, 136, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(58, 192, 140, 13);
		add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 192, 136, 19);
		add(passwordField);
		
		btnNewButton = new JButton("ACCEDI");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(161, 245, 85, 21);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("PAROGATI DISCO");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(124, 63, 241, 38);
		add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("ESCI");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(351, 10, 89, 19);
		add(btnNewButton_1);

	}
	
	public JTextField getMail()
	{
		return textField;
	}
	
	public JPasswordField getPassword()
	{
		return passwordField;
	}
	
	public JButton getAccedi() {
		return btnNewButton;
	}
	
	public JButton getEsci() {
		return btnNewButton_1;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
	}
	
}
