package Model;

/**
 * Classe amministratore, estende la classe;
 * si differenzia dall'utente solo perchè 
 * l'amministratore può anche gestire gli utenti
 */

public class Amministratore extends Utente{
	
	/**
	 * Metodo per costruire l'amministratore
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
