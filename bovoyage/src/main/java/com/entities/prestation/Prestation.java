package com.entities.prestation;
import java.time.LocalDate;

import com.entities.Formule;

/** 
 *  La prestation comprend :
 *  - date de d?part
 *  - date d'arriv?e
 *  - prix HT
 *  - compagnie
 */
public class Prestation {
	/* {author=Laure, version=1.0}*/


	/** 
	 *  Le type de l'attribut dateDepart est LocalDateTime
	 */
	private LocalDate dateDepart;
	/* {author=Laure, version=1.0}*/

	/** 
	 *  Le type de l'attribut dateArrive est LocalDateTime
	 */
	private LocalDate dateArrivee;
	/* {author=Laure, version=1.0}*/

	private int prixHT;
	/* {author=Laure, version=1.0}*/

	private String compagnie;
	/* {author=Laure, version=1.0}*/

	public Formule  myFormule;

	public Prestation(LocalDate dateDepart, LocalDate dateArrivee, int prixHT, String compagnie, Formule myFormule) {
		super();
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prixHT = prixHT;
		this.compagnie = compagnie;
		this.myFormule = myFormule;
	}

	public LocalDate getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	public LocalDate getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public int getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(int prixHT) {
		this.prixHT = prixHT;
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public Formule getMyFormule() {
		return myFormule;
	}

	public void setMyFormule(Formule myFormule) {
		this.myFormule = myFormule;
	}

	@Override
	public String toString() {
		return "Prestation [dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + ", prixHT=" + prixHT
				+ ", compagnie=" + compagnie + ", myFormule=" + myFormule + "]";
	}

}