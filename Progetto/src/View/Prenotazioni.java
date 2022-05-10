package View;

import javax.swing.JPanel;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * 	Classe per smistare tra visione e creazione di una prenotazione
 */

public class Prenotazioni extends JPanel {

	/**
	 * Create the panel.
	 */
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	
	public Prenotazioni() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		btnNewButton = new JButton("Nuova Prenotazione");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(138, 204, 192, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Mostra le mie prenotazioni");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(138, 238, 192, 23);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Indietro");
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(275, 10, 165, 23);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(95, 27, 257, 45);
		add(lblNewLabel_1);

	}

	public JButton getNuovaPrenotazione() {
		return btnNewButton;
	}
	
	public JButton getMostraPrenotazioni() {
		return btnNewButton_1;
	}
	
	public JButton getEsci() {
		return btnNewButton_2;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
		btnNewButton_2.addActionListener(c);
	}
	
}
