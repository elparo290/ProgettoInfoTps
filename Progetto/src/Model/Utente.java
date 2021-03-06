package Model;

import java.time.LocalDate;
import java.util.ArrayList;

import org.jdatepicker.impl.JDatePickerImpl;

/**
 * Classe dell'utente che deve essere registrato o pu? accedere
 * e pu? creare le prenotazioni per gli eventi
 */

public class Utente {
	
	public static ArrayList<Utente> anagrafica = null;
	
	/**
	 * Metodo che ritorno tutti gli utenti registrati
	 * @return ArrayList di tutti gli utenti registrati
	 */
	public static ArrayList<Utente> getAnagrafica()
	{
		if(anagrafica == null)
		{
			anagrafica = new ArrayList<Utente>();
		}
		return anagrafica;
	}
	
	private String mail;
	private String nome;
	private String cognome;
	private String telefono;
	private LocalDate dataDiNascita;
	private String password;
	
	/**
	 * Metodo costruttore dell'utente
	 * @param mail mail dell'utente
	 * @param nome nome dell'utente
	 * @param cognome cognome dell'utente
	 * @param telefono telefono dell'utente
	 * @param dataDiNascita data di nascita dell'utente
	 * @param password password dell'utente
	 */
	
	public Utente(String mail,String nome,String cognome,String telefono,JDatePickerImpl data,String password)
	{
		this.setMail(mail);
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTelefono(telefono);
		this.dataDiNascita = LocalDate.of(data.getModel().getYear(), data.getModel().getMonth()+1,data.getModel().getDay());
		this.setPassword(password);
		if(anagrafica == null)
		{
			anagrafica = new ArrayList<Utente>();
		}
	}

	/**
	 * Metodo costruttore dell'utente
	 * @param mail mail dell'utente
	 * @param nome nome dell'utente
	 * @param cognome cognome dell'utente
	 * @param telefono telefono dell'utente
	 * @param password password dell'utente
	 */
	
	public Utente(String mail,String nome,String cognome,String telefono,String password)
	{
		this.setMail(mail);
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTelefono(telefono);
		this.dataDiNascita=null;
		this.setPassword(password);
		if(anagrafica == null)
		{
			anagrafica = new ArrayList<Utente>();
		}
	}
	
	/**
	 * @return mail dell'utente
	 */
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return nome dell'utente
	 */
	
	public String getNome() {
		return nome;
	}

	/**
	 * Assegna nome all'utente
	 * @param nome nome dell'utente
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return cognome dell'utente
	 */
	
	public String getCognome() {
		return cognome;
	}

	/**
	 * Assegna cognonome all'utente
	 * @param cognome cognome dell'utente
	 */
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return telefono dell'utente
	 */
	
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Assegna telefono all'utente
	 * @param telefono telefono dell'utente
	 */
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return data di nascita dell'utente
	 */
	
	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	/**
	 * Assegna data di nascita all'utente
	 * @param dataDiNascita data di nascita dell'utente
	 */
	
	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	/**
	 * metodo che ritorna stringa inerente all'Utente
	 */
	
	@Override
	public String toString() {
		return ""+mail+"  "+nome+"  "+cognome+"  "+telefono+"  "+dataDiNascita;
	}

	/**
	 * @return password dell'utente
	 */
	
	public String getPassword() {
		return password;
	}

	/**
	 * Assegna password all'utente
	 * @param password password dell'utente
	 */
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
