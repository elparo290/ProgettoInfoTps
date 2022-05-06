package View;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class ViewPrenotEven extends JPanel {

	/**
	 * Create the panel.
	 */
	public ViewPrenotEven() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JTextPane txtpnNonCiSono = new JTextPane();
		txtpnNonCiSono.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtpnNonCiSono.setText("Non c'\u00E8 nulla da vedere");
		txtpnNonCiSono.setEditable(false);
		txtpnNonCiSono.setBackground(Color.WHITE);
		txtpnNonCiSono.setBounds(10, 45, 657, 446);
		add(txtpnNonCiSono);
		
		JButton btnNewButton = new JButton("ESCI");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(578, 11, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(236, 0, 257, 45);
		add(lblNewLabel_1);

	}
}
