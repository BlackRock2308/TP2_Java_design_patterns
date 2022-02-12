package com.dic2.git.tpjava.tp2.exo1_2;

public class Sin extends OperationUnitaire  {

    public Sin(Expression operande) {
        super(operande);
    }

    public double valeur(double x){
        return Math.sin(super.operande.valeur(x));
    }

    public String toString(){
        return "sin(" + super.operande + ")";
    }

}
