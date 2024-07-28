package com.backend.service;

import com.backend.model.Documento;
import com.backend.model.UsuarioGobierno;

public class Diputados extends UsuarioGobierno {
    public Diputados() {
        super("Diputado", 1);
    }

    @Override
    public String leerDocumento(Documento documento) {
        String rptaUsuario = "Este es un documento de nivel" + documento.getNivelAcceso();
        if (documento.getNivelAcceso().equals(this.getTipoDeAcceso())){
            rptaUsuario = "✅Usuario Diputado. Se puede leer el documento de nivel 1. El documento de nivel " + documento.getNivelAcceso() + " dice: " + documento.getContenido();
        }
        return rptaUsuario;
    }
}
