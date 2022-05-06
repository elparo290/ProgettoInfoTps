package Model;

/**
 * Questa classe contiene tutte le informazioni dell'amministratore
 * ossia quello che crea l'evento e ne gestisce tutti i casi
 *
 */

public class Amministratore extends Utente{
	
	/**
	 * Classe che serve per costruire l'amministratore
	 * 
	 * @param mail Mail amministratore
	 * @param nome Nome amministratore
	 * @param cognome Cognome amministratore
	 * @param telefono Telefono amministratore
	 * @param dataDiNascita Data di nascita amministratore
	 */
	
	public Amministratore(String mail,String nome,String cognome,String telefono,String dataDiNascita)
	{
		super(mail,nome,cognome,telefono,dataDiNascita);
	}
	
}
