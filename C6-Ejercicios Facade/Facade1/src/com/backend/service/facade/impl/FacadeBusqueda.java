package com.backend.service.facade.impl;

import com.backend.model.Vuelo;
import com.backend.service.HotelSystem;
import com.backend.service.VueloSystem;
import com.backend.service.facade.IBusquedaViaje;

import java.util.List;

public class FacadeBusqueda implements IBusquedaViaje {
    private VueloSystem vueloSystem;
    private HotelSystem hotelSystem;

    public FacadeBusqueda() {
        this.vueloSystem = new VueloSystem();
        this.hotelSystem = new HotelSystem();
    }

    @Override
    public void realizarBusqueda(String ciudad) {
        List<String> vuelos = vueloSystem.buscarVuelo(ciudad);
        List<String> hoteles = hotelSystem.buscarHotel(ciudad);

        System.out.println("🛫Vuelos disponibles para " + ciudad + ":");
        for (String v : vuelos) {
            System.out.println(v);
        }

        System.out.println("🏩Hoteles disponibles en " + ciudad + ":");
        for (String h : hoteles) {
            System.out.println(h);
        }
    }
}
