package com.entities.acteur;

import com.entities.Reservation;
import com.entities.util.Adresse;
import javax.persistence.Entity;
import javax.persistence.Table;

/** 
 *  Plusieurs voyageurs peuvent ?tre inscrits sur le m?me voyage (exemple famille).
 */
@Entity
@Table(name="voyageur")
public class Voyageur extends Personne {
	/* {author=Laure, version=1.0}*/


	public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
		super(civilite, nom, prenom, email, myAdresse);
		// TODO Auto-generated constructor stub
	}

	/** 
	 *  num?ro de passeport ou de carte d'identit? (compos? de chiffres et de lettre donc on met par d?faut un type String)
	 */
	private String numeroPieceIdentite;
	/* {author=Laure, version=1.0}*/

	private int age;

	private Reservation  myReservation;

	

	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}

	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Reservation getMyReservation() {
		return myReservation;
	}

	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}

	@Override
	public String toString() {
		return "Voyageur [numeroPieceIdentite=" + numeroPieceIdentite + ", age=" + age + ", myReservation="
				+ myReservation + "]";
	}

}