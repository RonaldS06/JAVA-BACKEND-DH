package MesaDeTrabajoPROXY.com.backend.service.impl;

import MesaDeTrabajoPROXY.com.backend.model.Usuario;
import MesaDeTrabajoPROXY.com.backend.service.IServicioDescarga;

public class ServicioDescargaService implements IServicioDescarga {
    @Override
    public String descargar(Usuario usuario) {
        System.out.println("Descarga de la persona " + usuario.getId() + " " + usuario.getTipo());
        return "El usuario " + usuario.getId() + " puede descargar canciones por ser " + usuario.getTipo();
    }
}
