package com.backend.service;

import com.backend.model.Documento;
import com.backend.model.UsuarioGobierno;

public class Presidente extends UsuarioGobierno {

    public Presidente() {
        super("Presidente", 3);
    }

    @Override
    public String leerDocumento(Documento documento) {
        String rptaUsuario = "Este es un documento de nivel" + documento.getNivelAcceso();
        if (documento.getNivelAcceso() <= this.getTipoDeAcceso()){
            rptaUsuario = "✅Usuario Presidente. Se puede leer el documento de nivel 1, 2 y 3. El documento de nivel " + documento.getNivelAcceso() + " dice: " + documento.getContenido();
        } else if (getSigUsuarioGobierno() != null) {
            getSigUsuarioGobierno().leerDocumento(documento);
        }
        return rptaUsuario;
    }
}
