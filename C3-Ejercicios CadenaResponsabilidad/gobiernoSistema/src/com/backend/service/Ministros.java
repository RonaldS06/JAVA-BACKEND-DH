package com.backend.service;

import com.backend.model.Documento;
import com.backend.model.UsuarioGobierno;

public class Ministros extends UsuarioGobierno {
    public Ministros() {
        super("Ministro", 2);
    }

    @Override
    public String leerDocumento(Documento documento) {
        String rptaUsuario = "Este es un documento de nivel" + documento.getNivelAcceso();
        if (documento.getNivelAcceso() <= this.getTipoDeAcceso() ){
            rptaUsuario = "✅Usuario Secreto. Se puede leer el documento de nivel 1 y 2. El documento de nivel " + documento.getNivelAcceso() + " dice: " + documento.getContenido();
        }
        return rptaUsuario;
    }
}
