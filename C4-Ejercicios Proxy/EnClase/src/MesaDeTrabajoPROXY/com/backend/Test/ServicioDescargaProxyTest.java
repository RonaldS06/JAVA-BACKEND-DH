package MesaDeTrabajoPROXY.com.backend.Test;

import MesaDeTrabajoPROXY.com.backend.model.TipoUsuario;
import MesaDeTrabajoPROXY.com.backend.model.Usuario;
import MesaDeTrabajoPROXY.com.backend.service.IServicioDescarga;
import MesaDeTrabajoPROXY.com.backend.service.impl.ServicioDescargaProxy;
import MesaDeTrabajoPROXY.com.backend.service.impl.ServicioDescargaService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioDescargaProxyTest {

    @Test
    void elUsuarioPremiumPuedeDescargarCanciones(){
        //arrange
        IServicioDescarga servicioDescarga = new ServicioDescargaService();
        IServicioDescarga servicioDescargaProxy = new ServicioDescargaProxy(servicioDescarga);

        Usuario usuarioPremium = new Usuario("1", TipoUsuario.PREMIUM);

        String resultadoEsperado = "El usuario 1 puede descargar canciones por ser PREMIUM";
        //act
        String resultadoObtenido = servicioDescargaProxy.descargar(usuarioPremium);
        //expect
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    @Test
    void elUsuarioFreeNoPuedeDescargarCanciones(){
        //arrange
        IServicioDescarga servicioDescarga = new ServicioDescargaService();
        IServicioDescarga servicioDescargaProxy = new ServicioDescargaProxy(servicioDescarga);

        Usuario usuarioFREE = new Usuario("2", TipoUsuario.FREE);

        String resultadoEsperado = "El usuario FREE no puede descargar esta canción❌";
        //act
        String resultadoObtenido = servicioDescargaProxy.descargar(usuarioFREE);
        //expect
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
}