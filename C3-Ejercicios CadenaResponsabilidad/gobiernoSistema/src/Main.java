import com.backend.model.Documento;
import com.backend.model.UsuarioGobierno;
import com.backend.service.Diputados;
import com.backend.service.Ministros;
import com.backend.service.Presidente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Documentos
        Documento docReservado = new Documento("Este es un documento Reservado", 1);
        Documento docSecreto = new Documento("Este es un documento secreto", 2);
        Documento docMuySecreto = new Documento("Este es un documento muy secreto", 3);

        //Usuarios
        UsuarioGobierno diputado = new Diputados();
        UsuarioGobierno ministro = new Ministros();
        UsuarioGobierno presidente = new Presidente();

        //Set
        diputado.setSigUsuarioGobierno(ministro);
        ministro.setSigUsuarioGobierno(presidente);

        //Pruebas
        //System.out.println(diputado.LeerDocumento(doc1))
        System.out.println(diputado.enviarDocumento(docSecreto));
    }
}