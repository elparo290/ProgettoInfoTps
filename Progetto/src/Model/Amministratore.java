package Model;

import org.jdatepicker.impl.JDatePickerImpl;

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
	 * @param password password amministratore
	 */
	
	public Amministratore(String mail,String nome,String cognome,String telefono,JDatePickerImpl data,String password)
	{
		super(mail,nome,cognome,telefono,data,password);
	}
	
}
