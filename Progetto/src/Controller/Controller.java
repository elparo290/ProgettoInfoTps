package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Model.*;
import View.*;

public class Controller implements ActionListener{

	private Prenotazione md;
	private Home pn;
	
	public Controller(Prenotazione model, Home home) {
		this.pn = home;
		this.md = model;
		
		pn.addListeners(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pn.getAccedi()) {
			Finestra finestra = new Finestra();
			finestra.setAccedi();
		}else if(e.getSource() == pn.getRegistrati()) {
			
		}
		
	}
	
}
