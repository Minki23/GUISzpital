package GUI.Menu;
import GUI.PanelPacjenta.PanelPacjent;
import GUI.Skladowe.PanelOgolny;
import GUI.Skladowe.Powierzchnia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

public class PanelLogowaniePacjent extends PanelOgolny {
    private static final PanelLogowaniePacjent LogowaniePacjent;

    public static PanelLogowaniePacjent getLogowaniePacjent() {
        return LogowaniePacjent;
    }

    static {
        try {
            LogowaniePacjent = new PanelLogowaniePacjent();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean PoprawneHaslo=false;

    public void setPoprawneHaslo(boolean poprawneHaslo) {
        PoprawneHaslo = poprawneHaslo;
    }

    public PanelLogowaniePacjent() throws IOException {

        //Buttony
        JCheckBox HasloTrue=new JCheckBox("Haslo poprawne");
        JButton ButtonZaloguj = new JButton("Zaloguj");
        JButton ButtonCofnij = new JButton("<-");

        //Labele
        JLabel LabelLogowaniePacjent = new JLabel("Logowanie Pacjent:");
        JLabel LabelPesel=new JLabel("Pesel");
        JLabel LabelHaslo=new JLabel("Haslo");
        JLabel LabelBlednyLoginLubHaslo=new JLabel("Bledny Login lub Haslo");
        LabelBlednyLoginLubHaslo.setForeground(Color.RED);
        LabelBlednyLoginLubHaslo.setVisible(false);
        //Akcje Buttonow
        ButtonCofnij.addActionListener(e -> {
            Powierzchnia.getRamka().set(PanelMenu.getMenu());
        });
        ButtonZaloguj.addActionListener(e ->{
            if(PoprawneHaslo){
                Powierzchnia.getRamka().setTab(PanelPacjent.getTabbedPanelPacjent());
            }
            else {
                LabelBlednyLoginLubHaslo.setVisible(true);
                repaint();
            }
        });
        //Textfieldy
        JTextField TextFieldPeselPacjent = new JTextField();
        JPasswordField TextFieldHasloPacjent = new JPasswordField();
        TextFieldHasloPacjent.setEchoChar('*');
        //Checkbox
        JCheckBox CheckBoxPokazHaslo=new JCheckBox("Pokaz haslo");
        CheckBoxPokazHaslo.setOpaque(false);
        HasloTrue.addItemListener(e -> setPoprawneHaslo(e.getStateChange() == ItemEvent.SELECTED));
        //Akcje CheckBoxow
        CheckBoxPokazHaslo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    TextFieldHasloPacjent.setEchoChar((char) 0);
                } else {
                    TextFieldHasloPacjent.setEchoChar('*');
                }
            }
        });
        //Personalizacja obiektow
        add(CheckBoxPokazHaslo,getC(8,7,0,0,0,0));

        add(LabelLogowaniePacjent, getC(7,3,0,0,10,10));

        add(LabelPesel, getC(7,4,0,0,10,10));

        add(TextFieldPeselPacjent, getC(7,5,0,0,10,10));

        add(LabelHaslo, getC(7,6,0,0,10,10));

        add(TextFieldHasloPacjent, getC(7,7,0,0,10,10));

        add(LabelBlednyLoginLubHaslo, getC(7,8,0,0,0,0));

        add(ButtonZaloguj, getC(7,9,0,0,10,10));

        add(getButtonCofnij(), getC(1,14,0,0,0,0));

        add(HasloTrue,getC(14,14,0,0,0,0));
    }
}
