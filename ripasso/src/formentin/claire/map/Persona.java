package formentin.claire.map;

public class Persona {
	private String nome;
	private String cognome;
	private int eta;
	@Override
	public int hashCode(){
		return nome.hashCode() + cognome.hashCode() + eta;
	}
	@Override
	public boolean equals (Object other){
		if (other == null) return false;
		if (other == this) return true;
		if(!(other instanceof Persona )) return false;
		Persona otherpersona = (Persona) other;
		return this.nome.equals(otherpersona.nome) 
				&& this.cognome.equals(otherpersona.cognome) && this.eta == otherpersona.eta;
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
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
}
