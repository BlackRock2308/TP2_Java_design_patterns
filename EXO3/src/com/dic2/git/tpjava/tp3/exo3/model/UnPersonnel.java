package com.dic2.git.tpjava.tp3.exo3.model;


public class UnPersonnel {
    private String nom;
    private Long numeroSS;
    private Integer anneeNaissance;

    public UnPersonnel(String nom, Long numeroSS, Integer anneeNaissance) {
        this.nom = nom;
        this.numeroSS = numeroSS;
        this.anneeNaissance = anneeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(Long numeroSS) {
        this.numeroSS = numeroSS;
    }

    public Integer getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(Integer anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }
}
