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
			}
		}
		else if(finestra.getContentPane() instanceof Accedi)
		{
			if(e.getSource() == ((Accedi) finestra.getContentPane()).getAccedi())
			{
				String mail = ((Accedi) finestra.getContentPane()).getMail().getText();
				String password = ((Accedi) finestra.getContentPane()).getPassword().getText();
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
							}
							else
							{
								finestra.setPrenotazioni();
							}
						}
					}
				}
				if(controllo==0)
				{
					finestra.setAccedi();
				}
			}
			else if(e.getSource() == ((Accedi) finestra.getContentPane()).getEsci())
			{
				finestra.setPannello();
			}
		}
		else if(finestra.getContentPane() instanceof Eventi)
		{
			if(e.getSource() == ((Eventi) finestra.getContentPane()).getEsci())
			{
				finestra.setScelta();
			}
			else if(e.getSource() == ((Eventi) finestra.getContentPane()).getCreaEvento())
			{
				finestra.setEvento();
			}
			else if(e.getSource() == ((Eventi) finestra.getContentPane()).getMostraEventi())
			{
				finestra.setViewPrenotEven();
			}
		}
		else if(finestra.getContentPane() instanceof CreaEvento)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}
		else if(finestra.getContentPane() instanceof Home)
		{
			if(e.getSource() == ((Home) finestra.getContentPane()).getAccedi())
			{
				finestra.setPrenotazioni();
			}
			else if(e.getSource() == ((Home) finestra.getContentPane()).getRegistrati())
			{
				finestra.setRegistrati();
			}
		}
		else if(finestra.getContentPane() instanceof Pannello)
		{
			if(e.getSource() == ((Pannello) finestra.getContentPane()).getInizia())
			{
				finestra.setHome();
			}
		}
		else if(finestra.getContentPane() instanceof PrenotaEvento)
		{
			if(e.getSource() == ((Pannello) finestra.getContentPane()).getInizia())
			{
				finestra.setHome();
			}
		}
		else if(finestra.getContentPane() instanceof Prenotazioni)
		{
			if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getNuovaPrenotazione())
			{
				finestra.setPrenotazioni();
			}
			else if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getMostraPrenotazioni())
			{
				finestra.setViewPrenotEven();
			}
			else if(e.getSource() == ((Prenotazioni) finestra.getContentPane()).getEsci())
			{
				if(utente instanceof Amministratore)
				{	
					finestra.setScelta();
				}
				else
				{
					finestra.setPannello();
				}
			}
		}
		else if(finestra.getContentPane() instanceof Registrati)
		{
			if(e.getSource() == ((Registrati) finestra.getContentPane()).getInvia())
			{
				if(e.getSource() == ((Registrati) finestra.getContentPane()).getAmministratore())
				{
					Utente.anagrafica.add(new Amministratore(((Registrati) finestra.getContentPane()).getMail().getText(),
							((Registrati) finestra.getContentPane()).getNome().getText(),
							((Registrati) finestra.getContentPane()).getCognome().getText(),
							((Registrati) finestra.getContentPane()).getTelefono().getText(),
							"in lavoro",
							((Registrati) finestra.getContentPane()).getPassword().getText()
							));
				}
				else
				{
					Utente.anagrafica.add(new Utente(((Registrati) finestra.getContentPane()).getMail().getText(),
							((Registrati) finestra.getContentPane()).getNome().getText(),
							((Registrati) finestra.getContentPane()).getCognome().getText(),
							((Registrati) finestra.getContentPane()).getTelefono().getText(),
							"in lavoro",
							((Registrati) finestra.getContentPane()).getPassword().getText()
							));
				}
			}
			else if(e.getSource() == ((Registrati) finestra.getContentPane()).getEsci())
			{
				finestra.setPannello();
			}
		}
		else if(finestra.getContentPane() instanceof Scelta)
		{
			if(e.getSource() == ((Scelta) finestra.getContentPane()).getEsci())
			{
				finestra.setPannello();
			}
			else if(e.getSource() == ((Scelta) finestra.getContentPane()).getPrenotazioni())
			{
				finestra.setPrenotazioni();
			}
			else if(e.getSource() == ((Scelta) finestra.getContentPane()).getEventi())
			{
				//finestra.setEvento();
			}
		}
		else if(finestra.getContentPane() instanceof ViewPrenotEven)
		{
			if(e.getSource() == ((Pannello) finestra.getContentPane()).getInizia())
			{
				finestra.setHome();
			}
		}
	}
	
}
