package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Properties;

import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Controller.Controller;

import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class CreaEvento extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JSpinner spinner_1;
	JSpinner spinner;
	JDatePickerImpl datePicker;
	
	public CreaEvento() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(289, 11, 151, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("NOME EVENTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(58, 96, 111, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(57, 121, 112, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDataEvento = new JLabel("DATA EVENTO");
		lblDataEvento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataEvento.setBounds(289, 98, 111, 14);
		add(lblDataEvento);
		
		JLabel lblCapienzaPersone = new JLabel("CAPIENZA ");
		lblCapienzaPersone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapienzaPersone.setBounds(72, 179, 111, 14);
		add(lblCapienzaPersone);
		
		JLabel lblPrezzo = new JLabel("PREZZO");
		lblPrezzo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrezzo.setBounds(307, 179, 111, 14);
		add(lblPrezzo);
		
		spinner = new JSpinner();
		spinner.setBackground(Color.MAGENTA);
		spinner.setBounds(72, 205, 76, 20);
		add(spinner);
		
		btnNewButton_1 = new JButton("INVIA");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(171, 249, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(99, 41, 257, 45);
		add(lblNewLabel_1);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(300, 203, 89, 20);
		add(spinner_1);
		
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Oggi");
		p.put("text.month", "Mese");
		p.put("text.year", "Anno");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setTextEditable(true);
        datePicker.setShowYearButtons(true);
		datePicker.setBounds(216, 121, 224, 21);
		add(datePicker);

	}
	
	public JDatePickerImpl getData()
	{
		return datePicker;
	}
	
	public JButton getEsci() {
		return btnNewButton;
	}
	
	public JButton getInvia() {
		return btnNewButton_1;
	}
	
	public JSpinner getPersoneMax() {
		return spinner;
	}
	
	public JSpinner getPrezzo() {
		return spinner_1;
	}
	
	public JTextField getNomeEvento() {
		return textField;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
	}
}
