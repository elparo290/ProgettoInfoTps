package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Finestra extends JFrame {

	private JPanel contentPane;

	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new Home();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	}
	
	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel pannello) {
		this.contentPane=pannello;
	}

	public Home getContentPaneHome() {
		return (Home) contentPane;
	}
	
	public void setAccedi()
	{
		setContentPane(new Accedi());
	}
	
}
