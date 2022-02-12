package com.dic2.git.tpjava.tp2.exo1_2;

public class Exp extends OperationUnitaire{

    public Exp(Expression operande) {
        super(operande);
    }

    public double valeur(double x){
        return Math.exp(super.operande.valeur(x));
    }

    public String toString(){
        return "Exp(" + super.operande + ")";
    }
}
