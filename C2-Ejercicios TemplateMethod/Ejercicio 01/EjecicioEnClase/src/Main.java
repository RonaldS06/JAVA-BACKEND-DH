import com.backend.model.Menu;
import com.backend.model.MenuClasico;
import com.backend.model.MenuInfantil;
import com.backend.model.MenuVegetariano;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Menu menuInfantil = new MenuInfantil(15.0, 3);
        menuInfantil.ejecutarSistema();

        Menu menuVegetarino = new MenuVegetariano(18, 2);
        menuVegetarino.ejecutarSistema();

        Menu menuClasico = new MenuClasico(12.0);
        menuClasico.ejecutarSistema();
    }
}