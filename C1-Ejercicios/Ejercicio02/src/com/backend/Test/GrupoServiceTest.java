package com.backend.Test;

import com.backend.model.Persona;
import com.backend.service.GrupoService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GrupoServiceTest {
    //Dadas 5 personas (Juan, Pedro, Ana, Luz y Julián) y una colección vacía de objetos tipo Persona, cuando se intentan agregar estas a la colección, el tamaño de la colección debería ser 2.
    private final GrupoService GRUPO_SERVICE = new GrupoService(new ArrayList<>());

    @Test
    void dadasCincoPersonas_deberiaResultarUnaColeccionDeDosObjetos() {
        //arrange
        Persona persona1 = new Persona("Juan", 20);
        Persona persona2 = new Persona("Luz", 20);
        Persona persona3 = new Persona("Lucas", 20);
        Persona persona4 = new Persona("Ana", 20);
        Persona persona5 = new Persona("Pedro", 20);

        //act
        GRUPO_SERVICE.admitirPersona(persona1);
        GRUPO_SERVICE.admitirPersona(persona2);
        GRUPO_SERVICE.admitirPersona(persona3);
        GRUPO_SERVICE.admitirPersona(persona4);
        GRUPO_SERVICE.admitirPersona(persona5);

        //assert
        assertEquals(2, GRUPO_SERVICE.getPersonas().size());
    }
}

