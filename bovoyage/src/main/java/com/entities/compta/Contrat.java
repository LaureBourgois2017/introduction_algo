package com.entities.compta;
/** 
 *  Contrat correspondant entre l'assurance et le client pour telle r?servation
 */
public class Contrat {

	/** 
	 *  reference du contrat
	 */
	private int reference;

	public Contrat(int reference) {
		super();
		this.reference = reference;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Contrat [reference=" + reference + "]";
	}



}