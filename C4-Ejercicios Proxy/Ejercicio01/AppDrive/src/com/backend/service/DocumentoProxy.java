package com.backend.service;

import com.backend.model.Documento;
import com.backend.model.IDocumento;

import java.util.ArrayList;
import java.util.List;

public class DocumentoProxy implements IDocumento {

    private IDocumento documentoService;
    private List<String> registroAccesos = new ArrayList<>();

    public DocumentoProxy(IDocumento documentoService) {
        this.documentoService = documentoService;
    }

    @Override
    public String traerDocumento(String url, String email) {
        String resultado = documentoService.traerDocumento(url,email);
        registroAccesos.add("Usuario: " + email + ", URL: " + url + ", Resultado: " + resultado);
        return resultado;
    };

    public IDocumento getDocumentoService() {
        return documentoService;
    }
    public List<String> getRegistroAccesos() {
        return registroAccesos;
    }

}
