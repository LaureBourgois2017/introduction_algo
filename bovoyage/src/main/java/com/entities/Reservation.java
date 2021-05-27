package com.entities;
import java.util.List;

import com.entities.acteur.Client;
import com.entities.acteur.Voyageur;
import com.entities.compta.Assurance;

public class Reservation {
	/* {author=Laure, version=1.0}*/


	/** 
	 *  Liste de voyageurs (corriger le type apr?s la g?n?ration du code)
	 */
	private List<Voyageur> listeVoyageur;
	
	

	/* {author=Laure, version=1.0}*/

	private Integer numeroReservation;
	/* {author=Laure, version=1.0}*/

	/** 
	 *  L'?tat de la r?servation est initialis? ? 0
	 *  0=> en attente
	 *  1 => en cours
	 *  2 => refus?e
	 *  3 => accept?e
	 *  4 => termin?e (option)
	 */
	private int etatReservation;
	/* {author=Laure, version=1.0}*/

	/**
	 * 
	 * @element-type Client
	 */
	private Client  myClient;
	/**
	 * 
	 * @element-type Assurance
	 */
	private Assurance  myAssurance;
	/**
	 * 
	 * @element-type Voyage
	 */
	public Voyage myVoyage;

	public Reservation(List<Voyageur> listeVoyageur, Integer numeroReservation, int etatReservation, Client myClient,
			Assurance myAssurance, Voyage myVoyage) {
		super();
		this.listeVoyageur = listeVoyageur;
		this.numeroReservation = numeroReservation;
		this.etatReservation = etatReservation;
		this.myClient = myClient;
		this.myAssurance = myAssurance;
		this.myVoyage = myVoyage;
	}
	
	public List<Voyageur> getListeVoyageur() {
		return listeVoyageur;
	}

	public void setListeVoyageur(List<Voyageur> listeVoyageur) {
		this.listeVoyageur = listeVoyageur;
	}

	public Integer getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	public int getEtatReservation() {
		return etatReservation;
	}

	public void setEtatReservation(int etatReservation) {
		this.etatReservation = etatReservation;
	}


	public Client getMyClient() {
		return myClient;
	}

	public void setMyClient(Client myClient) {
		this.myClient = myClient;
	}

	public Assurance getMyAssurance() {
		return myAssurance;
	}

	public void setMyAssurance(Assurance myAssurance) {
		this.myAssurance = myAssurance;
	}

	public Voyage getMyVoyage() {
		return myVoyage;
	}

	public void setMyVoyage(Voyage myVoyage) {
		this.myVoyage = myVoyage;
	}

	public void remove(Voyageur v) {
		
		this.listeVoyageur.remove(v);
	}

	public void add(Voyageur v) {
		
		this.listeVoyageur.add(v);
	}

	/** 
	 *  Renvoie le prix total pour la liste des Voyageurs
	 */
	public void getPrix() {
		/* {author=Laure, version=1.0}*/

	}

	/** 
	 *  Modifie l'?tat de la r?servation (voir le diagramme d'?tat transition)
	 */
	public void setEtatReservation() {
		/* {author=Laure, version=1.0}*/

	}

	@Override
	public String toString() {
		return "Reservation [listeVoyageur=" + listeVoyageur + ", numeroReservation=" + numeroReservation
				+ ", etatReservation=" + etatReservation + ", myClient=" + myClient + ", myAssurance=" + myAssurance
				+ ", myVoyage=" + myVoyage + "]";
	}

}