package Model;

/**
 * Classe di un utente generico che non ha bisogno di registrazione
 * nominativo delle persone che entrano con l'utente registrato
 */

public class UtenteGenerico {
	private String nome;
	private String cognome;
	private String telefono;

	/**
	 * Metodo per creare l'utente generico.
	 * @param nome nome utente generico
	 * @param cognome cognome utente generico
	 * @param telefono telefono utente generico
	 */
	
	public UtenteGenerico(String nome,String cognome,String telefono)
	{
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTelefono(telefono);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
