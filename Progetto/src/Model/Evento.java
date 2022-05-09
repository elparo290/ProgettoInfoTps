package Model;

import java.util.ArrayList;

import org.jdatepicker.impl.JDatePickerImpl;

/**
 * classe evento che serve per creare le prenotazioni
 * la creazione può essere fatta solo da un'amministratore
 */

public class Evento {
	private static ArrayList<Evento> anagrafica = null;
	/**
	 * Metodo che ritorna eventi
	 * @return ArrayList degli eventi in programmazione
	 */
	public static ArrayList<Evento> getAnagrafica()
	{
		if(anagrafica == null)
		{
			anagrafica = new ArrayList<Evento>();
		}
		
		return anagrafica;
	}

	private int personeMax;
	private String nome;
	private double prezzo;
	private int postiRimanenti;
	private int numPrenotazioni;
	private JDatePickerImpl data;
	private ArrayList<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();
	
	/**
	 * Metodo per costruire un'evento
	 * @param personeMax massimo di persone che posso entrare nell'evento
	 * @param dataEvento data dell'evento in programmazione
	 * @param prezzo prezzo a persona dell'evento
	 * @param nome nome dell'evento
	 */
	
	public Evento(int personeMax,double prezzo,String nome,JDatePickerImpl data)
	{
		this.personeMax=personeMax;
		this.postiRimanenti=personeMax;
		this.prezzo=prezzo;
		this.numPrenotazioni=0;
		this.nome=nome;
		this.setData(data);
	}
	
	/**
	 * Metodo per l'aggiunta di una prenotazione all'evento
	 * @param prenotazione prenotazione da aggiungere
	 * @return vero se è stato aggiunto correttamente, falso se non è possibile aggiungere
	 */
	
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
	
	/**
	 * 
	 * @param prenotazione
	 * @return vero se è stato eliminato correttamente, falso se non è stata trovata la prenotazione
	 */
	public boolean eliminaPrenotazione(Prenotazione prenotazione)
	{
		return prenotazioni.remove(prenotazione);
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public JDatePickerImpl getData() {
		return data;
	}

	public void setData(JDatePickerImpl data) {
		this.data = data;
	}
	
}
