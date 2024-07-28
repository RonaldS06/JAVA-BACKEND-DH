package com.backend.Test;

import com.backend.model.Documento;
import com.backend.model.UsuarioGobierno;
import com.backend.service.Diputados;
import com.backend.service.Ministros;
import com.backend.service.Presidente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioGobiernoTest {
    private UsuarioGobierno diputado;
    private UsuarioGobierno ministro;
    private UsuarioGobierno presidente;

    @BeforeEach
    void setUp() {
        diputado = new Diputados();
        ministro = new Ministros();
        presidente = new Presidente();

        diputado.setSigUsuarioGobierno(ministro);
        ministro.setSigUsuarioGobierno(presidente);
    }

    @Test
    void mostrarDocumentoDeNivelUnoAlDiputado(){
        // Arrange
        Documento doc1 = new Documento("Este es un documento reservado", 1);
        String rptaEsperada = "✅Usuario Diputado. Se puede leer el documento de nivel 1. El documento de nivel 1 dice: Este es un documento reservado";

        // Act
        String rptaObtenida = diputado.enviarDocumento(doc1);

        // Assert
        assertEquals(rptaEsperada, rptaObtenida);
    }

    @Test
    void mostrarDocumentoDeNivelDosAlMinistro(){
        // Arrange
        Documento doc2 = new Documento("Este es un documento secreto", 2);
        String rptaEsperada = "✅Usuario Secreto. Se puede leer el documento de nivel 1 y 2. El documento de nivel 2 dice: Este es un documento secreto";

        // Act
        String rptaObtenida = diputado.enviarDocumento(doc2);

        // Assert
        assertEquals(rptaEsperada, rptaObtenida);
    }

    @Test
    void mostrarDocumentoDeNivelTresAlPresidente(){
        // Arrange
        Documento doc3 = new Documento("Este es un documento muy secreto", 3);
        String rptaEsperada = "✅Usuario Presidente. Se puede leer el documento de nivel 1, 2 y 3. El documento de nivel 3 dice: Este es un documento muy secreto";

        // Act
        String rptaObtenida = diputado.enviarDocumento(doc3);

        // Assert
        assertEquals(rptaEsperada, rptaObtenida);
    }
}