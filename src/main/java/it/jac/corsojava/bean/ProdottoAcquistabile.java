package it.jac.corsojava.bean;

import java.time.LocalDate;

import it.jac.corsojava.utente.Utente;

public class ProdottoAcquistabile extends ProdottoCatalogo {

	private String note;
	private int quantita;
	private boolean comprato;

	public ProdottoAcquistabile(Utente creatore, LocalDate dataCreazione, String nome, Categoria tipo, String note,
			int quantita) {
		super(creatore, dataCreazione, nome, tipo);
		this.setNote(note);
		this.setQuantita(quantita);
		this.setComprato(false);
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public boolean isComprato() {
		return comprato;
	}

	public void setComprato(boolean comprato) {
		this.comprato = comprato;
	}

	@Override
	public String toString() {
		return  super.toString()+ "ProdottoAcquistabile [note=" + note + ", quantita=" + quantita + ", comprato=" + comprato + "]";
	}
	
	

}
