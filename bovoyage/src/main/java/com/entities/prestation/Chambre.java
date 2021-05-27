package com.entities.prestation;
import java.time.LocalDate;

import com.entities.Formule;

public class Chambre extends Hebergement {
 


	private Hebergement  myPrestationHebergement;
	
	public Chambre(LocalDate dateDepart, LocalDate dateArrivee, int prixHT, String compagnie, Formule myFormule) {
		super(dateDepart, dateArrivee, prixHT, compagnie, myFormule);
		// TODO Auto-generated constructor stub
	}

	public Hebergement getMyPrestationHebergement() {
		return myPrestationHebergement;
	}

	public void setMyPrestationHebergement(Hebergement myPrestationHebergement) {
		this.myPrestationHebergement = myPrestationHebergement;
	}

	@Override
	public String toString() {
		return "Chambre [myPrestationHebergement=" + myPrestationHebergement + "]";
	}


}