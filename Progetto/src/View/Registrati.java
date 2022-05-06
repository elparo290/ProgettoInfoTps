package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Registrati extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Registrati() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(47, 133, 97, 13);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COGNOME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(14, 171, 180, 13);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(98, 132, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 170, 96, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(46, 210, 110, 13);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 209, 96, 19);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TELEFONO:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(14, 248, 98, 13);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(98, 247, 96, 19);
		add(textField_3);
		textField_3.setColumns(10);

	}

}
