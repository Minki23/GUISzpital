package GUI.Menu;
import GUI.Skladowe.PanelOgolny;
import GUI.Skladowe.PanelPusty;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PanelRejestracja extends PanelOgolny {
    private static final PanelRejestracja rejestracja;

    static {
        try {
            rejestracja = new PanelRejestracja();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public PanelRejestracja() throws IOException {

        JLabel LabelRejestracja=new JLabel("Rejestracja");

        JLabel LabelImie=new JLabel("Imie: ");
        JTextField TextFieldImie=new JTextField();

        JLabel LabelAdresEmail=new JLabel("Adres Email ");
        JTextField TextFieldAdresEmail=new JTextField();

        JLabel LabelTelefon=new JLabel("Nr Telefonu: ");
        JTextField TextFieldTelefon=new JTextField();

        JLabel LabelDataUrodzenia=new JLabel("Data Urodzenia: ");
        JTextField TextFieldDataUrodzenia=new JTextField();

        JLabel LabelAdresZamieszkania=new JLabel("Adres Zamieszkania: ");
        JTextField TextFieldAdresZamieszkania=new JTextField();

        JLabel LabelWaga=new JLabel("Waga: ");
        JTextField TextFieldWaga=new JTextField();

        JLabel LabelWzrost=new JLabel("Wzrost: ");
        JTextField TextFieldWzrost=new JTextField();

        JLabel LabelGrupaKrwi=new JLabel("Grupa Krwi: ");
        JTextField TextFieldGrupaKrwi=new JTextField();

        JLabel LabelNazwisko=new JLabel("Nazwisko: ");
        JTextField TextFieldNazwisko=new JTextField();

        JLabel LabelPesel=new JLabel("Pesel: ");
        JTextField TextFieldPesel=new JTextField();

        JLabel LabelWybierzPlec=new JLabel("Wybierz plec: ");
        JButton ButtonRejestruj=new JButton("Rejestruj");

        JRadioButton RadioButtonKobieta=new JRadioButton("Kobieta");
        RadioButtonKobieta.setOpaque(false);

        JRadioButton RadioButtonMezczyzna=new JRadioButton("Mezczyzna");
        RadioButtonMezczyzna.setOpaque(false);

        ButtonGroup group = new ButtonGroup();
        group.add(RadioButtonKobieta);
        group.add(RadioButtonMezczyzna);

        JComponent[] tab={LabelImie,LabelAdresEmail,LabelTelefon,LabelAdresZamieszkania,LabelDataUrodzenia,LabelWzrost,
                TextFieldImie,TextFieldAdresEmail,TextFieldTelefon,TextFieldAdresZamieszkania,
                TextFieldDataUrodzenia,TextFieldWzrost,LabelNazwisko,LabelPesel,LabelGrupaKrwi,LabelWaga,
                LabelWybierzPlec,RadioButtonKobieta,TextFieldNazwisko,TextFieldPesel,TextFieldGrupaKrwi,TextFieldWaga,
                new PanelPusty(),RadioButtonMezczyzna};
        RadioButtonKobieta.setHorizontalAlignment(SwingConstants.RIGHT);
        for(int i=0;i< tab.length;i++){
            if(tab[i].getClass()== JLabel.class) {
                ((JLabel) tab[i]).setHorizontalAlignment(SwingConstants.RIGHT);
            }
                if (i < 6) {
                    add(tab[i], getC(1, i + 6, 0, 0, 0, 0));
                } else if (i<12) {
                    add(tab[i], getC(2, i, 0, 0, 200, 0));
                }
                else if (i<18) {
                    add(tab[i], getC(5, i -6, 0, 0, 0, 0));
                } else {
                    add(tab[i], getC(6, i -12, 0, 0, 100, 0));
            }
                add(getButtonCofnij(),getC(1,15,0,0,0,0));
        }
        LabelRejestracja.setFont(new Font("Now",Font.BOLD,30));
        add(LabelRejestracja,getC(5,2,0,0,0,0));
        add(ButtonRejestruj,getC(5,13,0,0,0,0));
    }
}
