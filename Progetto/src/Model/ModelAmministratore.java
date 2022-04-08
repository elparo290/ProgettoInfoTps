package Model;

import java.util.ArrayList;

public class ModelAmministratore {
	private ArrayList<Amministratore> amministratori;
	
	public ModelAmministratore(){}
	
	public void aggiungiUtente(Amministratore amministratore)
	{
		amministratori.add(amministratore);
	}
	
	public int cercaAmministratore(Amministratore amministratore)
	{
		int i;
		for(i=0;i<this.amministratori.size();i++)
		{
			if(this.amministratori.get(i).equals(amministratore))
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean eliminaAmministratore(Amministratore amministratore)
	{
		int pos=cercaAmministratore(amministratore);
		if(pos==-1)
		{
			return false;
		}
		amministratori.remove(pos);
		return true;
	}
	
	public Amministratore[] amministratoreJlist()
	{
		Amministratore[] amministratore = new Amministratore[this.amministratori.size()];
		for(int i=0;i<this.amministratori.size();i++)
		{
			amministratore[i]=this.amministratori.get(i);
		}
		return amministratore;
	}
	
	
	
}
