package com.entities.prestation;

import java.time.LocalDate;

import com.entities.Formule;

public class Hebergement extends Prestation {
	/* {author=Laure, version=1.0}*/


	public Hebergement(LocalDate dateDepart, LocalDate dateArrivee, int prixHT, String compagnie, Formule myFormule) {
		super(dateDepart, dateArrivee, prixHT, compagnie, myFormule);
		// TODO Auto-generated constructor stub
	}

	private int prix;
	/* {author=Laure, version=1.0}*/

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Hebergement [prix=" + prix + "]";
	}


}