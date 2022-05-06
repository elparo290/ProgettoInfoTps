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
		contentPane = new Pannello();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	}
	
	public JPanel getContentPane() {
		return contentPane;
	}
	
	public Pannello getPannello() {
		return (Pannello) contentPane;
	}
	
	public Accedi getAccedi() {
		return (Accedi) contentPane;
	}
	
	public Eventi getCreaEvento() {
		return (Eventi) contentPane;
	}
	
	public CreaEvento getEvento() {
		return (CreaEvento) contentPane;
	}
	
	public Home getHome() {
		return (Home) contentPane;
	}
	
	public PrenotaEvento getPrenotaEvento() {
		return (PrenotaEvento) contentPane;
	}
	
	public Prenotazioni getPrenotazioni() {
		return (Prenotazioni) contentPane;
	}
	
	public Registrati getRegistrati() {
		return (Registrati) contentPane;
	}
	
	public Scelta getScelta() {
		return (Scelta) contentPane;
	}
	
	public ViewPrenotEven getViewPrenotEven() {
		return (ViewPrenotEven) contentPane;
	}
	
	public void setAccedi()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new Accedi();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setCreaEvento()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new Eventi();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setEvento()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new CreaEvento();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setHome()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new Home();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setPannello()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new Pannello();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setPrenotaEvento()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new PrenotaEvento();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setPrenotazioni()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new Prenotazioni();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setRegistrati()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new Registrati();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setScelta()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new Scelta();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	public void setViewPrenotEven()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 433);
		contentPane = new ViewPrenotEven();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
}
