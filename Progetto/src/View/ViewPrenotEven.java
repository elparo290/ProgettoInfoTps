package View;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class ViewPrenotEven extends JPanel {

	/**
	 * Create the panel.
	 */
	
	JButton btnNewButton;
	JTextPane txtpnNonCiSono;
	
	public ViewPrenotEven() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		txtpnNonCiSono = new JTextPane();
		txtpnNonCiSono.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtpnNonCiSono.setEditable(false);
		txtpnNonCiSono.setBackground(Color.WHITE);
		txtpnNonCiSono.setBounds(10, 49, 545, 424);
		add(txtpnNonCiSono);
		
		btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(267, 10, 173, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(0, 10, 257, 45);
		add(lblNewLabel_1);

	}
	
	public void setText(String testo)
	{
		txtpnNonCiSono.setText(testo);
	}
	
	public JButton getEsci() {
		return btnNewButton;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
	}
	
}
