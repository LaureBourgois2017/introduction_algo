package com.entities.acteur;

import com.entities.util.Adresse;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="Personne")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne {
	/* {author=Laure, version=1.0}*/

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String civilite;
	/* {author=Laure, version=1.0}*/

	private String nom;
	/* {author=Laure, version=1.0}*/

	private String prenom;
	/* {author=Laure, version=1.0}*/

	private String email;
	/* {author=Laure, version=1.0}*/

	private Adresse  myAdresse;

	public Personne(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.myAdresse = myAdresse;
	}

	private String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getMyAdresse() {
		return myAdresse;
	}

	public void setMyAdresse(Adresse myAdresse) {
		this.myAdresse = myAdresse;
	}

	@Override
	public String toString() {
		return "Personne [civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", myAdresse=" + myAdresse + "]";
	}

}