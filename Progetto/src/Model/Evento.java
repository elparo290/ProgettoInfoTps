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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Massimo persone= " + personeMax + ",  nome evento= " + nome + ",  prezzo= " + prezzo + ",  posti rimanenti= "
				+ postiRimanenti + ",  Numero Prenotazione= " + numPrenotazioni + ",  data evento= " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n\n";
	}
	
	
	
}
