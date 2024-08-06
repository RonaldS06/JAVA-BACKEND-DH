package Flyweight02.com.service;

import Flyweight02.com.model.Cancion;

import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion {

    private String nombre;
    private List<Cancion> canciones ;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCanciones(Cancion cancion){
        canciones.add(cancion);
    }

    public void eliminarCancion(Cancion cancion){
        canciones.remove(cancion);
    }

    public List<Cancion> obtenerCanciones() {
        System.out.println("Lista de reproducción " + nombre + ": ");
        for (Cancion cancion : canciones) {
            System.out.println(cancion);
        }
        return canciones;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "ListaReproduccion{" +
                "nombre='" + nombre + '\'' +
                ", canciones=" + canciones +
                '}';
    }
}
