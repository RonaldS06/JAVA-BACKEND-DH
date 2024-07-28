package com.backend.service;

import com.backend.model.Empleado;
import com.backend.model.EmpleadoEfectivo;

public class LiquidadorEfectivo extends LiquidadorDeSueldo{
    @Override
    protected double calcularSueldo(Empleado empleado) {
        double sueldo = 0;
        if (empleado instanceof EmpleadoEfectivo empleadoEfectivo){
            sueldo = empleadoEfectivo.getSueldoBasico() - empleadoEfectivo.getDescuento() + empleadoEfectivo.getPremio();
            return sueldo;
        }

        return sueldo;
    }
    @Override
    protected String generarRecibo(Empleado empleado) {
        return "La liquidación es un archivo digital";
    }
}
