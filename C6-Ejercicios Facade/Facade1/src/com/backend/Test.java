package com.backend;

import com.backend.model.Hotel;
import com.backend.service.HotelSystem;
import com.backend.service.facade.impl.FacadeBusqueda;

public class Test {
    public static void main(String[] args) {
        FacadeBusqueda fachada = new FacadeBusqueda();
        fachada.realizarBusqueda("Lima");
    }
}
