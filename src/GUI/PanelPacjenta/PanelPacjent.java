package GUI.PanelPacjenta;

import javax.swing.*;

public class PanelPacjent extends JTabbedPane {
    private static final PanelPacjent TabbedPanelPacjent = new PanelPacjent();

    public static JTabbedPane getTabbedPanelPacjent() {
        return TabbedPanelPacjent;
    }

    public PanelPacjent() {
        add("Wyswietl profil",PanelWyswietlProfil.getPanelWyswietlProfil());
        add("Historia chorob i przypisane leki", PanelChorobyILeki.getHistoriaChorob());
        add("Umow wizyte",PanelUmowWizyte.getPanelUmowWizyte());
    }
}
