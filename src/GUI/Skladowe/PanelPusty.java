package GUI.Skladowe;
import javax.swing.*;

public class PanelPusty extends JPanel {
    public PanelPusty(){
        setOpaque(false);
    }
    public void dodaj(JComponent rzecz){
        add(rzecz);
    }
}
