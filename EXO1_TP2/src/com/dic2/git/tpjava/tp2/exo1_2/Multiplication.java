package com.dic2.git.tpjava.tp2.exo1_2;

public class Multiplication extends OperationBinaire{


    public Multiplication(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    public double valeur(double x){
        return super.gauche.valeur(x) * super.droite.valeur(x);
    }

    public String toString(){
        return super.gauche + "*" + super.droite ;
    }
}
