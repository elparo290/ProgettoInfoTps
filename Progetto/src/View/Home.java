package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JButton btnNewButton = new JButton("ACCEDI");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(60, 207, 111, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTRATI");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(246, 207, 124, 21);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("PAROGATI DISCO");
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

}
