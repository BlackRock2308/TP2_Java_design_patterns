package com.dic2.git.tpjava.tp2.exo1_2;

public abstract class OperationBinaire implements Expression{

    public Expression gauche;
    public Expression droite;

    public OperationBinaire(Expression gauche, Expression droite) {
        this.gauche = gauche;
        this.droite = droite;
    }


}
