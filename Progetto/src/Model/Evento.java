package Model;

import java.util.ArrayList;

public class Evento {
	private static ArrayList<Evento> storico = null;
	public static ArrayList<Evento> getStorico()
	{
		if(storico == null)
		{
			storico = new ArrayList<Evento>();
		}
		
		return storico;
	}
	private static ArrayList<Evento> anagrafica = null;
	public static ArrayList<Evento> getAnagrafica()
	{
		if(anagrafica == null)
		{
			anagrafica = new ArrayList<Evento>();
		}
		
		return anagrafica;
	}
	
	private int personeMax;
	private String dataEvento;
	private double prezzo;
	private int postiRimanenti;
	private int numPrenotazioni;
	private ArrayList<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();
	
	public Evento(int personeMax, String dataEvento,double prezzo)
	{
		this.personeMax=personeMax;
		this.setDataEvento(dataEvento);
		this.postiRimanenti=personeMax;
		this.prezzo=prezzo;
		this.numPrenotazioni=0;
	}
	
	public boolean aggiungiPrenotazione(Prenotazione prenotazione)
	{
		if(postiRimanenti+prenotazione.getNumeroPersone()<=this.personeMax)
		{
			prenotazioni.add(prenotazione);
			prenotazioni.get(prenotazioni.size()-1).setNumPrenotazione(numPrenotazioni);
			numPrenotazioni++;
			postiRimanenti-=prenotazione.getNumeroPersone();
			return true;
		}
		return false;
	}
		
	public int cercaPrenotazione(Prenotazione prenotazione)
	{
		if(prenotazioni.contains(prenotazione))
		{
			for(int i=0;i<prenotazioni.size();i++)
			{
				if(prenotazioni.get(i).equals(prenotazione))
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	public boolean isFuture(String data1, String data2)
	{
		return true;
	}
	
	public boolean eliminaPrenotazione(Prenotazione prenotazione)
	{
		return prenotazioni.remove(prenotazione);
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
	
	public int getPostiRimanenti() {
		return postiRimanenti;
	}

	public void setPostiRimanenti(int postiRimanenti) {
		this.postiRimanenti = postiRimanenti;
	}

	public ArrayList<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
