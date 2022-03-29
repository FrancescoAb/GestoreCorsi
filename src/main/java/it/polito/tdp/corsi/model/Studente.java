package it.polito.tdp.corsi.model;

public class Studente {
	
	private Integer matricoa;
	private String cognome;
	private String nome;
	private String CVS;
	
	public Studente(Integer matricoa, String cognome, String nome, String cVS) {
		super();
		this.matricoa = matricoa;
		this.cognome = cognome;
		this.nome = nome;
		CVS = cVS;
	}

	public Integer getMatricoa() {
		return matricoa;
	}

	public void setMatricoa(Integer matricoa) {
		this.matricoa = matricoa;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCVS() {
		return CVS;
	}

	public void setCVS(String cVS) {
		CVS = cVS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricoa == null) ? 0 : matricoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studente other = (Studente) obj;
		if (matricoa == null) {
			if (other.matricoa != null)
				return false;
		} else if (!matricoa.equals(other.matricoa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Studente [matricoa=" + matricoa + ", cognome=" + cognome + ", nome=" + nome + ", CVS=" + CVS + "]";
	}
	
	
}
