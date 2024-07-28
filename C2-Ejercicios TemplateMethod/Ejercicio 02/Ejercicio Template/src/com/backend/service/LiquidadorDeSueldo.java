package com.backend.service;

import com.backend.model.Empleado;

public abstract class LiquidadorDeSueldo{
    public String liquidarSueldo(Empleado empleado){
        String rpta = "La liquidación no pudo ser calculada";
        //1-calcular sueldo
        double sueldo = calcularSueldo(empleado);
        if (sueldo > 0){
            //2-generar recibo
            String recibo = generarRecibo(empleado);
            rpta = recibo + ". Sueldo a depositar: $" + sueldo;
            //3-depositar
            System.out.println(depositar(empleado.getNumeroDeCuenta(), empleado.getNombre()));
        }
        return rpta;
    }

    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String generarRecibo(Empleado empleado);

    private String depositar(String numeroCuenta, String nombre){
        return "Orden de deposito en la cuenta: " + numeroCuenta + " para " + nombre;
    }
}


