package com.dic2.git.tpjava.tp2.exo1_2;

public class Log extends OperationUnitaire{

    public Log(Expression operande) {
        super(operande);
    }

    public double valeur(double x){
        return Math.log(super.operande.valeur(x));
    }

    public String toString(){
        return "Log(" + super.operande + ")";
    }
}
