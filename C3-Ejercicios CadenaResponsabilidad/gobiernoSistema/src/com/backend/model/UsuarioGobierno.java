package com.backend.model;

public abstract class UsuarioGobierno {
    private String tipoDeUsuario;
    private Integer tipoDeAcceso;
    private UsuarioGobierno sigUsuarioGobierno;

    public UsuarioGobierno(String tipoDeUsuario, Integer tipoDeAcceso) {
        this.tipoDeUsuario = tipoDeUsuario;
        this.tipoDeAcceso = tipoDeAcceso;
    }

    public abstract String leerDocumento(Documento documento);

    public UsuarioGobierno getSigUsuarioGobierno(){
        return sigUsuarioGobierno;
    }
    public void setSigUsuarioGobierno(UsuarioGobierno usuario){
        sigUsuarioGobierno = usuario;
    }

    public String enviarDocumento(Documento documento){
        String rptaDeUsuario = leerDocumento(documento);
        if (rptaDeUsuario.equals("Este es un documento de nivel" + documento.getNivelAcceso())){
            String rptaDeUsuario2 = "❌El usuario " + getTipoDeUsuario() + " no puede leer el documento. " + rptaDeUsuario;
            System.out.println(rptaDeUsuario2);
            return sigUsuarioGobierno.enviarDocumento(documento);
        }
        return rptaDeUsuario;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }
    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public Integer getTipoDeAcceso() {
        return tipoDeAcceso;
    }
    public void setTipoDeAcceso(Integer tipoDeAcceso) {
        this.tipoDeAcceso = tipoDeAcceso;
    }
}
