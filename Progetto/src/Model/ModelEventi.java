package Model;

import java.util.ArrayList;

public class ModelEventi {
	private ArrayList<Evento> eventi;
	
	public ModelEventi(){}
	
	public void aggiungiEvento(Evento evento)
	{
		eventi.add(evento);
	}
	
	public int cercaEvento(Evento evento)
	{
		int i;
		for(i=0;i<this.eventi.size();i++)
		{
			if(this.eventi.get(i).equals(evento))
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean eliminaEvento(Evento evento)
	{
		int pos=cercaEvento(evento);
		if(pos==-1)
		{
			return false;
		}
		eventi.remove(pos);
		return true;
	}
	
	public Evento[] eventiJlist()
	{
		Evento[] evento = new Evento[this.eventi.size()];
		for(int i=0;i<this.eventi.size();i++)
		{
			evento[i]=this.eventi.get(i);
		}
		return evento;
	}
}
