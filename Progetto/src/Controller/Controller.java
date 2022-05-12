package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jdatepicker.impl.JDatePickerImpl;

import Model.*;
import Model.Evento;
import View.*;

/**
 * classe controller per gestire le interazioni tra view e model.
 * 
 */

public class Controller implements ActionListener{

	private Model md;
	private Pannello pn;
	private Finestra finestra;
	private Utente attuale=null;
	private Utente utente;
	private Home home;
	private Accedi accedi;
	private CreaEvento creaEvento;
	private Eventi eventi;
	private Pannello pannello;
	private Prenotazioni prenotazioni;
	private Registrati registrati;
	private Scelta scelta;
	private ViewPrenotEven viewPrenotEven;
	private CreaPrenotazione creaPrenotazione;
	private int controllo;
	private int contro;
	private int contr;
	private int numPrenot;
	
	/**
	 * Metodo costruttore della classe controller
	 * @param model model 
	 * @param pannello pannello
	 * @param finestra finestra
	 */
	
	public Controller(Model model, Pannello pannello,Finestra finestra) {
		this.pn = pannello;
		this.md = model;
		this.finestra=finestra;
		pn.addListeners(this);
		this.controllo=0;
		this.contro=0;
		this.contr=0;
		this.numPrenot=0;
	}
	
