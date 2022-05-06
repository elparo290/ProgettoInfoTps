package View;

import javax.swing.JPanel;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class Pannello extends JPanel {

	
	JButton btnNewButton;
	/**
	 * Create the panel.
	 */
	public Pannello() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		btnNewButton = new JButton("INIZIAMO");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(162, 194, 119, 21);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("BENVENUTO!!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(74, 26, 337, 77);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(94, 113, 257, 45);
		add(lblNewLabel_1);

	}

	public JButton getInizia() {
		return btnNewButton;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
	}
	
}
