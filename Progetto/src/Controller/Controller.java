package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Model.*;
import Model.Evento;
import View.*;

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
	
	public Controller(Model model, Pannello pannello,Finestra finestra) {
		this.pn = pannello;
		this.md = model;
		this.finestra=finestra;
		pn.addListeners(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(finestra.getContentPane() instanceof Pannello)
		{
			if(e.getSource() == ((Pannello) finestra.getContentPane()).getInizia())
			{
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
			}
		}
		else if(finestra.getContentPane() instanceof Accedi)
		{
			if(e.getSource() == ((Accedi) finestra.getContentPane()).getAccedi())
			{
				String mail = ((Accedi) finestra.getContentPane()).getMail().getText();
				String password = ((Accedi) finestra.getContentPane()).getPassword().getText();
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
			else if(e.getSource() == ((Accedi) finestra.getContentPane()).getEsci())
			{
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
			}
		}
		else if(finestra.getContentPane() instanceof Eventi)
		{
			if(e.getSource() == ((Eventi) finestra.getContentPane()).getEsci())
			{
				finestra.setScelta();
				scelta=finestra.getScelta();
				scelta.addListeners(this);
			}
			else if(e.getSource() == ((Eventi) finestra.getContentPane()).getCreaEvento())
			{
				finestra.setCreaEvento();
				creaEvento=finestra.getCreaEvento();
				creaEvento.addListeners(this);
			}
			else if(e.getSource() == ((Eventi) finestra.getContentPane()).getMostraEventi())
			{
				if(Evento.getAnagrafica().size()!=0)
				{
					contro=1;
					String testo="";
					for(int i=0;i<Evento.getAnagrafica().size();i++)
					{
						testo+="Nome Evento: "+Evento.getAnagrafica().get(i).getNome()+"\n";
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
		else if(finestra.getContentPane() instanceof CreaEvento)
		{
			CreaEvento ce = ((CreaEvento) finestra.getContentPane()); 
			if(e.getSource() == ce.getInvia())
			{	
				int x = (Integer) ((CreaEvento) finestra.getContentPane()).getPrezzo().getValue();
				double y = 0+x;
				Evento event = new Evento((int) ce.getPersoneMax().getValue(),
						y,
						ce.getNomeEvento().getText(),
						ce.getData()
						);
				Evento.getAnagrafica().add(event);
				finestra.setEventi();
				eventi=finestra.getEventi();
				eventi.addListeners(this);
			}
			else if(e.getSource() == ((CreaEvento) finestra.getContentPane()).getEsci())
			{	
				finestra.setEventi();
				eventi=finestra.getEventi();
				eventi.addListeners(this);
			}
		}
		else if(finestra.getContentPane() instanceof Home)
		{
			if(e.getSource() == ((Home) finestra.getContentPane()).getAccedi())
			{
				finestra.setAccedi();
				accedi=finestra.getAccedi();
				accedi.addListeners(this);
			}
			else if(e.getSource() == ((Home) finestra.getContentPane()).getRegistrati())
			{
				finestra.setRegistrati();
				registrati=finestra.getRegistrati();
				registrati.addListeners(this);
			}
		}
		else if(finestra.getContentPane() instanceof Prenotazioni)
		{
			if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getNuovaPrenotazione())
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
			else if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getMostraPrenotazioni())
			{
				if(Prenotazione.getAnagrafica().size()!=0)
				{
					contro=0;
					String testo="";
					for(int i=0;i<Prenotazione.getAnagrafica().size();i++)
					{
						testo+="Numero Prenotazione: "+Prenotazione.getAnagrafica().get(i).getNumPrenotazione()+"\n";
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
					((ViewPrenotEven) finestra.getContentPane()).setText("Non ci sono eventi");
				}
			}
			else if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getEsci())
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
		else if(finestra.getContentPane() instanceof Registrati)
		{
			if(e.getSource() == ((Registrati) finestra.getContentPane()).getAmministratore())
			{
				controllo=1;
			}
			else if(e.getSource() == ((Registrati) finestra.getContentPane()).getInvia())
			{
				if(controllo==1)
				{
					controllo=0;
					Amministratore prova = new Amministratore(((Registrati) finestra.getContentPane()).getMail().getText(),
							((Registrati) finestra.getContentPane()).getNome().getText(),
							((Registrati) finestra.getContentPane()).getCognome().getText(),
							((Registrati) finestra.getContentPane()).getTelefono().getText(),
							"in lavoro",
							((Registrati) finestra.getContentPane()).getPassword().getText()
							);
					Utente.getAnagrafica().add(prova);
					finestra.setHome();
					home=finestra.getHome();
					home.addListeners(this);
				}
				else
				{
					Utente prova = new Utente(((Registrati) finestra.getContentPane()).getMail().getText(),
							((Registrati) finestra.getContentPane()).getNome().getText(),
							((Registrati) finestra.getContentPane()).getCognome().getText(),
							((Registrati) finestra.getContentPane()).getTelefono().getText(),
							"in lavoro",
							((Registrati) finestra.getContentPane()).getPassword().getText()
							);
					Utente.getAnagrafica().add(prova);
					finestra.setHome();
					home=finestra.getHome();
					home.addListeners(this);
				}
			}
			else if(e.getSource() == ((Registrati) finestra.getContentPane()).getEsci())
			{
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
			}
		}
		else if(finestra.getContentPane() instanceof Scelta)
		{
			if(e.getSource() == ((Scelta) finestra.getContentPane()).getEsci())
			{
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
			}
			else if(e.getSource() == ((Scelta) finestra.getContentPane()).getPrenotazioni())
			{
				finestra.setPrenotazioni();
				prenotazioni=finestra.getPrenotazioni();
				prenotazioni.addListeners(this);
			}
			else if(e.getSource() == ((Scelta) finestra.getContentPane()).getEventi())
			{
				finestra.setEventi();
				eventi=finestra.getEventi();
				eventi.addListeners(this);	
			}
		}
		else if(finestra.getContentPane() instanceof ViewPrenotEven)
		{
			if(e.getSource() == ((ViewPrenotEven) finestra.getContentPane()).getEsci())
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
		else if(finestra.getContentPane() instanceof CreaPrenotazione)
		{
			if(e.getSource() == ((CreaPrenotazione) finestra.getContentPane()).getEsci())
			{
				finestra.setPrenotazioni();
				prenotazioni=finestra.getPrenotazioni();
				prenotazioni.addListeners(this);
			}
			else if(e.getSource() == ((CreaPrenotazione) finestra.getContentPane()).getInvia())
			{
				Evento even=null;
				String event = (String) ((CreaPrenotazione) finestra.getContentPane()).getEvento().getSelectedItem();
				for(int i=0;i<Evento.getAnagrafica().size();i++)
				{
					if(Evento.getAnagrafica().get(i).getNome().compareTo(event)==0)
					{
						even=Evento.getAnagrafica().get(i);
					}
				}
				Prenotazione prenotazione = new Prenotazione(attuale,
						numPrenot,
						(int) ((CreaPrenotazione) finestra.getContentPane()).getNumPersone().getValue(),
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
	
}
