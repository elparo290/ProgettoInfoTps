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
				finestra.setPrenotazioni();
			}
		}
		else if(finestra.getContentPane() instanceof CreaEvento)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}
		/*else if(finestra.getContentPane() instanceof Evento)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}*/
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
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}
		else if(finestra.getContentPane() instanceof PrenotaEvento)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}
		else if(finestra.getContentPane() instanceof Prenotazioni)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}
		else if(finestra.getContentPane() instanceof Registrati)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}
		else if(finestra.getContentPane() instanceof Scelta)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}
		else if(finestra.getContentPane() instanceof ViewPrenotEven)
		{
			if(e.getSource() == ((Pannello) pn).getInizia())
			{
				finestra.setHome();
			}
		}
	}
	
}
