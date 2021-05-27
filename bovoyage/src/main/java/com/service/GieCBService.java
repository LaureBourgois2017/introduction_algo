package com.service;

import com.entities.Voyage;
import com.entities.paiement.CB;

public class GieCBService {
  /* {author=Laure, version=1.0}*/


  /** 
   *  Le service verifie que la carte bleu est ok et que le montant disponible de moyen de paiement est sup?rieur ou ?gal au montant du voyage
   */
  public Boolean verifierPaiement(CB cb, Voyage v) {
  /* {author=Laure, version=1.0}*/

  return true;
  }

  /** 
   *  Le service effectue le paiement et d?bite de la banque le montant
   *  correspondant => MoyenPaiement.montDisponible = MoyementPaiement.montantDisponible-Voyage.prix
   */
  public void effectuerPaiement(Voyage v) {
  /* {author=Laure, version=1.0}*/

  }

}