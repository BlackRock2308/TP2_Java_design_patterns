package com.dic2.git.tpjava.tp2.exo1_2;

public class Main {

    public static void main(String[] args) {
        /* codage de la fonction f(x) = 2 * sin(x) + 3 * cos(x) */

        Expression f = new Addition(
                new Multiplication(
                        new Constante(12),  new Variable()),
                new Sin(new Soustraction(
                        new Multiplication(new Constante(3), new Variable()),
                        new Constante(5)
                )));
        System.out.println("Evaluation de la fonction f(x) = 1x2 * sin(3x - 5)");
        //System.out.println(f);
        /* calcul de la valeur de f(x) pour quelques valeurs de x */
        double[] tab = { 0, 0.5, 1, 1.5, 2, 2.5 };
        for (int i = 0; i < tab.length; i++) {
            double x = tab[i];
            System.out.println("f(" + x + ") = " + f.valeur(x));
        }
        Expression g = new Addition(
                new Multiplication(
                        new Constante(2),  new Sin(new Variable()) ),
                new Multiplication(
                        new Constante(3),  new Cos(new Variable()) ) );
        System.out.println();
        System.out.println("Evaluation de la fonction f(x) = 2 * sin(x) + 3 * cos(x)");
        //System.out.println(g);
        /* calcul de la valeur de g(x) pour quelques valeurs de x */
        double[] tab1 = { 0, 0.5, 1, 1.5, 2, 2.5 };
        for (int i = 0; i < tab.length; i++) {
            double x = tab[i];
            System.out.println("g(" + x + ") = " + g.valeur(x));
        }

        Expression h = new Addition(
                new Exp(new Sin(
                     new Soustraction(
                             new Division(new Variable(), new Constante(-4)),
                             new Constante(-3)
                     )
                )),
                new Cos(new Soustraction(
                        new Constante(0),
                        new Log(new Addition(
                                new Variable(),
                                new Constante(1)
                        ))
                ))
        );
        System.out.println();
        System.out.println("Evaluation de la fonction h(x) = exp(sin(-1/4x -3)) + cos(6 - log(x)");
        /* calcul de la valeur de g(x) pour quelques valeurs de x */
        double[] tab2 = { 1, 0.5, 1, 1.5, 2, 2.5 };
        for (int i = 0; i < tab.length; i++) {
            double x = tab[i];
            System.out.println("h(" + x + ") = " + h.valeur(x));
        }
    }


    }

