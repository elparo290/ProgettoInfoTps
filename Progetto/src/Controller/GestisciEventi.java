package Controller;

import Model.Prenotazione;
import Model.Evento;

public class GestisciEventi {
	
	public GestisciEventi()
	{
		
	}
	
	public boolean aggiungiPrenotazione(Prenotazione prenotazione)
	{
		return Prenotazione.getAnagrafica().add(prenotazione);
	}
	
	public int cercaPrenotazione(Prenotazione prenotazione)
	{
		
		for(int i=0;i<Prenotazione.getAnagrafica().size();i++)
			if(Prenotazione.getAnagrafica().get(i).equals(prenotazione)) return i;
		return -1;
	}
	
	public boolean eliminaPrenotazione(Prenotazione prenotazione)
	{
		if(cercaPrenotazione(prenotazione)==-1) return false;
		Prenotazione.getAnagrafica().remove(cercaPrenotazione(prenotazione));
		return true;
	}
	
	public String stampaPrenotazione(Prenotazione prenotazione)
	{
		if(cercaPrenotazione(prenotazione)==-1) return "nessuna prenotazione trovata";
		return Prenotazione.getAnagrafica().get(cercaPrenotazione(prenotazione)).toString();
	}
	
	public String stampaPrenotazione()
	{
		String tmp="";
		for(int i=0;i<Prenotazione.getAnagrafica().size();i++)
			tmp+=Prenotazione.getAnagrafica().get(i).toString();
		return tmp;
	}
	
}
