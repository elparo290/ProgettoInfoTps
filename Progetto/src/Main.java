import Controller.Controller;
import Model.*;
import View.*;

public class Main {

	public static void main(String[] args) {
		Home home = new Home();
		Finestra frame = new Finestra(home);
		Evento pr = new Evento(2,"e",2);
		Prenotazione md = new Prenotazione(new Utente("cioa","f","f","dsa","fds"),12,12,pr);
		Controller cr = new Controller(md, frame.getContentPane());
	}

}
