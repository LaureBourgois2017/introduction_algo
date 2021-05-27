package com.entities.paiement;

import java.time.LocalDate;

public class CB extends MoyenPaiement {


	private Integer numeroCB;
	private LocalDate dateExpiration;
	
	public CB(String banque, int montantDisponible) {
		super(banque, montantDisponible);
		// TODO Auto-generated constructor stub
	}



	public Integer getNumeroCB() {
		return numeroCB;
	}

	public void setNumeroCB(Integer numeroCB) {
		this.numeroCB = numeroCB;
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}



	@Override
	public String toString() {
		return "CB [numeroCB=" + numeroCB + ", dateExpiration=" + dateExpiration + "]";
	}


}