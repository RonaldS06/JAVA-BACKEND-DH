package com.backend.Test;

import com.backend.model.Menu;
import com.backend.model.MenuInfantil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    //private Menu menu;
    @Test
    public void generarUnPedidoMenuInfantil(){
        //arrange
        Menu menu = new MenuInfantil(10.0, 2);
        String respuestaEsperada = "El menu contiene 2 juguete(s), papas, bebida y hamburguesa El precio total es: 16.0";
        //act

        //expect
    }

}