package com.entities;

/** 
 *  La classe Voyage est la classe m?tier.
 *  Cette classe est renvoy?e dans une liste par AgenceVoyageService.
 */
public class Voyage {
	/* {Laure=Laure, 1.0=1.0}*/


	/** 
	 *  Statut du voyage si le voyage comporte encore des places disponibles. Initialis? ? true.
	 */
	private Boolean statut;
	/* {Laure=Laure, 1.0=1.0}*/

	/** 
	 *  Prix global du voyage
	 */
	private int prix;
	/* {Laure=Laure , 1.0=1.0}*/

	private Formule myFormule;
	private Reservation  myReservation;

	public Voyage(Boolean statut, Integer prix, Formule myFormule, Reservation myReservation) {
		super();
		this.statut = statut;
		this.prix = prix;
		this.myFormule = myFormule;
		this.myReservation = myReservation;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public Formule getMyFormule() {
		return myFormule;
	}

	public void setMyFormule(Formule myFormule) {
		this.myFormule = myFormule;
	}

	public Reservation getMyReservation() {
		return myReservation;
	}

	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}

	@Override
	public String toString() {
		return "Voyage [statut=" + statut + ", prix=" + prix + ", myFormule=" + myFormule + ", myReservation="
				+ myReservation + "]";
	}



}