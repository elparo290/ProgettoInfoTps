package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class Evento extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Evento() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JButton btnNewButton = new JButton("ESCI");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(385, 11, 55, 23);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(289, 204, 101, 22);
		add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBackground(Color.MAGENTA);
		spinner.setBounds(72, 205, 76, 20);
		add(spinner);
		
		JButton btnNewButton_1 = new JButton("INVIA");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(171, 249, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(99, 15, 257, 45);
		add(lblNewLabel_1);

	}
}
