package com.backend;

import org.apache.log4j.Logger;

public class Test {
    static final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora(5,3);
        int suma = calculadora1.sumar();
        System.out.println(suma);

        Calculadora calculadora2 = new Calculadora(1,0);
        double resultado2 = calculadora2.dividir();
    }
}
