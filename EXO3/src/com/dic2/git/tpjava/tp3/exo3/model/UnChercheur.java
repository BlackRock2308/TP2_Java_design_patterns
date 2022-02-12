package com.dic2.git.tpjava.tp3.exo3.model;

public class UnChercheur {

    private String domaineDeRecherches;
    private Integer nombrePublications;

    public UnChercheur(String domaineDeRecherches, Integer nombrePublications) {
        this.domaineDeRecherches = domaineDeRecherches;
        this.nombrePublications = nombrePublications;
    }

    public String getDomaineDeRecherches() {
        return domaineDeRecherches;
    }

    public void setDomaineDeRecherches(String domaineDeRecherches) {
        this.domaineDeRecherches = domaineDeRecherches;
    }

    public Integer getNombrePublications() {
        return nombrePublications;
    }

    public void setNombrePublications(Integer nombrePublications) {
        this.nombrePublications = nombrePublications;
    }
}
