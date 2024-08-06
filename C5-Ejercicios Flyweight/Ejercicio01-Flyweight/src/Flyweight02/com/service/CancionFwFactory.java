package Flyweight02.com.service;

import Flyweight02.com.model.Cancion;

import java.util.HashMap;
import java.util.Map;

public class CancionFwFactory {

    private static final Map<String, Cancion> cancionMap = new HashMap<>();

    public static Cancion obtenerCancion(String nombre, String artista, String genero){
        String key = nombre + artista + genero;
        System.out.println(key);
        Cancion cancion = cancionMap.get(key);

        if (cancion == null){
            cancion = new Cancion(nombre, artista, genero);
            cancionMap.put(key, cancion);
            System.out.println("✅Canción creada: " + cancion);
        }else {
            System.out.println("♻ Reutilizo la canción existente: " + cancion);
        }
        return cancion;
    }
}
