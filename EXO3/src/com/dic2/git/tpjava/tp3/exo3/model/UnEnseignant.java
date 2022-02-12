package com.dic2.git.tpjava.tp3.exo3.model;

public class UnEnseignant {

    private String matiere;
    private Integer classeNiveau;

    public UnEnseignant(String matiere, Integer classeNiveau) {
        this.matiere = matiere;
        this.classeNiveau = classeNiveau;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Integer getClasseNiveau() {
        return classeNiveau;
    }

    public void setClasseNiveau(Integer classeNiveau) {
        this.classeNiveau = classeNiveau;
    }
}
