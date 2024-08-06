package com.backend.service;

import com.backend.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelSystem {
    private List<Hotel> hoteles;

    public HotelSystem() {
        // Inicializamos con algunos datos de prueba
        hoteles = new ArrayList<>();
        hoteles.add(new Hotel("10-08-2024", "10-10-2024", "Buenos Aires", "Lima"));
        hoteles.add(new Hotel("15-09-2024", "22-10-2024", "Buenos Aires", "Madrid"));
        hoteles.add(new Hotel("30-10-2024", "14-12-2024", "Buenos Aires", "Washington DC"));
        hoteles.add(new Hotel("11-08-2024", "15-10-2024", "Buenos Aires", "Lima"));
    }

    public List<String> buscarHotel(String ciudad) {
        List<String> resultados = new ArrayList<>();
        for (Hotel h : hoteles) {
            if (h.getDestino().equals(ciudad)) {
                resultados.add("Hotel en " + ciudad + " | Entrada: " + h.getFechaSalida() + " | Salida: " + h.getFechaRegreso());
            }
        }
        return resultados;
    }
}
