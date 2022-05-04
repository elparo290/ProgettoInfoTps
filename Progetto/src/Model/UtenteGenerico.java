package Model;

public class UtenteGenerico {
	private String nome;
	private String cognome;
	private String telefono;
	
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