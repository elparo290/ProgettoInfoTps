package View;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import Controller.Controller;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.Point;

/**
 * 	Classe per mostrare a schermo le mie prenotazioni o i miei eventi
 */

public class ViewPrenotEven extends JPanel {

	/**
	 * Create the panel.
	 */
	JTextArea textArea;
	JScrollPane scrollPane;
	JButton btnNewButton;
	
	public ViewPrenotEven() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(267, 10, 173, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("PAROGATI DISCO");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(0, 10, 257, 45);
		add(lblNewLabel_1);
		
		textArea = new JTextArea(5, 30);
		scrollPane = new JScrollPane(textArea);
		scrollPane.setFont(new Font("Dialog", Font.ITALIC, 12));
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 61, 430, 350);
		add(scrollPane);

	}
	
	public void setText(String testo)
	{
		textArea.setText(testo);
	}
	
	public JButton getEsci() {
		return btnNewButton;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
	}
}
