package CentroVacunacion.com.backend.Test;

import CentroVacunacion.com.backend.model.Persona;
import CentroVacunacion.com.backend.service.impl.VacunatorioProxy;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VacunatorioProxyTest {
    private final VacunatorioProxy PROXY = new VacunatorioProxy();

    @Test
    void siConcurreUnDiaAntes_laPersonaNoDeberiaSerVacunada(){
        //arrange
        Persona persona1 = new Persona("Pepe Gonzalez", "123456789", "Anti Gripal", LocalDate.now().plusDays(1));
        String rptaEsperada = "La fecha no se corresponde con la fecha asignada";

        //act
        String rptaObtenida = PROXY.vacunar(persona1);

        //assert
        assertEquals(rptaEsperada, rptaObtenida);
    }

}