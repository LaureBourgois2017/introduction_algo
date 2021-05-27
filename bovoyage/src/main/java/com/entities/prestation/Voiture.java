package com.entities.prestation;

import java.time.LocalDate;

import com.entities.Formule;

public class Voiture extends Prestation {
	/* {author=Laure, version=1.0}*/


	public Voiture(LocalDate dateDepart, LocalDate dateArrivee, int prixHT, String compagnie, Formule myFormule) {
		super(dateDepart, dateArrivee, prixHT, compagnie, myFormule);
		// TODO Auto-generated constructor stub
	}

	/** 
	 *  cat?gorie de la voiture
	 */
	private int classe;
	
	
	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}
	
	@Override
	public String toString() {
		return "Voiture [classe=" + classe + "]";
	}

}