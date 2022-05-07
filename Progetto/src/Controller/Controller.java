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
	private Utente utente;
	private Home home;
	private Accedi accedi;
	private CreaEvento creaEvento;
	private Eventi eventi;
	private Pannello pannello;
	private PrenotaEvento prenotaEvento;
	private Prenotazioni prenotazioni;
	private Registrati registrati;
	private Scelta scelta;
	private ViewPrenotEven viewPrenotEven;
	
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
				System.out.println(mail);
				String password = ((Accedi) finestra.getContentPane()).getPassword().getText();
				System.out.println(password);
				int controllo=0;
				for(int i =0;i<Utente.getAnagrafica().size();i++)
				{
					if(Utente.getAnagrafica().get(i).getMail()==mail)
					{
						if(Utente.getAnagrafica().get(i).getPassword()==password)
						{
							controllo=1;
							utente = Utente.getAnagrafica().get(i);
							if(utente instanceof Amministratore)
							{
								finestra.setScelta();
								scelta=finestra.getScelta();
								scelta.addListeners(this);
							}
							else
							{
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
			else if(e.getSource() == ((Accedi) finestra.getContentPane()).getEsci())
			{
				finestra.setPannello();
				pannello=finestra.getPannello();
				pannello.addListeners(this);
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
				
			}
			else if(e.getSource() == ((Eventi) finestra.getContentPane()).getMostraEventi())
			{
				finestra.setViewPrenotEven();
				viewPrenotEven=finestra.getViewPrenotEven();
				viewPrenotEven.addListeners(this);
			}
		}
		else if(finestra.getContentPane() instanceof CreaEvento)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
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
		else if(finestra.getContentPane() instanceof Pannello)
		{
			if(e.getSource() == ((Pannello) finestra.getContentPane()).getInizia())
			{
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
			}
		}
		else if(finestra.getContentPane() instanceof PrenotaEvento)
		{
			if(e.getSource() == ((Pannello) finestra.getContentPane()).getInizia())
			{
				
			}
		}
		else if(finestra.getContentPane() instanceof Prenotazioni)
		{
			if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getNuovaPrenotazione())
			{
				finestra.setPrenotazioni();
				prenotazioni=finestra.getPrenotazioni();
				prenotazioni.addListeners(this);
			}
			else if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getMostraPrenotazioni())
			{
				finestra.setViewPrenotEven();
				viewPrenotEven=finestra.getViewPrenotEven();
				viewPrenotEven.addListeners(this);
			}
			else if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getEsci())
			{
				if(utente instanceof Amministratore)
				{	
					finestra.setScelta();
					scelta=finestra.getScelta();
					scelta.addListeners(this);
				}
				else
				{
					finestra.setPannello();
					pannello=finestra.getPannello();
					pannello.addListeners(this);
				}
			}
		}
		else if(finestra.getContentPane() instanceof Registrati)
		{
			if(e.getSource() == ((Registrati) finestra.getContentPane()).getInvia())
			{
				if(e.getSource() == ((Registrati) finestra.getContentPane()).getAmministratore())
				{
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
				finestra.setPannello();
				pannello=finestra.getPannello();
				pannello.addListeners(this);
			}
			else if(e.getSource() == ((Scelta) finestra.getContentPane()).getPrenotazioni())
			{
				finestra.setPrenotazioni();
				prenotazioni=finestra.getPrenotazioni();
				prenotazioni.addListeners(this);
			}
			else if(e.getSource() == ((Scelta) finestra.getContentPane()).getEventi())
			{
				
			}
		}
		else if(finestra.getContentPane() instanceof ViewPrenotEven)
		{
			if(e.getSource() == ((Pannello) finestra.getContentPane()).getInizia())
			{
				finestra.setHome();
				home=finestra.getHome();
				home.addListeners(this);
			}
		}
	}
	
}
