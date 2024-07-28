import MesaDeTrabajoPROXY.com.backend.model.TipoUsuario;
import MesaDeTrabajoPROXY.com.backend.model.Usuario;
import MesaDeTrabajoPROXY.com.backend.service.IServicioDescarga;
import MesaDeTrabajoPROXY.com.backend.service.impl.ServicioDescargaProxy;
import MesaDeTrabajoPROXY.com.backend.service.impl.ServicioDescargaService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuarioFree = new Usuario("1", TipoUsuario.FREE);
        Usuario usuarioPremium = new Usuario("2", TipoUsuario.PREMIUM);

        IServicioDescarga servicioDescarga = new ServicioDescargaService();
        IServicioDescarga servicioDescargaProxy = new ServicioDescargaProxy(servicioDescarga);

        System.out.println(servicioDescargaProxy.descargar(usuarioPremium));
        System.out.println(servicioDescargaProxy.descargar(usuarioFree));

    }
}