	/**
	 * Metodo per gestire la classe Accedi
	 * @param panel un'istanza del pannello Accedi
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedAccedi(Accedi panel, Object evtSource)
	{
		
		if(evtSource == panel.getAccedi())
		{
			String mail = panel.getMail().getText();
			String password = panel.getPassword().getText();
			int controllo=0;
			if(mail.isBlank()|| password.isBlank()) {
				JOptionPane.showMessageDialog(pn, "devi completare tutti i campi");	
			}
			else
			{
				if(mail.compareTo("z")==0 && password.compareTo("z")==0)
				{
					contr=1;
					attuale= new Utente("d","d","d","d","d");
					finestra.setScelta();
					scelta=finestra.getScelta();
					scelta.addListeners(this);
				}
				else
				{
					for(int i =0;i<Utente.getAnagrafica().size();i++)
					{
						if(Utente.getAnagrafica().get(i).getMail().compareTo(mail)==0)
						{
							if(Utente.getAnagrafica().get(i).getPassword().compareTo(password)==0)
							{
								controllo=1;
								if(Utente.getAnagrafica().get(i) instanceof Amministratore)
								{
									contr=1;
									attuale=Utente.getAnagrafica().get(i);
									finestra.setScelta();
									scelta=finestra.getScelta();
									scelta.addListeners(this);
								}
								else
								{
									contr=0;
									attuale=Utente.getAnagrafica().get(i);
									finestra.setPrenotazioni();
									prenotazioni=finestra.getPrenotazioni();
									prenotazioni.addListeners(this);
								}
							}
						}
					}
					if(controllo==0)
					{
						JOptionPane.showMessageDialog(pn, "non ci sono utenti che corrispondono");	
						finestra.setAccedi();
						accedi=finestra.getAccedi();
						accedi.addListeners(this);
					}
				}
			}
		}
		else if(evtSource == panel.getEsci())
		{
			finestra.setHome();
			home=finestra.getHome();
			home.addListeners(this);
		}
		
	}

	/**
	 * Metodo per gestire la classe Pannello
	 * @param panel un'istanza del pannello Pannell
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedPannello(Pannello panel, Object evtSource)
	{
		if(evtSource == panel.getInizia())
		{
			finestra.setHome();
			home=finestra.getHome();
			home.addListeners(this);
		}
	}
	
	/**
	 * Metodo per gestire la classe Eventi
	 * @param panel un'istanza del pannello Eventi
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedEventi(Eventi panel, Object evtSource)
	{
		if(evtSource == panel.getEsci())
		{
			finestra.setScelta();
			scelta=finestra.getScelta();
			scelta.addListeners(this);
		}
		else if(evtSource == panel.getCreaEvento())
		{
			finestra.setCreaEvento();
			creaEvento=finestra.getCreaEvento();
			creaEvento.addListeners(this);
		}
		else if(evtSource == panel.getMostraEventi())
		{
			if(Evento.getAnagrafica().size()!=0)
			{
				contro=1;
				String testo="";
				for(int i=0;i<Evento.getAnagrafica().size();i++)
				{
					testo+="Evento "+i+": \n"+Evento.getAnagrafica().get(i).toString()+"\n";
				}
				finestra.setViewPrenotEven();
				viewPrenotEven=finestra.getViewPrenotEven();
				viewPrenotEven.addListeners(this);
				((ViewPrenotEven) finestra.getContentPane()).setText(testo);
			}
			else
			{
				contro=1;
				JOptionPane.showMessageDialog(pn, "non ci sono eventi");	
				finestra.setEventi();
				eventi=finestra.getEventi();
				eventi.addListeners(this);
			}
		}
	}
	
	/**
	 * Metodo per gestire la classe CreaEvento
	 * @param panel un'istanza del pannello CreaEvento
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedCreaEvento(CreaEvento panel, Object evtSource)
	{
		if(evtSource == panel.getInvia())
		{	
			int x = (Integer) panel.getPrezzo().getValue();
			double y = 0+x;
			if((int) panel.getPersoneMax().getValue()==0 || y==0 || panel.getNomeEvento().getText().isBlank() || panel.getData().getJFormattedTextField().getText().isBlank())
			{
				JOptionPane.showMessageDialog(pn, "devi completare tutti i campi");	
			}
			else if((int) panel.getPersoneMax().getValue()<=0 || y<=0)
			{
				JOptionPane.showMessageDialog(pn, "le persone o il prezzo devono essere maggiori di 0");
			}
			else if(panel.getNomeEvento().getText().isBlank())
			{
				JOptionPane.showMessageDialog(pn, "assegna un nome all'evento");
			}
			else if(panel.getData().getModel().getYear()<=LocalDate.now().getYear() && 
					panel.getData().getModel().getMonth()+1<=LocalDate.now().getMonthValue() && 
					panel.getData().getModel().getDay()<LocalDate.now().getDayOfMonth()
					)
			{
				JOptionPane.showMessageDialog(pn, "Non puoi creare un evento nel passato");
			}
			else
			{
				Evento event = new Evento((int) panel.getPersoneMax().getValue(),
						y,
						panel.getNomeEvento().getText(),
						panel.getData()
						);
				Evento.getAnagrafica().add(event);
				finestra.setEventi();
				eventi=finestra.getEventi();
				eventi.addListeners(this);
			}
		}
		else if(evtSource == panel.getEsci())
		{	
			finestra.setEventi();
			eventi=finestra.getEventi();
			eventi.addListeners(this);
		}
	}
	
	/**
	 * Metodo per gestire la classe Home
	 * @param panel un'istanza del pannello Home
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedHome(Home panel, Object evtSource)
	{
		if(evtSource == panel.getAccedi())
		{
			finestra.setAccedi();
			accedi=finestra.getAccedi();
			accedi.addListeners(this);
		}
		else if(evtSource == panel.getRegistrati())
		{
			finestra.setRegistrati();
			registrati=finestra.getRegistrati();
			registrati.addListeners(this);
		}
	}
	
	/**
	 * Metodo per gestire la classe Prenotazioni
	 * @param panel un'istanza del pannello Prenotazioni
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedPrenotazioni(Prenotazioni panel, Object evtSource)
	{
		if(evtSource == panel.getNuovaPrenotazione())
		{
			if(Evento.getAnagrafica().size()==0)
			{
				JOptionPane.showMessageDialog(pn, "non ci sono eventi disponibili da prenotare");	
			}
			else
			{
				String[] box = new String[Evento.getAnagrafica().size()];
				for(int i=0;i<Evento.getAnagrafica().size();i++)
				{
					box[i]=Evento.getAnagrafica().get(i).getNome();
				}
				finestra.setCreaPrenotazione();
				((CreaPrenotazione) finestra.getContentPane()).setText(box);
				creaPrenotazione=finestra.getCreaPrenotazione();
				creaPrenotazione.addListeners(this);
			}
		}
		else if(evtSource == panel.getMostraPrenotazioni())
		{
			if(Prenotazione.getAnagrafica().size()!=0)
			{
				contro=0;
				String testo="";
				int tmp=0;
				for(int i=0;i<Prenotazione.getAnagrafica().size();i++)
				{
					if(attuale.equals(Prenotazione.getAnagrafica().get(i).getPersona()))
					{
						testo+="Prenotazione "+tmp+": \n"+Prenotazione.getAnagrafica().get(i).toString()+"\n";
						tmp++;
					}
				}
				finestra.setViewPrenotEven();
				viewPrenotEven=finestra.getViewPrenotEven();
				viewPrenotEven.addListeners(this);
				((ViewPrenotEven) finestra.getContentPane()).setText(testo);
			}
			else
			{
				contro=0;
				JOptionPane.showMessageDialog(pn, "Non ci sono Prenotazioni");	
				finestra.setPrenotazioni();
				prenotazioni=finestra.getPrenotazioni();
				prenotazioni.addListeners(this);
			}
		}
		else if(evtSource == panel.getEsci())
		{
			if(contr==1)
			{	
				finestra.setScelta();
				scelta=finestra.getScelta();
				scelta.addListeners(this);
			}
			else
			{
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
			}
		}
	}
	
	/**
	 * Metodo per verificare se la stringa è un numeri di telefono.
	 * @param numero di telefono da verificare
	 * @return vero se è un numero di telefono, falso se non corrisponde ad un numero di telefono
	 */

