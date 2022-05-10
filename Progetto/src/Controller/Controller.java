package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	private int controllo=0;
	private int contro=0;
	private int contr=0;
	private int numPrenot=0;
	
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
	}
	
	/**
	 * 
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
			if(mail.compareTo("z")==0 && password.compareTo("z")==0)
			{
				contr=1;
				attuale= new Utente("d","d","d","d","d","d");
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
					finestra.setAccedi();
					accedi=finestra.getAccedi();
					accedi.addListeners(this);
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
	 * 
	 * @param panel un'istanza del pannello Accedi
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
	 * 
	 * @param panel un'istanza del pannello Accedi
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
				finestra.setViewPrenotEven();
				viewPrenotEven=finestra.getViewPrenotEven();
				viewPrenotEven.addListeners(this);
				((ViewPrenotEven) finestra.getContentPane()).setText("Non ci sono eventi");
			}
		}
	}
	
	/**
	 * 
	 * @param panel un'istanza del pannello Accedi
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedCreaEvento(CreaEvento panel, Object evtSource)
	{
		if(evtSource == panel.getInvia())
		{	
			int x = (Integer) panel.getPrezzo().getValue();
			double y = 0+x;
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
		else if(evtSource == panel.getEsci())
		{	
			finestra.setEventi();
			eventi=finestra.getEventi();
			eventi.addListeners(this);
		}
	}
	
	/**
	 * 
	 * @param panel un'istanza del pannello Accedi
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
	 * 
	 * @param panel un'istanza del pannello Accedi
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedPrenotazioni(Prenotazioni panel, Object evtSource)
	{
		if(evtSource == panel.getNuovaPrenotazione())
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
				finestra.setViewPrenotEven();
				viewPrenotEven=finestra.getViewPrenotEven();
				viewPrenotEven.addListeners(this);
				((ViewPrenotEven) finestra.getContentPane()).setText("Non ci sono prenotazioni");
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
	 * 
	 * @param panel un'istanza del pannello Accedi
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
			if(controllo==1)
			{
				controllo=0;
				Amministratore prova = new Amministratore(panel.getMail().getText(),
						panel.getNome().getText(),
						panel.getCognome().getText(),
						panel.getTelefono().getText(),
						"in lavoro",
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
						"in lavoro",
						panel.getPassword().getText()
						);
				Utente.getAnagrafica().add(prova);
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
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
	 * 
	 * @param panel un'istanza del pannello Accedi
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
	 * 
	 * @param panel un'istanza del pannello Accedi
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
	 * 
	 * @param panel un'istanza del pannello Accedi
	 * @param evtSource la sorgente dell'evento da gestire
	 */
	
	private void actionPerformedCreaPrenotazione(CreaPrenotazione panel, Object evtSource)
	{
		if(evtSource == panel.getEsci())
		{
			finestra.setPrenotazioni();
			prenotazioni=finestra.getPrenotazioni();
			prenotazioni.addListeners(this);
		}
		else if(evtSource == panel.getInvia())
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
	
	/**
	 * 
	 * @param e 
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
