package Model;

public class Amministratore extends Utente{
	private int codiceSegreto=1234;
	
	public Amministratore(String mail,String nome,String cognome,String telefono,String dataDiNascita)
	{
		super(mail,nome,cognome,telefono,dataDiNascita);
	}
	
	public boolean verificaAmministratore(int codiceSegreto)
	{
		if(this.codiceSegreto==codiceSegreto) return true;
		return false;
	}
	
}
