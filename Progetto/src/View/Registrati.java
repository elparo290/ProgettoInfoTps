package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Properties;

import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Controller.Controller;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 * 	Classe per fare registrare un nuovo utente
 */

public class Registrati extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JRadioButton rdbtnNewRadioButton;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JDatePickerImpl datePicker;
	
	public Registrati() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(248, 216, 97, 13);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COGNOME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(248, 270, 180, 13);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(352, 210, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(352, 264, 96, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(495, 270, 110, 13);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(601, 210, 167, 19);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TELEFONO:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(495, 216, 98, 13);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(601, 264, 167, 19);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PASSWORD;");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(495, 328, 98, 14);
		add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(601, 322, 167, 20);
		add(passwordField);
		
		btnNewButton = new JButton("INVIA");
		btnNewButton.setBounds(412, 481, 161, 31);
		add(btnNewButton);
		
		rdbtnNewRadioButton = new JRadioButton("Amministratore");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(Color.MAGENTA);
		rdbtnNewRadioButton.setBounds(495, 389, 224, 31);
		add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_5 = new JLabel("DATA DI NASCITA;");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(65, 328, 167, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PAROGATI DISCO");
		lblNewLabel_6.setForeground(Color.CYAN);
		lblNewLabel_6.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_6.setBounds(303, 25, 569, 45);
		add(lblNewLabel_6);
		
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Oggi");
		p.put("text.month", "Mese");
		p.put("text.year", "Anno");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setTextEditable(true);
        datePicker.setShowYearButtons(true);
		datePicker.setBounds(224, 321, 224, 21);
		add(datePicker);
		
		btnNewButton_1 = new JButton("Indietro");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(847, 25, 179, 31);
		add(btnNewButton_1);
		
	}
	
	/**
	 * @return data inserita 
	 */
	
	public JDatePickerImpl getData()
	{
		return datePicker;
	}
	
	/**
	 * @return nome inserito
	 */
	
	public JTextField getNome()
	{
		return textField;
	}
	
	/**
	 * @return cognome inserito
	 */
	
	public JTextField getCognome()
	{
		return textField_1;
	}
	
	/**
	 * @return telefono inserito
	 */
	
	public JTextField getTelefono()
	{
		return textField_2;
	}
	
	/**
	 * @return mail inserita 
	 */
	
	public JTextField getMail()
	{
		return textField_3;
	}
	
	/**
	 * @return password inserita 
	 */
	
	public JPasswordField getPassword()
	{
		return passwordField;
	}
	
	/**
	 * @return bottone amministratore
	 */
	
	public JRadioButton getAmministratore()
	{
		return rdbtnNewRadioButton;
	}
	
	/**
	 * @return bottone invia 
	 */
	
	public JButton getInvia() {
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
		rdbtnNewRadioButton.addActionListener(c);
	}
	
}
