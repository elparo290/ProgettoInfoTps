package Model;

import java.util.ArrayList;

public class ModelPrenotazioni {
	private ArrayList<Prenotazione> prenotazioni;
	public ModelPrenotazioni(){}
	
	public void aggiungiPrenotazione(Utente persona,UtenteGenerico[] persone)
	{
		prenotazioni.add(new Prenotazione(persona,persone));
	}
	
	public int cercaPrenotazione(Prenotazione prenotazione)
	{
		int i;
		for(i=0;i<this.prenotazioni.size();i++)
		{
			if(this.prenotazioni.get(i).equals(prenotazione))
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean eliminaPrenotazione(Prenotazione prenotazione)
	{
		int pos=cercaPrenotazione(prenotazione);
		if(pos==-1)
		{
			return false;
		}
		prenotazioni.remove(pos);
		return true;
	}
	
	public Prenotazione[] prenotazioniJlist()
	{
		Prenotazione[] prenotazione = new Prenotazione[this.prenotazioni.size()];
		for(int i=0;i<this.prenotazioni.size();i++)
		{
			prenotazione[i]=this.prenotazioni.get(i);
		}
		return prenotazione;
	}
	
	
}
