package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Prenotazioni extends JPanel {

	/**
	 * Create the panel.
	 */
	public Prenotazioni() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Nuova Prenotazione");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(165, 204, 139, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mostra le mie prenotazioni");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(138, 238, 192, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ESCI");
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(385, 11, 55, 23);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(95, 27, 257, 45);
		add(lblNewLabel_1);

	}

}
