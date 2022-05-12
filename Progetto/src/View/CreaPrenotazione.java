package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import Controller.Controller;
import Model.Evento;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;

/**
 * 	Classe per creare prenotazione
 */

public class CreaPrenotazione extends JPanel {

	/**
	 * Create the panel.
	 */
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JSpinner spinner;
	JComboBox<String> comboBox;
	
	public CreaPrenotazione() 
	{
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(845, 35, 176, 32);
		add(btnNewButton);
		
		JLabel lblCapienzaPersone = new JLabel("Numero persone");
		lblCapienzaPersone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapienzaPersone.setBounds(266, 181, 168, 14);
		add(lblCapienzaPersone);
		
		JLabel lblPrezzo = new JLabel("Evento");
		lblPrezzo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrezzo.setBounds(642, 181, 111, 14);
		add(lblPrezzo);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(622, 205, 101, 22);
		add(comboBox);
		
		spinner = new JSpinner();
		spinner.setBackground(Color.MAGENTA);
		spinner.setBounds(288, 207, 76, 20);
		add(spinner);
		
		btnNewButton_1 = new JButton("INVIA");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(429, 311, 131, 22);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(310, 22, 586, 45);
		add(lblNewLabel_1);

	}
	
	/**
	 * eventi da mostrare
	 * @param testo eventi
	 */
	
	public void setText(String[] testo)
	{
		comboBox.setModel(new DefaultComboBoxModel<String>(testo));
	}
	
	/**
	 * @return bottone esci
	 */
	
	public JButton getEsci() {
		return btnNewButton;
	}
	
	/**
	 * @return bottone invia 
	 */
	
	public JButton getInvia() {
		return btnNewButton_1;
	}
	
	/**
	 * @return numero persone inserite 
	 */
	
	public JSpinner getNumPersone() {
		return spinner;
	}
	
	/**
	 * @return evento scelto
	 */
	
	public JComboBox getEvento() {
		return comboBox;
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
