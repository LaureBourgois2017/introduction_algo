package com.entities.paiement;
public class MoyenPaiement {
	/* {author=Laure, version=1.0}*/


	/** 
	 *  Nom de la banque
	 */
	private String banque;


	/** 
	 *  Montant sur le compte du client sur le compte de la banque
	 */
	private int montantDisponible;

	public MoyenPaiement(String banque, int montantDisponible) {
		super();
		this.banque = banque;
		this.montantDisponible = montantDisponible;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public int getMontantDisponible() {
		return montantDisponible;
	}

	public void setMontantDisponible(int montantDisponible) {
		this.montantDisponible = montantDisponible;
	}

	@Override
	public String toString() {
		return "MoyenPaiement [banque=" + banque + ", montantDisponible=" + montantDisponible + "]";
	}


}