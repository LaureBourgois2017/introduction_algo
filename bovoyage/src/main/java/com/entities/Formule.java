package com.entities;

import com.entities.prestation.Prestation;

/** 
 *  La formule est associ? au voyage.
 */
public class Formule {
	/* {Laure=Laure, 1.0=1.0}*/


	/** 
	 *  Prix de la formule
	 */
	private int prix;
	/* {Laure=Laure, 1.0=1.0}*/

	private Prestation myPrestation;

	public Formule(int prix, Prestation myPrestation) {
		super();
		this.prix = prix;
		this.myPrestation = myPrestation;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public Prestation getMyPrestation() {
		return myPrestation;
	}

	public void setMyPrestation(Prestation myPrestation) {
		this.myPrestation = myPrestation;
	}

	@Override
	public String toString() {
		return "Formule [prix=" + prix + ", myPrestation=" + myPrestation + "]";
	}

}