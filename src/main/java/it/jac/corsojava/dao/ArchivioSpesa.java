package it.jac.corsojava.dao;

import java.util.ArrayList;
import java.util.List;

import it.jac.corsojava.bean.Categoria;
import it.jac.corsojava.bean.ListaSpesa;
import it.jac.corsojava.bean.ProdottoAcquistabile;
import it.jac.corsojava.bean.ProdottoCatalogo;
import it.jac.corsojava.bean.ProdottoAcquistabile;

public class ArchivioSpesa {

	List<ListaSpesa> elencoListe=new ArrayList<ListaSpesa>();
	
	public void Aggiungi(ListaSpesa l) {

		this.elencoListe.add(l);
	}

	
	public boolean getEliminaLista(int id) {
		for (ListaSpesa l : elencoListe) {
			if (l.getId() == id) {
				this.elencoListe.remove(l);
				break;
			}
		}
		return false;
	}

}
