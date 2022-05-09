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
		btnNewButton.setBounds(290, 11, 150, 23);
		add(btnNewButton);
		
		JLabel lblCapienzaPersone = new JLabel("Numero persone");
		lblCapienzaPersone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapienzaPersone.setBounds(34, 110, 168, 14);
		add(lblCapienzaPersone);
		
		JLabel lblPrezzo = new JLabel("Evento");
		lblPrezzo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrezzo.setBounds(239, 110, 111, 14);
		add(lblPrezzo);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(239, 132, 101, 22);
		add(comboBox);
		
		spinner = new JSpinner();
		spinner.setBackground(Color.MAGENTA);
		spinner.setBounds(44, 134, 76, 20);
		add(spinner);
		
		btnNewButton_1 = new JButton("INVIA");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(171, 249, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(98, 26, 257, 45);
		add(lblNewLabel_1);

	}
	
	public void setText(String[] testo)
	{
		comboBox.setModel(new DefaultComboBoxModel<String>(testo));
	}
	
	public JButton getEsci() {
		return btnNewButton;
	}
	
	public JButton getInvia() {
		return btnNewButton_1;
	}
	
	public JSpinner getNumPersone() {
		return spinner;
	}
	
	public JComboBox getEvento() {
		return comboBox;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
	}
	
}
