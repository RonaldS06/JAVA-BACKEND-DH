package CentroVacunacion.com.backend.service.impl;

import CentroVacunacion.com.backend.model.Persona;
import CentroVacunacion.com.backend.service.Vacunatorio;

import java.time.LocalDate;

public class VacunatorioProxy implements Vacunatorio {
    private VacunatorioService vacunatorioService;
    @Override
    public String vacunar(Persona persona) {
        //Controlar Fecha
        String rpta = "La fecha no se corresponde con la fecha asignada";
        if (validarFecha(persona.getFechaAsignada())){
            vacunatorioService = new VacunatorioService();
            rpta = vacunatorioService.vacunar(persona);
        }
        return rpta;
    }

    private boolean validarFecha(LocalDate fechaAsignada){
        LocalDate hoy = LocalDate.now();
        return !hoy.isBefore(fechaAsignada);
    }

}
