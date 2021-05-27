package com.entities.compta;

import com.entities.Reservation;

/** 
 *  L'utilisateur peut souscrire une assurance
 */
public class Assurance {

    private Contrat  myContrat;
    private Reservation  myReservation;
    
	public Assurance(Contrat myContrat, Reservation myReservation) {
		super();
		this.myContrat = myContrat;
		this.myReservation = myReservation;
	}
	public Contrat getMyContrat() {
		return myContrat;
	}
	public void setMyContrat(Contrat myContrat) {
		this.myContrat = myContrat;
	}
	public Reservation getMyReservation() {
		return myReservation;
	}
	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}
	@Override
	public String toString() {
		return "Assurance [myContrat=" + myContrat + ", myReservation=" + myReservation + "]";
	}

}