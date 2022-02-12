package com.dic2.git.tpjava.tp2.exo1_2;

public class Constante implements Expression{

    public double value;
    @Override
    public double valeur(double x) {
        return this.value;
    }

    public Constante(double value) {
        this.value = value;
    }



}
