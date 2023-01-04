package GUI.PanelPacjenta.UmowWizyte;

import javax.swing.*;
import java.io.IOException;

public class PanelUmowWizyteLekarzRodzinny extends PanelAbstractUmowWizyte{
    public PanelUmowWizyteLekarzRodzinny() throws IOException {
        String typ="Lekarz Rodzinny";
        JLabel LabelTypLekarza=new JLabel(typ);
        String[] lekarze={
                "Dr Tomasz Malinowski",
                "Dr House",
                "Dr Anna Maria Wesolowska"
        };
        add(LabelTypLekarza,getC(6,3,0,0,0,0));
        for (int i=0;i<lekarze.length;i++){
            JButton buttonlekarz=new JButton(lekarze[i]);
            //buttonlekarz.addActionListener();
            add(buttonlekarz,getC(6,6+2*i,0,0,0,0));
        }
    }
}
