package Flyweight01;

import java.util.HashMap;

public class FlyweightFactory {

    // El HashMap para almacenar los círculos compartidos
    // String es el color que pasemos, nuestro compartido.
    private static final HashMap<String, Circulo> circuloMap = new HashMap<>();

    // Método para obtener un círculo con un color específico
    public static Circulo obtenerCirculo(String color){
        // Buscar en el mapa si ya existe un círculo con ese color
        Circulo circulo = circuloMap.get(color);
        // Si no existe, crear una nueva instancia y guardarla en el mapa
        if (circulo == null){
            //Si no existe el color, lo creamos:
            circulo = new Circulo(color);
            circuloMap.put(color, circulo);
            System.out.println("✅Creo un circulo de color: " + color
            );
        }
        // Devolver el círculo (ya sea uno nuevo o uno existente)
        return circulo;
    }
}
