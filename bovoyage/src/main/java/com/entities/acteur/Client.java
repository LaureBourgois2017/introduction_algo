package com.entities.acteur;

import com.entities.Reservation;
import com.entities.compta.Facture;
import com.entities.paiement.MoyenPaiement;
import com.entities.util.Adresse;

import javax.persistence.Entity;
import javax.persistence.Table;

/** 
 *  Le client n'est pas forcément voyageur, c'est celui ou celle qui finance le voyage.
 */
@Entity
@Table(name="clientTiers")
public class Client extends Personne {


	private Facture  myFacture;	 
    private MoyenPaiement  myMoyenPaiement;
    private Reservation  myReservation;
    
	public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
		super(civilite, nom, prenom, email, myAdresse);
		// TODO Auto-generated constructor stub
	}
	
    
    public Reservation getMyReservation() {
		return myReservation;
	}
	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}
	public Facture getMyFacture() {
		return myFacture;
	}
	public void setMyFacture(Facture myFacture) {
		this.myFacture = myFacture;
	}
	public MoyenPaiement getMyMoyenPaiement() {
		return myMoyenPaiement;
	}
	public void setMyMoyenPaiement(MoyenPaiement myMoyenPaiement) {
		this.myMoyenPaiement = myMoyenPaiement;
	}


	@Override
	public String toString() {
		return "Client [myFacture=" + myFacture + ", myMoyenPaiement=" + myMoyenPaiement + ", myReservation="
				+ myReservation + "]";
	}
	
}