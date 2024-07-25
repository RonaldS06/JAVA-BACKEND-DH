package com.backend.service;

import com.backend.model.Figura;

public class FiguraService {
    private static final double PI = 3.1416;

    public FiguraService() {
    }

    public double calcularAreaCirculo(Figura figura){
        double radio = figura.getDimension();

        if(radio > 0){
            double areaCuadrado = radio * radio;
            double resultado = PI * areaCuadrado;
            return resultado;
        }else {
            System.out.println("El valor del radio debe ser mayor que cero");
            return 0;
        }
    }

    public String calcularAreaCuadrado(Figura figura){
        double lado = figura.getDimension();
        if (lado > 0){
            double resultado = lado * lado;
            return "El area del cuadrado es " + resultado + " unidades";
        }else {
            return "El valor del radio debe ser mayor que cero";
        }

    }
}
