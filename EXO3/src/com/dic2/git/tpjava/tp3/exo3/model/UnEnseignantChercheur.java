package com.dic2.git.tpjava.tp3.exo3.model;

import com.dic2.git.tpjava.tp3.exo3.Chercheur;
import com.dic2.git.tpjava.tp3.exo3.Enseignant;

public class UnEnseignantChercheur implements Enseignant, Chercheur {

    @Override
    public void emploiDuTemps(UnEnseignant  unEnseignant) {
        System.out.println(unEnseignant.getMatiere());
        System.out.println(unEnseignant.getClasseNiveau());

    }
    @Override
    public void rapportActivite(UnChercheur unChercheur) {
        System.out.println(unChercheur.getDomaineDeRecherches());
        System.out.println(unChercheur.getNombrePublications());

    }
}
