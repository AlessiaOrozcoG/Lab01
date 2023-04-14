package it.polito.tdp.Lab01.model;

import java.util.*;

public class Parole {
	
	List<String> parole; //INIZIALIZZO LISTA
	
	public Parole() {  //COSTRUTTORE
		parole =  new LinkedList<String>();	//Inizializz base
	}
	
	public void addParola(String p) {
		parole.add(p);		
	}
	
	public List<String> getElenco() {
		Collections.sort(parole); //ORDINAMENTO ALFANUMERICO 
		return parole;
	}
	
	public void reset() {
		parole.removeAll(parole);
	}

}