
public class Persona {
	public String nome, cognome, data, codfis; 
	
	public Persona ( String nome, String cognome, String data, String codfis ) {
		super();
		this.nome= nome;
		this.cognome= cognome;
		this.data= data;
		this.codfis= codfis;
	}
	
	public void Alunno(String nome, String cognome, String data, String codfis) {
		this.nome= nome;
		this.cognome= cognome;
		this.data= data;
		this.codfis= codfis;
		String sezione;
		int classe;
	}
	
	public void Docente(String nome, String cognome, String data, String codfis) {
		this.nome= nome;
		this.cognome= cognome;
		this.data= data;
		this.codfis= codfis;
		String concorsoclasse;
	}
	
	public void Personale(String nome, String cognome, String data, String codfis) {
		this.nome= nome;
		this.cognome= cognome;
		this.data= data;
		this.codfis= codfis;
		String ruolo;
	}
	
	

}
