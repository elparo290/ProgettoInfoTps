import Controller.Controller;
import Model.*;
import Model.Evento;
import View.*;

/**
 * Classe Main che gestisce il protocollo mvc(model view controller)
 */

public class Main {

	public static void main(String[] args) {
		Finestra frame = new Finestra();
		Model md = new Model();
		Controller cr = new Controller(md, frame.getPannello(),frame);
	}
	

}
