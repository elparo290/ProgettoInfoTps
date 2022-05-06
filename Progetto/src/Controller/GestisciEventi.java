package Controller;

import Model.Prenotazione;
import Model.Evento;

/**
 * Classe per gestire gli eventi
 */

public class GestisciEventi {

	/**
	 * costruttore della classe
	 */
	
	public GestisciEventi()
	{
		
	}
	
	/**
	 * metodo per aggiungere una prenotazione ad un determinato evento
	 * @param evento evento al quale aggiungere la prenotazione
	 * @param prenotazione prenotazione da aggiungere
	 * @return vero se è stata inserita correttamente la prenotazione altrimenti falso
	 */
	
	public boolean aggiungiPrenotazione(Evento evento,Prenotazione prenotazione)
	{
		return evento.aggiungiPrenotazione(prenotazione);
	}
	
	/**
	 * metodo per cercare prenotazione
	 * @param evento evento di riferimento
	 * @param prenotazione prenotazione che si cerca
	 * @return posizione della prenotazione, se ritorna -1 la prenotazione non è stata trovata
	 */
	
	public int cercaPrenotazione(Evento evento,Prenotazione prenotazione)
	{
		
		for(int i=0;i<evento.getPrenotazioni().size();i++)
			if(evento.getPrenotazioni().get(i).equals(prenotazione)) return i;
		return -1;
	}
	
	/**
	 * metodo per l'eliminazione di una prenotazione
	 * @param evento evento di riferimento
	 * @param prenotazione prenotazione da cercare
	 * @return vero se elimina la prenotazione, falso se non trova prenotazione
	 */
	
	public boolean eliminaPrenotazione(Evento evento,Prenotazione prenotazione)
	{
		if(cercaPrenotazione(evento,prenotazione)==-1) return false;
		evento.getPrenotazioni().remove(cercaPrenotazione(evento,prenotazione));
		return true;
	}
	
	/**
	 * Metodo per stampare una prenotazione specifica
	 * @param evento evento di riferimento
	 * @param prenotazione prenotazione da cercare
	 * @return frase di errore se non trova la prenotazione, altrimenti toString prenotazione
	 */
	
	public String stampaPrenotazione(Evento evento,Prenotazione prenotazione)
	{
		if(cercaPrenotazione(evento,prenotazione)==-1) return "nessuna prenotazione trovata";
		return evento.getPrenotazioni().get(cercaPrenotazione(evento,prenotazione)).toString();
	}
	
	/**
	 * metodo per stampare tutte le prenotazione di un'evento
	 * @param evento evento di riferimento
	 * @return toString di tutte le prenotazione
	 */
	
	public String stampaPrenotazione(Evento evento)
	{
		String tmp="";
		for(int i=0;i<evento.getPrenotazioni().size();i++)
			tmp+=evento.getPrenotazioni().get(i).toString();
		return tmp;
	}
	
}
