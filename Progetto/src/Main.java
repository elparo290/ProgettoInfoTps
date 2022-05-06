import Controller.Controller;
import Model.*;
import Model.Evento;
import View.*;

public class Main {

	public static void main(String[] args) {
		Finestra frame = new Finestra();
		Evento pr = new Evento(2,"e",2);
		Prenotazione md = new Prenotazione(new Utente("cioa","f","f","dsa","fds"),12,12,pr);
		Controller cr = new Controller(md, frame.getContentPaneHome());
	}
	

}
