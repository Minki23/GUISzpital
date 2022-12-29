import GUI.Menu.PanelMenu;
import GUI.Skladowe.Powierzchnia;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Powierzchnia.getRamka().set(PanelMenu.getMenu());
    }
}