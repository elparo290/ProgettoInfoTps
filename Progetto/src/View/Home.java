package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JButton btnNewButton = new JButton("ACCEDI");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(60, 207, 111, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTRATI");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(246, 207, 124, 21);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("PAROGATI DISCO");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(92, 38, 292, 89);
		add(lblNewLabel);

	}

}
