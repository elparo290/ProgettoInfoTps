package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PrenotaEvento extends JPanel {

	/**
	 * Create the panel.
	 */
	public PrenotaEvento() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JButton btnNewButton = new JButton("ESCI");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(518, 11, 55, 23);
		add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(321, 45, 252, 280);
		add(textPane);
		
		JSpinner spinner = new JSpinner();
		spinner.setBackground(Color.MAGENTA);
		spinner.setBounds(269, 235, 48, 20);
		add(spinner);
		
		JLabel lblNewLabel = new JLabel("Quante prevendite vuoi acquistare?");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 236, 275, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(10, 15, 298, 54);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("INSERIRE IL NOME DELL'EVENTO");
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(10, 182, 252, 14);
		add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("INVIA");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(132, 284, 89, 23);
		add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(62, 203, 159, 22);
		add(comboBox);

	}
}
