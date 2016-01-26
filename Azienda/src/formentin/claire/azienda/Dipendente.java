package formentin.claire.azienda;
	public class Dipendente {

		private String nome;
		private String cognome;
		private int anzianita;
		private Contratto contratto;
		
		
		public Dipendente(String nome, String cognome, int anzianita, Contratto contratto) {
			this.nome = nome;
			this.cognome = cognome;
			this.anzianita = anzianita;
			this.contratto = contratto;
		}
		
		public int calcoloStipendio() {
			int stipendioBase = contratto.getStipendioBase();
			return Math.round(stipendioBase + (0.5f * anzianita * stipendioBase));
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

		public int getAnzianita() {
			return anzianita;
		}

		public void setAnzianita(int anzianita) {
			this.anzianita = anzianita;
		}

		public Contratto getContratto() {
			return contratto;
		}

		public void setContratto(Contratto contratto) {
			this.contratto = contratto;
		}
}
