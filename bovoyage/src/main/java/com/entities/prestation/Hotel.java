package com.entities.prestation;
import java.time.LocalDate;

import com.entities.Formule;
import com.entities.util.Adresse;

public class Hotel extends Prestation {
	/* {author=Laure, version=1.0}*/


	private int nbEtoiles;

	private Hebergement  myHebergement;
	private Adresse  myAdresse;
	
	public Hotel(LocalDate dateDepart, LocalDate dateArrivee, int prixHT, String compagnie, Formule myFormule) {
		super(dateDepart, dateArrivee, prixHT, compagnie, myFormule);
		// TODO Auto-generated constructor stub
	}
	
	
	public int getNbEtoiles() {
		return nbEtoiles;
	}
	public void setNbEtoiles(int nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}
	public Hebergement getMyHebergement() {
		return myHebergement;
	}
	public void setMyHebergement(Hebergement myHebergement) {
		this.myHebergement = myHebergement;
	}
	public Adresse getMyAdresse() {
		return myAdresse;
	}
	public void setMyAdresse(Adresse myAdresse) {
		this.myAdresse = myAdresse;
	}


	@Override
	public String toString() {
		return "Hotel [nbEtoiles=" + nbEtoiles + ", myHebergement=" + myHebergement + ", myAdresse=" + myAdresse + "]";
	}

}