package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Finestra extends JFrame {

	private JPanel contentPane;

	public Finestra(JPanel scelta) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = scelta;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	}

	public Home getContentPaneHome() {
		return (Home) contentPane;
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	
}
