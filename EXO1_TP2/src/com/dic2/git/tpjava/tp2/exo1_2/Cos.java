package com.dic2.git.tpjava.tp2.exo1_2;

public class Cos extends OperationUnitaire {

    public Cos(Expression operande) {
        super(operande);
    }

    public double valeur(double x){
        return Math.cos(super.operande.valeur(x));
    }

    public String toString(){
        return "cos(" + super.operande + ")";
    }
}
