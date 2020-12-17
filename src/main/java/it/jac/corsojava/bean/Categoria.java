package it.jac.corsojava.bean;

import java.util.HashSet;

public class Categoria {
	
	private String tipo;
	HashSet<String> listaCategoria= new HashSet<String>();

	public Categoria(String tipo) {
		
		this.setTipo(tipo);
		listaCategoria.add(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Categoria [tipo=" + tipo + "]";
	}
	
	
	
	
}
