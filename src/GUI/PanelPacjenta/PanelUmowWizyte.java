package GUI.PanelPacjenta;

import GUI.Menu.PanelMenu;
import GUI.PanelPacjenta.UmowWizyte.*;
import GUI.Skladowe.PanelOgolny;
import GUI.Skladowe.Powierzchnia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.IOException;
public class PanelUmowWizyte extends PanelOgolny {
    private static final PanelUmowWizyte PanelUmowWizyte;

    static {
        try {
            PanelUmowWizyte = new PanelUmowWizyte();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static GUI.PanelPacjenta.PanelUmowWizyte getPanelUmowWizyte() {
        return PanelUmowWizyte;
    }
    public PanelUmowWizyte() throws IOException {
        JLabel LabelUmowNaWizyte = new JLabel("<html>Umow na wizyte<br> Wybierz lekarza:<html>");
        LabelUmowNaWizyte.setFont(new Font("Nul",Font.BOLD,26));
        JButton ButtonLekarzRodzinny = new JButton("Lekarz rodzinny");
        ButtonLekarzRodzinny.addActionListener(e ->{
            try {
                Powierzchnia.getRamka().set(new PanelUmowWizyteLekarzRodzinny());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton ButtonLaryngolog=new JButton("Laryngolog");
        ButtonLaryngolog.addActionListener(e ->{
            try {
                Powierzchnia.getRamka().set(new PanelUmowWizyteLaryngolog());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton ButtonOrtopeda=new JButton("Ortopeda");
        ButtonOrtopeda.addActionListener(e-> {
            try {
                Powierzchnia.getRamka().set(new PanelUmowWizyteOrtopeda());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton ButtonDermatolog=new JButton("Dermatolog");
        ButtonDermatolog.addActionListener(e-> {
            try {
                Powierzchnia.getRamka().set(new PanelUmowWizyteDermatolog());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton ButtonKardiolog=new JButton("Kardiolog");
        ButtonKardiolog.addActionListener(e -> {
            try {
                Powierzchnia.getRamka().set(new PanelUmowWizyteKardiolog());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton ButtonOnkolog=new JButton("Onkolog");
        ButtonOnkolog.addActionListener(e-> {
            try {
                Powierzchnia.getRamka().set(new PanelUmowWizyteOnkolog());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton ButtonGinekolog=new JButton("Ginekolog");
        ButtonGinekolog.addActionListener(e-> {
            try {
                Powierzchnia.getRamka().set(new PanelUmowWizyteGinekolog());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton ButtonOkulista=new JButton("Okulista");
        ButtonOkulista.addActionListener(e-> {
            try {
                Powierzchnia.getRamka().set(new PanelUmowWizyteOkulista());
            } catch (IOException ignored) {
            }
        });
        JButton ButtonWyloguj=new JButton("Wyloguj");
        ButtonWyloguj.addActionListener(e ->{
            PanelChorobyILeki.getHistoria().dispatchEvent(new WindowEvent(PanelChorobyILeki.getHistoria(), WindowEvent.WINDOW_CLOSING));
            PanelChorobyILeki.getLeki().dispatchEvent(new WindowEvent(PanelChorobyILeki.getLeki(), WindowEvent.WINDOW_CLOSING));
            Powierzchnia.getRamka().set(PanelMenu.getMenu());
            PanelPacjent.getTabbedPanelPacjent().setSelectedIndex(0);
        });
        add(LabelUmowNaWizyte,getC(7,2,0,0,0,0));
        add(ButtonLekarzRodzinny,getC(6,4,0,0,20,10));
        add(ButtonOrtopeda,getC(6,6,0,0,40,10));
        add(ButtonKardiolog,getC(6,8,0,0,40,10));
        add(ButtonGinekolog,getC(6,10,0,0,40,10));
        add(ButtonLaryngolog,getC(8,4,0,0,40,10));
        add(ButtonDermatolog,getC(8,6,0,0,40,10));
        add(ButtonOnkolog,getC(8,8,0,0,40,10));
        add(ButtonOkulista,getC(8,10,0,0,40,10));
        add(ButtonWyloguj,getC(14,1,0,0,0,10));
    }
}