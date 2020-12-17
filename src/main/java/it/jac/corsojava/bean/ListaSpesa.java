package it.jac.corsojava.bean;

import java.util.ArrayList;
import java.util.List;

public class ListaSpesa {

	private int id;
	private List<ProdottoAcquistabile> listaSpesa = new ArrayList<ProdottoAcquistabile>();

	public ListaSpesa() {

		this.setId();
	}

	public void aggiungi(ProdottoAcquistabile p) {

		this.listaSpesa.add(p);
	}

	public int getId() {
		return id;
	}

	public void setId() {
		Singleton istance = Singleton.getIstance();
		int id = istance.nextId();
		this.id = id;
	}

	public void getEliminaProdotto(int id) {
		for (ProdottoAcquistabile p : listaSpesa) {
			if (p.getId() == id) {
				listaSpesa.remove(p);
				break;
			}
		}
	}

	public List<ProdottoAcquistabile> getListaSpesa() {
		return listaSpesa;
	}

	public void setListaSpesa(List<ProdottoAcquistabile> listaSpesa) {
		this.listaSpesa = listaSpesa;
	}

	public void modificaQuantita(int id, int quantita) {
		for (ProdottoAcquistabile l : listaSpesa) {
			if (l.getId() == id) {
				l.setQuantita(quantita);
			}
		}
	}

}
