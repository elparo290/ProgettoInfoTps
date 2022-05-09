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
		
		btnNewButton = new JButton("Indietro");
		btnNewButton.setBounds(296, 10, 144, 24);
		btnNewButton.setBackground(Color.MAGENTA);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("CREA EVENTO");
		btnNewButton_1.setBounds(34, 184, 160, 23);
		btnNewButton_1.setBackground(Color.MAGENTA);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("MOSTRA EVENTI");
		btnNewButton_2.setBounds(223, 184, 160, 23);
		btnNewButton_2.setBackground(Color.MAGENTA);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setBounds(101, 25, 257, 45);
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
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
