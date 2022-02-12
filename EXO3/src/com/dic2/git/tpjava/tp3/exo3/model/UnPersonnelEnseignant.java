package com.dic2.git.tpjava.tp3.exo3.model;

import com.dic2.git.tpjava.tp3.exo3.Enseignant;
import com.dic2.git.tpjava.tp3.exo3.Personnel;

public class UnPersonnelEnseignant implements Personnel, Enseignant {


    @Override
    public void gestionCarriere(UnPersonnel unPersonnel) {
        System.out.println(unPersonnel.getNom());
        System.out.println(unPersonnel.getAnneeNaissance());
    }

    @Override
    public void emploiDuTemps(UnEnseignant  unEnseignant) {
        System.out.println(unEnseignant.getMatiere());
        System.out.println(unEnseignant.getClasseNiveau());

    }
}
