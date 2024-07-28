package com.backend.Test;

import com.backend.model.Empleado;
import com.backend.model.EmpleadoContratado;
import com.backend.model.EmpleadoEfectivo;
import com.backend.service.LiquidadorContratado;
import com.backend.service.LiquidadorDeSueldo;
import com.backend.service.LiquidadorEfectivo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorDeSueldoTest {
    private LiquidadorDeSueldo liquidadorSueldo;

    @Test
    public void dadounEmpleadoEfectivo_deberiaLiquidarseSuSueldoYGenerarReciboDigital(){
        //arrange
        liquidadorSueldo = new LiquidadorEfectivo();
        Empleado empleado1 = new EmpleadoEfectivo("Ronald", "Santamaria", "CA-72719718", 3000.0, 100, 50);
        String respuestaEsperada = "La liquidación es un archivo digital. Sueldo a depositar: $3050.0";
        //act
        String respuestaObtenida = liquidadorSueldo.liquidarSueldo(empleado1);
        //assert
        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void cuandounEmpleadoContradoPorHoras_deberiaInformarQueNoSePuedeLiquidar(){
        //arrange
        liquidadorSueldo = new LiquidadorContratado();
        Empleado empleadoContratado = new EmpleadoContratado("Martin", "Martini", "CA-6511272", 0, 2000);
        String respuestaEsperada = "La liquidación no pudo ser calculada";
        //act
        String respuestaObtenida = liquidadorSueldo.liquidarSueldo(empleadoContratado);
        //assert
        assertEquals(respuestaEsperada, respuestaObtenida);
    }
}