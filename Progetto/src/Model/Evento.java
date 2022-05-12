package Model;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
	private LocalDate data;
	
	/**
	 * Metodo per costruire un'evento
	 * @param personeMax massimo di persone che posso entrare nell'evento
	 * @param prezzo prezzo a persona dell'evento
	 * @param nome nome dell'evento
	 * @param data data dell'evento
	 */
	
	public Evento(int personeMax,double prezzo,String nome,JDatePickerImpl data)
	{
		this.personeMax=personeMax;
		this.postiRimanenti=personeMax;
		this.prezzo=prezzo;
		this.nome=nome;
		this.numPrenotazioni=0;
		this.data = LocalDate.of(data.getModel().getYear(), data.getModel().getMonth()+1,data.getModel().getDay());
		for(int i=0;i<Prenotazione.getAnagrafica().size();i++)
		{
			if(Prenotazione.getAnagrafica().get(i).getEvento().equals(this))
			{
				this.numPrenotazioni++;
			}
		}
	}
	
	/**
	 * @return il numero massimo di persone che possono partecipare all'evento 
	 */
	
	public int getPersoneMax() {
		return personeMax;
	}

	/**
	 * Assegna il numero di persone che posso partecipare all'evento
	 * @param personeMax numero di persone
	 */
	
	public void setPersoneMax(int personeMax) {
		this.personeMax = personeMax;
	}
	
	/**
	 * @return il numero di posti rimantenti all'evento 
	 */
	
	public int getPostiRimanenti() {
		return postiRimanenti;
	}

	/**
	 * Assegna i posti rimanenti dell'evento
	 * @param postiRimanenti numero di posti rimanenti
	 */
	
	public void setPostiRimanenti(int postiRimanenti) {
		this.postiRimanenti = postiRimanenti;
	}
	
	/**
	 * @return il prezzo a presone per partecipare all'evento 
	 */
	
	public double getPrezzo() {
		return prezzo;
	}

	/**
	 * Assegna il prezzo a persona per partecipare all'evento
	 * @param prezzo prezzo a persona dell'evento
	 */
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	/**
	 * @return il nome dell'evento 
	 */
	
	public String getNome() {
		return nome;
	}

	/**
	 * Assegna il nome all'evento
	 * @param nome nome dell'evento
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return la date dell'evento 
	 */
	
	public LocalDate getData() {
		return data;
	}

	/**
	 * Assegna la data all'evento
	 * @param data data dell'evento
	 */
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	/**
	 * metodo che ritorna stringa inerente all'evento
	 */
	
	@Override
	public String toString() {
		return "Massimo persone= " + personeMax + ",  nome evento= " + nome + ",  prezzo= " + prezzo + ",  posti rimanenti= "
				+ postiRimanenti + ",  Numero Evento= " + numPrenotazioni + ",  data evento= " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n\n";
	}
	
	
	
}
