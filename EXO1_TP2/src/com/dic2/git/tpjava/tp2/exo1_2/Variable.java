package com.dic2.git.tpjava.tp2.exo1_2;

public class Variable implements Expression {

    @Override
    public double valeur(double x) {
        return x;
    }

    public Variable() {
    }

    public String toString(){
        return "x";
    }
}
