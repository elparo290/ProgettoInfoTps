package Model;

import java.util.ArrayList;

public class Evento {
	private int personeMax;
	private String dataEvento;
	private ModelPrenotazioni prenotazioni;
	private int postiRimanenti;
	
	public Evento(int personeMax, String dataEvento)
	{
		this.personeMax=personeMax;
		this.setDataEvento(dataEvento);
		this.postiRimanenti=personeMax;
		this.prenotazioni=new ModelPrenotazioni();
	}
	
	public boolean aggiungiPrenotazione(Prenotazione prenotazione)
	{
		if(postiRimanenti+prenotazione.getNumeroPersone()<=this.personeMax)
		{
			prenotazioni.aggiungiPrenotazione(prenotazione.getPersona(), prenotazione.getPersone());
			postiRimanenti+=prenotazione.getNumeroPersone();
			return true;
		}
		return false;
	}
		
	public int cercaPrenotazione(Prenotazione prenotazione)
	{
		return prenotazioni.cercaPrenotazione(prenotazione);
	}
	
	public boolean eliminaPrenotazione(Prenotazione prenotazione)
	{
		return prenotazioni.eliminaPrenotazione(prenotazione);
	}

	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}
	
	public int getPersoneMax() {
		return personeMax;
	}

	public void setPersoneMax(int personeMax) {
		this.personeMax = personeMax;
	}
	
	public ModelPrenotazioni getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(ModelPrenotazioni prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	public int getPostiRimanenti() {
		return postiRimanenti;
	}

	public void setPostiRimanenti(int postiRimanenti) {
		this.postiRimanenti = postiRimanenti;
	}
	
}
