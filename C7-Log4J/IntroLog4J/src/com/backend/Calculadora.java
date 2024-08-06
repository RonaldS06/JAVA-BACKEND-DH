package com.backend;

import static com.backend.Test.logger;

public class Calculadora {
    private int valor1;
    private int valor2;

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int sumar(){
        return valor1 + valor2;
    }
    public int restar(){
        return valor1 - valor2;
    }
    public double dividir(){
        logger.info("Empezamos a dividir: " + valor1 + "/" + valor2);
        double resultado;
        try{
            resultado = valor1 / valor2;
        }catch (Exception e){
            logger.error("Ocurrió un error al dividir: ", e);
            return 0;
        }
        logger.debug("Terminamos de dividir con éxito");
        return resultado;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}
