package it.jac.corsojava.bean;

import java.time.LocalDate;

import it.jac.corsojava.utente.Utente;

public class ProdottoCatalogo {

	private int id;
	private Utente creatore;
	private LocalDate dataCreazione;
	private Utente ultimaMod;
	private LocalDate dataMod;
	private String nome;
	private Categoria tipo;
	
	
	public ProdottoCatalogo(Utente creatore, LocalDate dataCreazione,String nome, Categoria tipo) {
		super();
		this.setId();
		this.creatore = creatore;
		this.dataCreazione = dataCreazione;
		this.ultimaMod = null;
		this.dataMod = null;
		this.nome = nome;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		Singleton istance=Singleton.getIstance();
		int id=istance.nextId();
		this.id=id;
	}

	public Utente getCreatore() {
		return creatore;
	}

	public void setCreatore(Utente creatore) {
		this.creatore = creatore;
	}

	public LocalDate getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(LocalDate dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Utente getUltimaMod() {
		return ultimaMod;
	}

	public void setUltimaMod(Utente ultimaMod) {
		this.ultimaMod = ultimaMod;
	}

	public LocalDate getDataMod() {
		return dataMod;
	}

	public void setDataMod(LocalDate dataMod) {
		this.dataMod = dataMod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getTipo() {
		return tipo;
	}

	public void setTipo(Categoria tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "ProdottoCatalogo [id=" + id + ", creatore=" + creatore + ", dataCreazione=" + dataCreazione
				+ ", ultimaMod=" + ultimaMod + ", dataMod=" + dataMod + ", nome=" + nome + ", tipo=" + tipo.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	

	
	

}
