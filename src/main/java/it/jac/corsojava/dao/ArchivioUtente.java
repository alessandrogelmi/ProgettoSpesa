package it.jac.corsojava.dao;

import java.util.ArrayList;
import java.util.List;

import it.jac.corsojava.bean.ProdottoCatalogo;
import it.jac.corsojava.utente.Utente;

public class ArchivioUtente {

	List<Utente> elencoUtenti = new ArrayList<Utente>();

	public void Aggiungi(Utente u) {

		this.elencoUtenti.add(u);
	}

	public List<Utente> getListaUtenti() {

		return this.elencoUtenti;
	}

	public boolean getEliminaUtente(int id) {
		for (Utente u : elencoUtenti) {
			if (u.getId() == id) {
				this.elencoUtenti.remove(u);
				break;
			}
		}
		return false;
	}
	
	public Utente VerificaCredenziali(String email, String password) {
		for (Utente persona: elencoUtenti) {
			if (persona.getEmail().equals(email) && persona.getPassword().equals(password)) {
				return persona;
			}
		}
		return null;
	}

}
