package Model;

import java.util.ArrayList;

public class ModelUtente {
	private ArrayList<Utente> utenti;
	
	public ModelUtente(){}
	
	public void aggiungiUtente(Utente utente)
	{
		utenti.add(utente);
	}
	
	public int cercaUtente(Utente utente)
	{
		int i;
		for(i=0;i<this.utenti.size();i++)
		{
			if(this.utenti.get(i).equals(utente))
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean eliminaUtente(Utente utente)
	{
		int pos=cercaUtente(utente);
		if(pos==-1)
		{
			return false;
		}
		utenti.remove(pos);
		return true;
	}
	
	public Utente[] utenteJlist()
	{
		Utente[] utente = new Utente[this.utenti.size()];
		for(int i=0;i<this.utenti.size();i++)
		{
			utente[i]=this.utenti.get(i);
		}
		return utente;
	}
	
	
	
}
