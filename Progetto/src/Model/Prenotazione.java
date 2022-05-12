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
	public Prenotazione(Utente persona,int numPrenotazione,int numPersone,Evento evento)
	{
		this.setPersona(persona);
		this.setNumeroPersone(numPersone);
		this.setNumPrenotazione(numPrenotazione);
		this.setEvento(evento);
		evento.setPostiRimanenti(evento.getPostiRimanenti()-this.numeroPersone);
	}
	
	/**
	 * @return Utente della prenotazione
	 */
	
	public Utente getPersona() {
		return persona;
	}

	/**
	 * Assegna l'utente alla prenotazione
	 * @param persona Utente
	 */
	
	public void setPersona(Utente persona) {
		this.persona = persona;
	}

	/**
	 * @return numero di persone nella prenotazione
	 */
	
	public int getNumeroPersone() {
		return numeroPersone;
	}

	/**
	 * Assegna numero di persone alla prenotazione
	 * @param numeroPersone numero di persone
	 */
	
	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}

	/**
	 * @return numero della prenotazione
	 */
	
	public int getNumPrenotazione() {
		return numPrenotazione;
	}

	/**
	 * Assegna numero di prenotazione alla prenotazione
	 * @param numPrenotazione numPrenotazione numero della prenotazione
	 */
	
	public void setNumPrenotazione(int numPrenotazione) {
		this.numPrenotazione = numPrenotazione;
	}

	/**
	 * @return evento inerente alla prenotazione
	 */
	
	public Evento getEvento() {
		return evento;
	}

	/**
	 * Assegna evento alla prenotazione
	 * @param evento Evento
	 */
	
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	/**
	 * metodo che ritorna stringa inerente alla prenotazione
	 */
	
	@Override
	public String toString() {
		return "Nome Utente= " + persona.getNome() + ",  numero persone= " + numeroPersone + ",  numero Prenotazione= "
				+ numPrenotazione + ", Evento= " + evento.getNome() + "\n\n";
	}
	
	
	
}
