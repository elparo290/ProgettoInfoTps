package Controller;

/**
 * Classe che serve per gestire gli eventi dell'amministratorevyvjhjhgjy
 */

import Model.Evento;

public class GestisciAmministatore {
	
	/**
	 * 
	 */
	
	public GestisciAmministatore()
	{
		
	}
	
	public Evento[] datiEventiInProgramma()
	{
		return (Evento[]) Evento.getAnagrafica().toArray();
	}
	
	public Evento[] storicoEventi()
	{
		return (Evento[]) Evento.getStorico().toArray();
	}
	
	public Evento[] prossimiEventi(String dataAttuale)
	{
		Evento[] futuri=new Evento[Evento.getAnagrafica().size()];
		int j=0;
		for(int i=0;Evento.getAnagrafica().size()<i;i++)
		{
			if(Evento.getAnagrafica().get(i).isFuture(dataAttuale, Evento.getAnagrafica().get(i).getDataEvento()))
			{
				futuri[j]=Evento.getAnagrafica().get(i);
				j++;
			}
		}
		return futuri;
	}
	
	public boolean aggiungiEvento(Evento evento)
	{
		return Evento.getAnagrafica().add(evento);
	}
	
	public int cercaEvento(Evento evento)
	{
		for(int i=0;i<Evento.getAnagrafica().size();i++)
			if(Evento.getAnagrafica().equals(evento)) return i;
		return -1;
	}
	
	public boolean eliminaEvento(Evento evento)
	{
		if(cercaEvento(evento)==-1) return false;
		Evento.getAnagrafica().remove(cercaEvento(evento));
		return true;
	}

	public String stampaEvento(Evento evento)
	{
		if(cercaEvento(evento)==-1) return "nessun evento trovato";
		return Evento.getAnagrafica().get(cercaEvento(evento)).toString();
	}
	
	public String stampaEventi()
	{
		String tmp="";
		for(int i=0;i<Evento.getAnagrafica().size();i++)
			tmp+=Evento.getAnagrafica().get(i).toString();
		return tmp;
	}
	
}
