package it.jac.corsojava.bean;

public class Singleton {

	private static Singleton istance= new Singleton();
	private int lastId=1;
	
	private Singleton() {
		
	}
	
	public static Singleton getIstance() {
		return istance;
	}
	
	public int nextId() {
		return Integer.valueOf("0000"+lastId++);
	}
}
