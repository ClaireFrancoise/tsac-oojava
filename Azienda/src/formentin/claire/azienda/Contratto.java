package formentin.claire.azienda;

public class Contratto {
	private int stipendioBase;
	private String nome;
	
	
	public Contratto(int stipendioBase, String nome) {
		this.stipendioBase = stipendioBase;
		this.nome = nome;
	}

	
	public int getStipendioBase() {
		return stipendioBase;
	}

	public void setStipendioBase(int stipendioBase) {
		this.stipendioBase = stipendioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
