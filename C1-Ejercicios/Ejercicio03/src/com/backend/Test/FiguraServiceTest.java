package com.backend.Test;

import com.backend.model.Figura;
import com.backend.service.FiguraService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraServiceTest {
    private final FiguraService figura = new FiguraService();
    @Test
    void calcularElAreaDelCirculo(){
        Figura circulo = new Figura(3);
        assertEquals(28.2744, figura.calcularAreaCirculo(circulo));
    }

    @Test
    void calcularElAreaDelCuadrado(){
        Figura cuadrado = new Figura(4);
        assertEquals("El area del cuadrado es 16.0 unidades", figura.calcularAreaCuadrado(cuadrado));
    }
}