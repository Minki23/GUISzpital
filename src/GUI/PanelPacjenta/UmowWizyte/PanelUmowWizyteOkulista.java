package GUI.PanelPacjenta.UmowWizyte;

import javax.swing.*;
import java.io.IOException;

public class PanelUmowWizyteOkulista extends PanelAbstractUmowWizyte{
    public PanelUmowWizyteOkulista() throws IOException {
        String typ="Okulista";
        JLabel LabelTypLekarza = new JLabel(typ);
        String[] table = {"Anna Kowalska", "Jan Nowak", "Piotr Wiśniewski"};
        add(LabelTypLekarza, getC(6, 3, 0, 0, 0, 0));
        for (int i = 0; i < table.length; i++) {
            JButton buttonlekarz = new JButton(table[i]);
            //buttonlekarz.addActionListener();
            add(buttonlekarz, getC(6, 6 + 2 * i, 0, 0, 0, 0));
        }
    }
}
