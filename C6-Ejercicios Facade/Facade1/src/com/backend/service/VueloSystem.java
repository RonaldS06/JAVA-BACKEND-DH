package com.backend.service;

import com.backend.model.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class VueloSystem {
    private List<Vuelo> vuelos;

    public VueloSystem() {
        // Inicializamos con algunos datos de prueba
        vuelos = new ArrayList<>();
        vuelos.add(new Vuelo("10-08-2024", "12-10-2024", "Lima"));
        vuelos.add(new Vuelo("15-09-2024", "25-10-2024", "Madrid"));
        vuelos.add(new Vuelo("30-10-2024", "16-12-2024", "Washington DC"));
    }

    public List<String> buscarVuelo(String destino) {
        List<String> resultados = new ArrayList<>();
        for (Vuelo v : vuelos) {
            if (v.getCiudad().equals(destino)) {
                resultados.add("Vuelo a " + destino + " | Salida: " + v.getFechaSalida() + " | Regreso: " + v.getFechaEntrada());
            }
        }
        return resultados;
    }
}
