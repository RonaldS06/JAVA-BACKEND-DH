package Flyweight02.com;

import Flyweight02.com.model.Cancion;
import Flyweight02.com.service.CancionFwFactory;
import Flyweight02.com.service.ListaReproduccion;

public class Test {
    public static void main(String[] args) {
        //Iniciar un arraylist para agregar canciones
        ListaReproduccion listaCanciones = new ListaReproduccion("Favoritos");

        //Creación de canciones utilizando la fábrica
        //Gestiona la creación y reutilización de objetos Cancion
        Cancion cancion1 = CancionFwFactory.obtenerCancion("Billie Jean", "Michael Jackson", "Pop");
        Cancion cancion2 = CancionFwFactory.obtenerCancion("Bohemian Rhapsody", "Queen", "Rock");
        Cancion cancion3 = CancionFwFactory.obtenerCancion("Despacito", "Luis Fonsi", "Latín");
        Cancion cancion4 = CancionFwFactory.obtenerCancion("Bohemian Rhapsody", "Queen", "Rock");

        //Agregamos las canciones
        listaCanciones.agregarCanciones(cancion1);
        listaCanciones.agregarCanciones(cancion2);
        listaCanciones.agregarCanciones(cancion3);
        listaCanciones.agregarCanciones(cancion4);
        //ListaReproduccion listaReproduccion = new ListaReproduccion("Mis favoritas", listaCanciones );
        listaCanciones.obtenerCanciones();
    }
}
