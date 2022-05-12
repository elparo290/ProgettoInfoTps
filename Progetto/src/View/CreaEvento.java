package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.chrono.ChronoLocalDate;
import java.util.Properties;

import javax.swing.JTextField;

import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Controller.Controller;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JSpinner;

/**
 * 	Classe per creare evento
 */

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
		btnNewButton.setBounds(834, 20, 205, 31);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("NOME EVENTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(280, 148, 111, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(280, 172, 112, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDataEvento = new JLabel("DATA EVENTO");
		lblDataEvento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataEvento.setBounds(645, 148, 111, 14);
		add(lblDataEvento);
		
		JLabel lblCapienzaPersone = new JLabel("CAPIENZA ");
		lblCapienzaPersone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapienzaPersone.setBounds(299, 265, 111, 14);
		add(lblCapienzaPersone);
		
		JLabel lblPrezzo = new JLabel("PREZZO");
		lblPrezzo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrezzo.setBounds(645, 265, 111, 14);
		add(lblPrezzo);
		
		spinner = new JSpinner();
		spinner.setBackground(Color.MAGENTA);
		spinner.setBounds(299, 299, 76, 20);
		add(spinner);
		
		btnNewButton_1 = new JButton("INVIA");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(443, 381, 120, 31);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(320, 18, 635, 46);
		add(lblNewLabel_1);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(632, 299, 89, 20);
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
		datePicker.setBounds(589, 172, 224, 21);
		add(datePicker);
		
	}
	
	/**
	 * @return data inserita 
	 */
	
	public JDatePickerImpl getData()
	{
		return datePicker;
	}
	
	/**
	 * @return bottone uscita
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
	 * @return persone massime inserite 
	 */
	
	public JSpinner getPersoneMax() {
		return spinner;
	}
	
	/**
	 * @return prezzo inserito
	 */
	
	public JSpinner getPrezzo() {
		return spinner_1;
	}
	
	/**
	 * @return nome evento inserito 
	 */
	
	public JTextField getNomeEvento() {
		return textField;
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
