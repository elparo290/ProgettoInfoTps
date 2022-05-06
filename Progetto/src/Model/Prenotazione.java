package Model;

import java.util.ArrayList;

/**
 * Classe prenotazione che serve per creare le prenotazioni
 */

public class Prenotazione {
	
	private static ArrayList<Prenotazione> anagrafica = null;
	/**
	 * Metodo che ritorna tutte le prenotazioni salvate
	 * @return ArrayList delle prenotazioni
	 */
	public static ArrayList<Prenotazione> getAnagrafica()
	{
		if(anagrafica == null)
		{
			anagrafica = new ArrayList<Prenotazione>();
		}
		
		return anagrafica;
	}
	
	private Utente persona;
	private UtenteGenerico[] persone;
	private int numeroPersone;
	private int numPrenotazione;
	private Evento evento;
	
	/**
	 * Metodo per creare prenotazione
	 * @param persona Utente registrato che ha prenotato 
	 * @param persone Utenti non registrati che sono nella prenotazione
	 * @param numPrenotazione numero della prenotazione 
	 * @param evento evento a cui è affiliata la prenotazione
	 */
	public Prenotazione(Utente persona,UtenteGenerico[] persone,int numPrenotazione,Evento evento)
	{
		this.setPersona(persona);
		this.persone=persone;
		this.setNumeroPersone(persone.length+1);
		this.setNumPrenotazione(numPrenotazione);
		this.evento=evento;
	}

	public Utente getPersona() {
		return persona;
	}

	public void setPersona(Utente persona) {
		this.persona = persona;
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}

	public UtenteGenerico[] getPersone() {
		return persone;
	}

	public void setPersone(UtenteGenerico[] persone) {
		this.persone=persone;
	}

	public int getNumPrenotazione() {
		return numPrenotazione;
	}

	public void setNumPrenotazione(int numPrenotazione) {
		this.numPrenotazione = numPrenotazione;
	}
	
}
