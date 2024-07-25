package com.backend.service;

import com.backend.model.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GrupoService {

    //Agregar personas a una colección
    //Definimos el tipo de dato de la variable, y dsps le damos la implementación que quiero de esa interfaz
    //private List<Persona> personas = new ArrayList<>();
    private List<Persona> personas;
    public GrupoService(List<Persona> personas){
        this.personas = personas;
    }

    public List<Persona> getPersonas(){
        return personas;
    }
    public void setPersonas(List<Persona> personas){
        this.personas = personas;
    }

    public void admitirPersona(Persona persona){
        //Aux
        boolean cumpleCondiciones = persona.getNombre().length() >= 5
                        && persona.getNombre().matches("[a-zA-Z]+")
                        && persona.getEdad() > 18
                        && persona.getEdad() <= 99;

        if (cumpleCondiciones) personas.add(persona);
        else System.out.println("No es posible adminitir a " + persona.getNombre() + " al grupo");
    }
}