package MesaDeTrabajoPROXY.com.backend.service.impl;

import MesaDeTrabajoPROXY.com.backend.model.TipoUsuario;
import MesaDeTrabajoPROXY.com.backend.model.Usuario;
import MesaDeTrabajoPROXY.com.backend.service.IServicioDescarga;

public class ServicioDescargaProxy implements IServicioDescarga {

    private IServicioDescarga iServicioDescarga;

    public ServicioDescargaProxy(IServicioDescarga iServicioDescarga) {
        this.iServicioDescarga = iServicioDescarga;
    }

    @Override
    public String descargar(Usuario usuario) {
        String rpta = "El usuario " + usuario.getTipo() + " no puede descargar esta canción❌";
        if (validarUsuario(usuario)){
            return iServicioDescarga.descargar(usuario);
        }
        return rpta;
    }

    public boolean validarUsuario(Usuario usuario){
        return usuario.getTipo().equals(TipoUsuario.PREMIUM);
    }

}
