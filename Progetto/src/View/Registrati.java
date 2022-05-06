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

public class Registrati extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	
	public Registrati() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(46, 119, 97, 13);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COGNOME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(14, 143, 180, 13);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(98, 117, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 143, 96, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(246, 143, 110, 13);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(296, 117, 144, 19);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TELEFONO:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(214, 119, 98, 13);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(296, 141, 144, 19);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PASSWORD;");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(214, 167, 98, 14);
		add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(296, 167, 144, 20);
		add(passwordField);
		
		btnNewButton = new JButton("INVIA");
		btnNewButton.setBounds(183, 266, 89, 23);
		add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Amministratore");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(Color.MAGENTA);
		rdbtnNewRadioButton.setBounds(317, 194, 123, 23);
		add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_5 = new JLabel("DATA DI NASCITA;");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(14, 183, 167, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PAROGATI DISCO");
		lblNewLabel_6.setForeground(Color.CYAN);
		lblNewLabel_6.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_6.setBounds(77, 34, 322, 54);
		add(lblNewLabel_6);
		
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Oggi");
		p.put("text.month", "Mese");
		p.put("text.year", "Anno");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setTextEditable(true);
        datePicker.setShowYearButtons(true);
		datePicker.setBounds(14, 208, 224, 21);
		add(datePicker);
		
		btnNewButton_1 = new JButton("ESCI");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(385, 11, 55, 23);
		add(btnNewButton_1);
		
	}
	
	public JButton getInvia() {
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
