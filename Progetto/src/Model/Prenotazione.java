package Model;

public class Prenotazione {
	private Utente persona;
	private UtenteGenerico[] persone;
	private int numeroPersone;
	
	public Prenotazione(Utente persona,UtenteGenerico[] persone)
	{
		this.setPersona(persona);
		this.persone=persone;
		this.setNumeroPersone(persone.length);
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
	
}
