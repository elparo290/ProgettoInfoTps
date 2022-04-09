package Model;

import java.util.ArrayList;

public class Utente {
	
	private static ArrayList<Utente> anagrafica = null;
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
	
	public Utente(String mail,String nome,String cognome,String telefono,String dataDiNascita)
	{
		this.setMail(mail);
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTelefono(telefono);
		this.setDataDiNascita(dataDiNascita);
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
	
}
