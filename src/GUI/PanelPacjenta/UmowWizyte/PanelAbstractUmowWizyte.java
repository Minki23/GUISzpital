package GUI.PanelPacjenta.UmowWizyte;

import GUI.PanelPacjenta.PanelPacjent;
import GUI.Skladowe.PanelOgolny;
import GUI.Skladowe.Powierzchnia;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public abstract class PanelAbstractUmowWizyte extends PanelOgolny {
    public PanelAbstractUmowWizyte() throws IOException {
        JLabel LabelWyswietlListeLekarzy=new JLabel("Wyswietl liste lekarzy");
        LabelWyswietlListeLekarzy.setFont(new Font("Arial",Font.BOLD,22));
        JButton ButtonWroc=new JButton("Wroc");
        ButtonWroc.addActionListener(e -> {
            PanelPacjent.getTabbedPanelPacjent().setSelectedIndex(2);
            Powierzchnia.getRamka().setTab(PanelPacjent.getTabbedPanelPacjent());
        });
        add(LabelWyswietlListeLekarzy,getC(6,2,0,0,0,0));
        add(ButtonWroc,getC(1,14,0,0,0,0));
    }
}
