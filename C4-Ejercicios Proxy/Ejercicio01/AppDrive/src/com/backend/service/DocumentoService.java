package com.backend.service;

import com.backend.model.Documento;
import com.backend.model.IDocumento;

import java.util.ArrayList;
import java.util.List;

public class DocumentoService implements IDocumento {

    private List<Documento> documentos = new ArrayList<>();

    public DocumentoService(List<Documento> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String traerDocumento(String url, String email) {
        return null;
    }
}
