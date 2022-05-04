package Model;

import java.util.ArrayList;

public class Prenotazione {
	
	private static ArrayList<Prenotazione> anagrafica = null;
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
	
	public Prenotazione(Utente persona,UtenteGenerico[] persone,int numPrenotazione)
	{
		this.setPersona(persona);
		this.persone=persone;
		this.setNumeroPersone(persone.length);
		this.setNumPrenotazione(numPrenotazione);
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
