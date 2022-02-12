package com.dic2.git.tpjava.tp3.exo3.model;

import com.dic2.git.tpjava.tp3.exo3.Chercheur;
import com.dic2.git.tpjava.tp3.exo3.Personnel;

public class UnPersonnelChercheur implements Personnel, Chercheur {


    @Override
    public void gestionCarriere(UnPersonnel unPersonnel) {
        System.out.println(unPersonnel.getNom());
        System.out.println(unPersonnel.getAnneeNaissance());
    }


    @Override
    public void rapportActivite(UnChercheur unChercheur) {
        System.out.println(unChercheur.getDomaineDeRecherches());
        System.out.println(unChercheur.getNombrePublications());

    }
}
