package GUI.PanelPacjenta;

import GUI.Menu.PanelMenu;
import GUI.Skladowe.PanelOgolny;
import GUI.Skladowe.Powierzchnia;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PanelChorobyILeki extends PanelOgolny {
    private static final PanelChorobyILeki HistoriaChorob;

    static {
        try {
            HistoriaChorob = new PanelChorobyILeki();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PanelChorobyILeki getHistoriaChorob() {
        return HistoriaChorob;
    }
    private static boolean HistoriaOtwarta=false;
    private static boolean LekiOtwarte=false;

    public static void setHistoriaOtwarta(boolean historiaOtwarta) {
        HistoriaOtwarta = historiaOtwarta;
    }

    public static void setLekiOtwarte(boolean lekiOtwarte) {
        LekiOtwarte = lekiOtwarte;
    }

    public PanelChorobyILeki() throws IOException {
        OknoHistoriaChorob Historia=new OknoHistoriaChorob();
        OknoPrzypisaneLeki Leki=new OknoPrzypisaneLeki();
        JButton ButtonWyloguj=new JButton("Wyloguj");
        JButton ButtonHistoriaChorob = new JButton("Historia Chorob");
        JButton ButtonPrzypisaneLeki = new JButton("Przypisane Leki");
        ButtonHistoriaChorob.addActionListener(a->{
            if(HistoriaOtwarta){
                Historia.toFront();
            }
            else {
                Historia.setVisible(true);
            }
        });
        ButtonPrzypisaneLeki.addActionListener(a->{
            if(LekiOtwarte){
                Leki.toFront();
            }
            else {
                Leki.setVisible(true);
            }
        });
        ButtonHistoriaChorob.setFont(new Font("Now",Font.BOLD,20));
        ButtonPrzypisaneLeki.setFont(new Font("Now",Font.BOLD,20));
        add(ButtonHistoriaChorob,getC(5,7,0,0,0,0));
        add(ButtonPrzypisaneLeki,getC(10,7,0,0,0,0));
        add(ButtonWyloguj,getC(14,1,0,0,0,0));
        ButtonWyloguj.addActionListener(e -> Powierzchnia.getRamka().set(PanelMenu.getMenu()));
    }
}
