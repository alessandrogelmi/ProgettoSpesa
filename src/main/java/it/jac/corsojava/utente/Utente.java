package it.jac.corsojava.utente;

import it.jac.corsojava.bean.Singleton;

public class Utente {

	private int id;
	private String nome;
	private String cognome;
	private String email;
	private String password;

	public Utente(int id, String nome, String cognome, String email, String password) {

		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		Singleton istance=Singleton.getIstance();
		int id=istance.nextId();
		this.id=id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", password=" + password + "]";
	}

}
