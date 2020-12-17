package it.jac.corsojava;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import it.jac.corsojava.bean.Categoria;
import it.jac.corsojava.bean.ConsoleInput;
import it.jac.corsojava.bean.ListaSpesa;
import it.jac.corsojava.bean.Menù;
import it.jac.corsojava.bean.ProdottoAcquistabile;
import it.jac.corsojava.bean.ProdottoCatalogo;
import it.jac.corsojava.dao.ArchivioSpesa;
import it.jac.corsojava.dao.ArchivioUtente;
import it.jac.corsojava.utente.Utente;

public class MainClass {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ArchivioSpesa archivioSpesa = new ArchivioSpesa();
		ArchivioUtente archivioUtenti = new ArchivioUtente();
		Utente utente = null;
		ListaSpesa l = null;

		String continua = "";
		int numPagina = 0;

		ConsoleInput tastiera = new ConsoleInput();

		Categoria carne = new Categoria("Carne");
		Categoria pesce = new Categoria("Pesce");
		Categoria uovalatticini = new Categoria("Uova e latticini");
		Categoria igiene = new Categoria("Igiene");
		Categoria fruttaverdura = new Categoria("Frutta e verdura");
		Categoria salumiformaggi = new Categoria("Salumi e formaggi");

//		ProdottoCatalogo p = new ProdottoCatalogo(01, "GTX", "Vitello", "200gr", "null", 1, carne);
//		ProdottoCatalogo p1 = new ProdottoCatalogo(02, "SPR", "Orata", "200gr", "null", 3, pesce);

		Utente u = new Utente(01, "Manuel", "Lini", "m", "password");
		Utente u1 = new Utente(02, "Alessandro", "Gelmi", "ale.gelmi@gmail.com", "word");

		archivioUtenti.Aggiungi(u);
		archivioUtenti.Aggiungi(u1);

		System.out.println("LOGIN UTENTE \n");

		System.out.println("Inserisci email: ");
		String email = tastiera.readString();
		System.out.println("Inserisci password: ");
		String password = tastiera.readString();

		utente = archivioUtenti.VerificaCredenziali(email, password);

		if (utente != null) {

			String[] elenco = {"1-Aggiungi prodotto", 
								"2-Elimina prodotto",
								"3-Modifica quantità",
								"4-Elimina Lista",
								"5-Visualizza Lista della spesa" };

			System.out.println("Seleziona una delle voci sottostanti.\n");

			Menù m1 = new Menù(elenco);

			int sceltamenu = 0;

			do {

				sceltamenu = m1.scelta();
				switch (sceltamenu) {
					case 1: {
						
						if (l == null) {
							l = new ListaSpesa();
						}
						
						ProdottoAcquistabile pa=new ProdottoAcquistabile(u, null, "Tacchino morto", carne, "morto", 10);
						ProdottoAcquistabile pa1=new ProdottoAcquistabile(u, null, "Tacchino vivo", carne, "morto", 10);
						l.aggiungi(pa);
						l.aggiungi(pa1);
						break;
					}
	
					case 2: {
						l.getEliminaProdotto(2);
						for (ProdottoAcquistabile lista: l.getListaSpesa()) {
							System.out.println(lista.toString());
						}
						break;
					}
	
					case 3: {
						
						l.modificaQuantita(2, 25);
						break;
					}
					case 4:{
						l = null;
						
						break;
					}
	
					case 5: {
						try {
							for (ProdottoAcquistabile lista: l.getListaSpesa()) {
								System.out.println(lista.toString());
							}
							
						} catch (NullPointerException e) {
							System.out.println("Lista spesa vuota");
						}
						
						break;	
					}
					
					default: continue;
				}

				System.out.println("Vuoi continuare? Scrivi si se vuoi continuare");
				continua = tastiera.readString();
	
			} while (continua.equalsIgnoreCase("si"));

		} else
			System.out.println("Credenziali errate");
	}
}
