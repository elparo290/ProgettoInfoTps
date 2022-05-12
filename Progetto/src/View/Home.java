package View;

import javax.swing.JPanel;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;

/**
 * 	Classe per smistare tra accedi o registrati
 */

public class Home extends JPanel {

	JButton btnNewButton;
	JButton btnNewButton_1;
	JLabel lblNewLabel;
	
	/**
	 * create the panel
	 */
	
	public Home() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		btnNewButton = new JButton("ACCEDI");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(215, 261, 184, 35);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("REGISTRATI");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(583, 261, 184, 35);
		add(btnNewButton_1);
		
		lblNewLabel = new JLabel("PAROGATI DISCO");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(303, 25, 569, 45);
		add(lblNewLabel);

	}

	/**
	 * @return bottone Accedi
	 */
	
	public JButton getAccedi() {
		return btnNewButton;
	}
	
	/**
	 * @return bottone Registrati
	 */
	
	public JButton getRegistrati() {
		return btnNewButton_1;
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
