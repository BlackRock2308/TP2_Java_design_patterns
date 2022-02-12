package com.dic2.git.tpjava.tp2.exo1_2;

public abstract class OperationUnitaire implements Expression {

    public Expression operande;

    public OperationUnitaire(Expression operande) {
        this.operande = operande;
    }
}
