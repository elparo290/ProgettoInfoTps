package Model;

import java.util.ArrayList;

/**
 * Classe dell'utente che deve essere registrato o può accedere
 * e può creare le prenotazioni per gli eventi
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
	private String dataDiNascita;
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
	
	public Utente(String mail,String nome,String cognome,String telefono,String dataDiNascita,String password)
	{
		this.setMail(mail);
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTelefono(telefono);
		this.setDataDiNascita(dataDiNascita);
		this.setPassword(password);
		if(anagrafica == null)
		{
			anagrafica = new ArrayList<Utente>();
		}
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	@Override
	public String toString() {
		return ""+mail+"  "+nome+"  "+cognome+"  "+telefono+"  "+dataDiNascita;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