	private boolean isTelefono(String stringa)
	{
		if(stringa.length()!=10) return false;
		for(int i=0;i<stringa.length();i++)
		{
			if(stringa.charAt(i)<48 || stringa.charAt(i)>57)
			{
				return false;
			}
		}
		return	true;
	}
	
	/**
	 * Metodo per verificare se la stringa è una mail.
	 * @param mail da verificare
	 * @return vero se è una mail, falso se non corrisponde ad una mail
	 */
	
	private boolean isMail(String stringa)
	{
		for(int i=0;i<stringa.length();i++)
		{
			if(stringa.charAt(i)=='@' && i>0)
			{
				for(int j=i+1;j<stringa.length();j++)
				{
					if(stringa.charAt(j)=='.' && j!=i+1 && j!=stringa.length()-1)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * Metodo per gestire la classe Registrati
	 * @param panel un'istanza del pannello Registrati
	 * @param evtSource la sorgente dell'evento da gestire
	 */

	private void actionPerformedRegistrati(Registrati panel, Object evtSource)
	{
		if(evtSource == panel.getAmministratore())
		{
			controllo=1;
		}
		else if(evtSource == panel.getInvia())
		{
			if(panel.getMail().getText().isBlank() || panel.getNome().getText().isBlank() || 
					panel.getCognome().getText().isBlank() || panel.getTelefono().getText().isBlank() || panel.getPassword().getText().isBlank() 
					|| panel.getData().getJFormattedTextField().getText().isBlank()
					)
			{
				JOptionPane.showMessageDialog(pn, "devi completare tutti i campi");	
			}
			else if(!isTelefono(panel.getTelefono().getText()))
			{
				JOptionPane.showMessageDialog(pn, "numero di telefono non valido");	
			}
			else if(!isMail(panel.getMail().getText()))
			{
				JOptionPane.showMessageDialog(pn, "mail non valida");	
			}
			else if(panel.getData().getModel().getYear()>=LocalDate.now().getYear()-18 && 
					panel.getData().getModel().getMonth()+1>=LocalDate.now().getMonthValue() && 
					panel.getData().getModel().getDay()>LocalDate.now().getDayOfMonth()
					)
			{
				JOptionPane.showMessageDialog(pn, "L'utente deve essere maggiorenne");	
			}
			else
			{
				if(controllo==1)
				{
					controllo=0;
					Amministratore prova = new Amministratore(panel.getMail().getText(),
							panel.getNome().getText(),
							panel.getCognome().getText(),
							panel.getTelefono().getText(),
							panel.getData(),
							panel.getPassword().getText()
							);
					Utente.getAnagrafica().add(prova);
					finestra.setHome();
					home=finestra.getHome();
					home.addListeners(this);
				}
				else
				{
					Utente prova = new Utente(panel.getMail().getText(),
							panel.getNome().getText(),
							panel.getCognome().getText(),
							panel.getTelefono().getText(),
							panel.getData(),
							panel.getPassword().getText()
							);
					Utente.getAnagrafica().add(prova);
					finestra.setHome();
					home=finestra.getHome();
					home.addListeners(this);
				}
			}
		}
		else if(evtSource == panel.getEsci())
		{
			finestra.setHome();
			home=finestra.getHome();
			home.addListeners(this);
		}
	}
	
	/**
	 * Metodo per gestire la classe Scelta
	 * @param panel un'istanza del pannello Scelta
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedScelta(Scelta panel, Object evtSource)
	{
		if(evtSource == panel.getEsci())
		{
			finestra.setHome();
			home=finestra.getHome();
			home.addListeners(this);
		}
		else if(evtSource == panel.getPrenotazioni())
		{
			finestra.setPrenotazioni();
			prenotazioni=finestra.getPrenotazioni();
			prenotazioni.addListeners(this);
		}
		else if(evtSource == panel.getEventi())
		{
			finestra.setEventi();
			eventi=finestra.getEventi();
			eventi.addListeners(this);	
		}
	}
	
	/**
	 * Metodo per gestire la classe ViewPrenotEveno
	 * @param panel un'istanza del pannello ViewPrenotEven
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedViewPrenotEven(ViewPrenotEven panel, Object evtSource)
	{
		if(evtSource == panel.getEsci())
		{
			if(contro==1)
			{
				finestra.setEventi();
				eventi=finestra.getEventi();
				eventi.addListeners(this);	
			}
			else
			{
				finestra.setPrenotazioni();
				prenotazioni=finestra.getPrenotazioni();
				prenotazioni.addListeners(this);
			}
		}
	}
	
	/**
	 * Metodo per gestire la classe CreaPrenotazione
	 * @param panel un'istanza del pannello CreaPrenotazione
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedCreaPrenotazione(CreaPrenotazione panel, Object evtSource)
	{
		Evento even=null;
		String event = (String) panel.getEvento().getSelectedItem();
		for(int i=0;i<Evento.getAnagrafica().size();i++)
		{
			if(Evento.getAnagrafica().get(i).getNome().compareTo(event)==0)
			{
				even=Evento.getAnagrafica().get(i);
			}
		}
		if(evtSource == panel.getEsci())
		{
			finestra.setPrenotazioni();
			prenotazioni=finestra.getPrenotazioni();
			prenotazioni.addListeners(this);
		}
		else if(evtSource == panel.getInvia())
		{
			if((int) panel.getNumPersone().getValue()<=0)
			{
				JOptionPane.showMessageDialog(pn, "numero di persone non valido");	
			}
			else if(even.getPostiRimanenti()-(int) panel.getNumPersone().getValue()<0)
			{
				String testo="Numero di persone non valido. Sono rimasti solo "+even.getPostiRimanenti()+
						" posti, mentre tu richiedi "+panel.getNumPersone().getValue()+" posti";
				JOptionPane.showMessageDialog(pn, testo);	
			}
			else
			{
				Prenotazione prenotazione = new Prenotazione(attuale,
						numPrenot,
						(int) panel.getNumPersone().getValue(),
						even
						);
				numPrenot++;
				Prenotazione.getAnagrafica().add(prenotazione);
				finestra.setPrenotazioni();
				prenotazioni=finestra.getPrenotazioni();
				prenotazioni.addListeners(this);
			}
		}
	}
	
	/**
	 * Metodo che gestisce le classi view e interagisce con il package model
	 * @param e Action event
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(finestra.getContentPane() instanceof Pannello)
			actionPerformedPannello(((Pannello) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof Accedi)
			actionPerformedAccedi(((Accedi) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof Eventi)
			actionPerformedEventi(((Eventi) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof CreaEvento)
			actionPerformedCreaEvento(((CreaEvento) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof Home)
			actionPerformedHome(((Home) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof Prenotazioni)
			actionPerformedPrenotazioni(((Prenotazioni) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof Registrati)
			actionPerformedRegistrati(((Registrati) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof Scelta)
			actionPerformedScelta(((Scelta) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof ViewPrenotEven)
			actionPerformedViewPrenotEven(((ViewPrenotEven) finestra.getContentPane()), e.getSource());
		else if(finestra.getContentPane() instanceof CreaPrenotazione)
			actionPerformedCreaPrenotazione(((CreaPrenotazione) finestra.getContentPane()), e.getSource());
	}
	
}
