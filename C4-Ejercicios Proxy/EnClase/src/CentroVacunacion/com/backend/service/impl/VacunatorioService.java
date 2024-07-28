package CentroVacunacion.com.backend.service.impl;

import CentroVacunacion.com.backend.model.Persona;
import CentroVacunacion.com.backend.service.Vacunatorio;

public class VacunatorioService implements Vacunatorio {
    @Override
    public String vacunar(Persona persona) {
        System.out.println("Admisión de " + persona.getNombreCompleto());
        return "Se ha registrado a la persona con DNI: " + persona.getDni() + ", fue vacunada con: " + persona.getVacuna();
    }
}
