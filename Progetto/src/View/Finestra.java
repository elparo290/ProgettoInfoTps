package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * 	Classe per fare la finestra.
 * 
 */

public class Finestra extends JFrame {

	private JPanel contentPane;

	/**
	 * metodo costruttore finestra
	 */
	
	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new Pannello();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	}
	
	/**
	 * @return pannello generico
	 */
	
	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @return pannello Pannello
	 */
	
	public Pannello getPannello() {
		return (Pannello) contentPane;
	}
	
	/**
	 * @return pannello Accedi
	 */
	
	public Accedi getAccedi() {
		return (Accedi) contentPane;
	}
	
	/**
	 * @return pannello CreaEvento
	 */
	
	public CreaEvento getCreaEvento() {
		return (CreaEvento) contentPane;
	}
	
	/**
	 * @return pannello Eventi
	 */
	
	public Eventi getEventi() {
		return (Eventi) contentPane;
	}
	
	/**
	 * @return pannello Home
	 */
	
	public Home getHome() {
		return (Home) contentPane;
	}
	
	/**
	 * @return pannello Prenotazioni
	 */
	
	public Prenotazioni getPrenotazioni() {
		return (Prenotazioni) contentPane;
	}
	
	/**
	 * @return pannello Registrati
	 */
	
	public Registrati getRegistrati() {
		return (Registrati) contentPane;
	}
	
	/**
	 * @return pannello Scelta
	 */
	
	public Scelta getScelta() {
		return (Scelta) contentPane;
	}
	
	/**
	 * @return pannello ViewPrenotEven
	 */
	
	public ViewPrenotEven getViewPrenotEven() {
		return (ViewPrenotEven) contentPane;
	}
	
	/**
	 * @return pannello CreaPrenotazione
	 */
	
	public CreaPrenotazione getCreaPrenotazione() {
		return (CreaPrenotazione) contentPane;
	}
	
	/**
	 * Assegna pannello Accedi
	 */
	
	public void setAccedi()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new Accedi();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello CreaEvento
	 */
	
	public void setCreaEvento()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new CreaEvento();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello Eventi
	 */
	
	public void setEventi()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new Eventi();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello Home
	 */
	
	public void setHome()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new Home();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello Pannello
	 */
	
	public void setPannello()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new Pannello();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello Prenotazioni
	 */
	
	public void setPrenotazioni()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new Prenotazioni();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello Registrati
	 */
	
	public void setRegistrati()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new Registrati();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello Scelta
	 */
	
	public void setScelta()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new Scelta();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello ViewPrenotEven
	 */
	
	public void setViewPrenotEven()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new ViewPrenotEven();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
	/**
	 * Assegna pannello CreaPrenotazione
	 */
	
	public void setCreaPrenotazione()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 645);
		contentPane = new CreaPrenotazione();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	
	}
	
}
