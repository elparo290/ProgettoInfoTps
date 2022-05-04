package Controller;
import Model.Amministratore;
import Model.Evento;

public class GestisciAmministatore {
	
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
}
mkgòsdlf