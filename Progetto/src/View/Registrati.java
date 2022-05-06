package View;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.Properties;
import javax.swing.JButton;

public class Registrati {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrati window = new Registrati();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registrati() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(29, 59, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 59, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(29, 103, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(29, 152, 96, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Amministratore");
		rdbtnNewRadioButton.setBounds(171, 151, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 103, 96, 19);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(29, 32, 96, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMail = new JLabel("mail");
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMail.setBounds(29, 88, 96, 17);
		frame.getContentPane().add(lblMail);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefono.setBounds(29, 132, 96, 17);
		frame.getContentPane().add(lblTelefono);
		
		JLabel lblDataDiNascita = new JLabel("data di nascita");
		lblDataDiNascita.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataDiNascita.setBounds(29, 181, 96, 17);
		frame.getContentPane().add(lblDataDiNascita);
		
		JLabel lblCognome = new JLabel("cognome");
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCognome.setBounds(171, 35, 96, 17);
		frame.getContentPane().add(lblCognome);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(171, 88, 96, 17);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel_6 = new JLabel("nome");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(171, 135, 96, 17);
		frame.getContentPane().add(lblNewLabel_6);
		
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Giorno");
		p.put("text.month", "Mese");
		p.put("text.year", "Anno");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setTextEditable(true);
        datePicker.setShowYearButtons(true);
		datePicker.setBounds(29, 208, 224, 21);
		frame.getContentPane().add(datePicker);
		
		JButton btnNewButton = new JButton("Invia");
		btnNewButton.setBounds(281, 208, 85, 21);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
