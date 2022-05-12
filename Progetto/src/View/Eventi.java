package View;

import javax.swing.JPanel;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * 	Classe per smistarti tra creazione o visione eventi
 */

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
		btnNewButton.setBounds(847, 25, 179, 31);
		btnNewButton.setBackground(Color.MAGENTA);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("CREA EVENTO");
		btnNewButton_1.setBounds(195, 247, 240, 55);
		btnNewButton_1.setBackground(Color.MAGENTA);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("MOSTRA EVENTI");
		btnNewButton_2.setBounds(538, 247, 240, 55);
		btnNewButton_2.setBackground(Color.MAGENTA);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setBounds(303, 25, 569, 45);
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 40));
		add(lblNewLabel_1);

	}

	/**
	 * @return bottone esci 
	 */
	
	public JButton getEsci() {
		return btnNewButton;
	}
	
	/**
	 * @return bottone crea evento 
	 */
	
	public JButton getCreaEvento() {
		return btnNewButton_1;
	}
	
	/**
	 * @return bottone mostra eventi
	 */
	
	public JButton getMostraEventi() {
		return btnNewButton_2;
	}
	
	/**
	 * AddListener
	 * @param c Classe controller
	 */
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
		btnNewButton_2.addActionListener(c);
	}
}
