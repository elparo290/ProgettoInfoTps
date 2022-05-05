package Controller;

import Model.Prenotazione;
import Model.Evento;

public class GestisciEventi {
	
	public GestisciEventi()
	{
		
	}
	
	public boolean aggiungiPrenotazione(Evento evento,Prenotazione prenotazione)
	{
		return evento.aggiungiPrenotazione(prenotazione);
	}
	
	public int cercaPrenotazione(Evento evento,Prenotazione prenotazione)
	{
		
		for(int i=0;i<evento.getPrenotazioni().size();i++)
			if(evento.getPrenotazioni().get(i).equals(prenotazione)) return i;
		return -1;
	}
	
	public boolean eliminaPrenotazione(Evento evento,Prenotazione prenotazione)
	{
		if(cercaPrenotazione(evento,prenotazione)==-1) return false;
		evento.getPrenotazioni().remove(cercaPrenotazione(evento,prenotazione));
		return true;
	}
	
	public String stampaPrenotazione(Evento evento,Prenotazione prenotazione)
	{
		if(cercaPrenotazione(evento,prenotazione)==-1) return "nessuna prenotazione trovata";
		return evento.getPrenotazioni().get(cercaPrenotazione(evento,prenotazione)).toString();
	}
	
	public String stampaPrenotazione(Evento evento)
	{
		String tmp="";
		for(int i=0;i<evento.getPrenotazioni().size();i++)
			tmp+=evento.getPrenotazioni().get(i).toString();
		return tmp;
	}
	
}
