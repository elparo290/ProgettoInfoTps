package View;

import javax.swing.JPanel;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * 	Classe per smistare un'amministratore tra prenotazioni e eventi
 */

public class Scelta extends JPanel {

	/**
	 * Create the panel.
	 */
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	
	public Scelta() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(290, 11, 150, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("PRENOTAZIONI");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(10, 194, 201, 23);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("EVENTI");
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(221, 194, 219, 23);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(98, 31, 257, 45);
		add(lblNewLabel_1);

	}
	
	public JButton getEsci() {
		return btnNewButton;
	}
	
	public JButton getPrenotazioni() {
		return btnNewButton_1;
	}
	
	public JButton getEventi() {
		return btnNewButton_2;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
		btnNewButton_2.addActionListener(c);
	}

}
