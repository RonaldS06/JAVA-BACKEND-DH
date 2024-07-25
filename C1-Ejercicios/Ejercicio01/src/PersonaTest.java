import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    @Test
    public void ApellidoNombre(){
        Persona persona = new Persona("Ronald", "Santamaria", "pizarroronald06@gmail.com", 23);

        String nombreCompleto = persona.getNombreCompleto();
        assertEquals("Santamaria, Ronald", nombreCompleto, "El nombre completo debería ser Santamaria, Ronald");
    }

    @Test
    public void esMayorDeEdad(){
        Persona persona = new Persona("Claudio", "Cirolo", "cirolito@gmail.com", 21);
        assertTrue(persona.esMayor(), "Claudio debería ser considerado mayor de edad");
    }
}