package it.jac.corsojava.dao;

import java.util.ArrayList;
import java.util.List;

import it.jac.corsojava.bean.ProdottoAcquistabile;
import it.jac.corsojava.bean.ProdottoCatalogo;

public class ArchivioCatalogo {

	List<ProdottoCatalogo> elencoProdottiCatalogo = new ArrayList<ProdottoCatalogo>();
	
	public void Aggiungi(ProdottoCatalogo p) {

		this.elencoProdottiCatalogo.add(p);
	}
	
	public List<ProdottoCatalogo> getListaProdottiCatalogo() {

		return this.elencoProdottiCatalogo;
	}
}
