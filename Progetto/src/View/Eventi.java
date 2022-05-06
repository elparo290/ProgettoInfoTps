package View;

import javax.swing.JPanel;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Eventi extends JPanel {

	/**
	 * Create the panel.
	 */
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	
	public Eventi() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		btnNewButton = new JButton("ESCI");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(385, 11, 55, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("CREA EVENTO");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(68, 184, 106, 23);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("MOSTRA EVENTI");
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(246, 184, 112, 23);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(101, 15, 257, 45);
		add(lblNewLabel_1);

	}

	public JButton getEsci() {
		return btnNewButton;
	}
	
	public JButton getCreaEvento() {
		return btnNewButton_1;
	}
	
	public JButton getMostraEventi() {
		return btnNewButton_2;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
		btnNewButton_2.addActionListener(c);
	}
	
}
