package View;

import javax.swing.JPanel;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
<<<<<<< HEAD
import javax.swing.JTextPane;
=======
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
>>>>>>> aafab169e97c9c43090836017fc1ff3a644e8583

public class Home extends JPanel {

	JButton btnNewButton;
	JButton btnNewButton_1;
	JLabel lblNewLabel;
	
	public Home() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
<<<<<<< HEAD
		btnNewButton = new JButton("ACCEDI");
=======
		JButton btnNewButton = new JButton("ACCEDI");
		btnNewButton.setBackground(Color.MAGENTA);
>>>>>>> aafab169e97c9c43090836017fc1ff3a644e8583
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(60, 207, 111, 21);
		add(btnNewButton);
		
<<<<<<< HEAD
		btnNewButton_1 = new JButton("REGISTRATI");
=======
		JButton btnNewButton_1 = new JButton("REGISTRATI");
		btnNewButton_1.setBackground(Color.MAGENTA);
>>>>>>> aafab169e97c9c43090836017fc1ff3a644e8583
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(246, 207, 124, 21);
		add(btnNewButton_1);
		
		lblNewLabel = new JLabel("PAROGATI DISCO");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(92, 38, 292, 89);
		add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("ESCI");
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(385, 11, 55, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SIMULAZIONE THREAD\r\n");
		btnNewButton_3.setBackground(Color.MAGENTA);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(135, 130, 171, 47);
		add(btnNewButton_3);

	}

	public JButton getAccedi() {
		return btnNewButton;
	}
	
	public JButton getRegistrati() {
		return btnNewButton_1;
	}
	
	public void addListeners(Controller c) {
		btnNewButton.addActionListener(c);
		btnNewButton_1.addActionListener(c);
	}
}
