package GUI.PanelPacjenta;

import GUI.Menu.PanelMenu;
import GUI.Skladowe.PanelOgolny;
import GUI.Skladowe.Powierzchnia;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PanelWyswietlProfil extends PanelOgolny {

    private static final PanelWyswietlProfil PanelWyswietlProfil;

    public static GUI.PanelPacjenta.PanelWyswietlProfil getPanelWyswietlProfil() {
        return PanelWyswietlProfil;
    }

    static {
        try {
            PanelWyswietlProfil = new PanelWyswietlProfil();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PanelWyswietlProfil() throws IOException {
        JButton ButtonWyloguj=new JButton("Wyloguj");
        JLabel LabelWyswietlProfil=new JLabel("Twoj Profil");
        LabelWyswietlProfil.setFont(new Font("Now",Font.BOLD,20));
        JButton ButtonZmienTelefon=new JButton("Zmien");
        JButton ButtonZmienWage=new JButton("Zmien");
        JButton ButtonZmienAdres=new JButton("Zmien");
        JButton ButtonZmienEmail=new JButton("Zmien");
        JButton ButtonZatwierdz=new JButton("Zatwierdz Zmiany");
        ButtonZatwierdz.setVisible(false);


        JLabel LabelImieNazwisko=new JLabel("Imie i Nazwisko: ");
        JLabel LabelgetImieNazwisko=new JLabel("Michal Szymczak");
        JTextField TextFieldImie=new JTextField();
        TextFieldImie.setVisible(false);

        JLabel LabelAdresEmail=new JLabel("Adres Email: ");
        JLabel LabelgetAdresEmail=new JLabel("michaszymczak23@gmail.com");
        JTextField TextFieldAdresEmail=new JTextField();
        TextFieldAdresEmail.setVisible(false);

        JLabel LabelTelefon=new JLabel("Nr Telefonu: ");
        JLabel LabelgetTelefon=new JLabel("720800262");
        JTextField TextFieldTelefon=new JTextField();
        TextFieldTelefon.setVisible(false);

        JLabel LabelAdresZamieszkania=new JLabel("Adres Zamieszkania: ");
        JLabel LabelgetAdresZamieszkania=new JLabel("Lubiń ul.Stefanieka 19a");
        JTextField TextFieldAdresZamieszkania=new JTextField();
        TextFieldAdresZamieszkania.setVisible(false);

        JLabel LabelWaga=new JLabel("Waga: ");
        JLabel LabelgetWaga=new JLabel("65"+" kg");
        JTextField TextFieldWaga=new JTextField();
        TextFieldWaga.setVisible(false);

        JLabel LabelPesel=new JLabel("Pesel: ");
        JLabel LabelgetPesel=new JLabel("03302807919");
        JTextField TextFieldPesel=new JTextField();
        TextFieldPesel.setVisible(false);

        ButtonZmienAdres.addActionListener(e -> {
            LabelgetAdresZamieszkania.setVisible(false);
            ButtonZmienAdres.setVisible(false);
            TextFieldAdresZamieszkania.setVisible(true);
            ButtonZatwierdz.setVisible(true);
        });
        ButtonZmienEmail.addActionListener(e -> {
            LabelgetAdresEmail.setVisible(false);
            TextFieldAdresEmail.setVisible(true);
            ButtonZmienEmail.setVisible(false);
            ButtonZatwierdz.setVisible(true);
        });
        ButtonZmienWage.addActionListener(e -> {
            LabelgetWaga.setVisible(false);
            TextFieldWaga.setVisible(true);
            ButtonZmienWage.setVisible(false);
            ButtonZatwierdz.setVisible(true);
        });
        ButtonZmienTelefon.addActionListener(e -> {
            LabelgetTelefon.setVisible(false);
            ButtonZmienTelefon.setVisible(false);
            TextFieldTelefon.setVisible(true);
            ButtonZatwierdz.setVisible(true);
        });
        ButtonZmienAdres.addActionListener(e -> {
            LabelgetAdresZamieszkania.setVisible(false);
            TextFieldAdresZamieszkania.setVisible(true);
            ButtonZmienAdres.setVisible(false);
            ButtonZatwierdz.setVisible(true);
        });
        ButtonZatwierdz.addActionListener(e ->{
            if(TextFieldAdresZamieszkania.isVisible()){
                LabelgetAdresZamieszkania.setText(TextFieldAdresZamieszkania.getText());
                ButtonZmienAdres.setVisible(true);
                TextFieldAdresZamieszkania.setVisible(false);
                LabelgetAdresZamieszkania.setVisible(true);
            }
            if(TextFieldAdresEmail.isVisible()){
                LabelgetAdresEmail.setText(TextFieldAdresEmail.getText());
                ButtonZmienEmail.setVisible(true);
                TextFieldAdresEmail.setVisible(false);
                LabelgetAdresEmail.setVisible(true);
            }
            if(TextFieldWaga.isVisible()){
                LabelgetWaga.setText(TextFieldWaga.getText()+" kg");
                ButtonZmienWage.setVisible(true);
                TextFieldWaga.setVisible(false);
                LabelgetWaga.setVisible(true);
            }
            if(TextFieldTelefon.isVisible()){
                ButtonZmienTelefon.setVisible(true);
                LabelgetTelefon.setText(TextFieldTelefon.getText());
                TextFieldTelefon.setVisible(false);
                LabelgetTelefon.setVisible(true);
            }
            ButtonZatwierdz.setVisible(false);
        });
        ButtonWyloguj.addActionListener(e ->{
            Powierzchnia.getRamka().set(PanelMenu.getMenu());
        });
        add(LabelWyswietlProfil,getC(7,2,0,0,0,0));
        add(LabelPesel,getC(5,4,0,0,0,0));
        add(LabelgetPesel,getC(5,5,0,0,0,0));
        add(LabelAdresZamieszkania,getC(5,8,0,0,0,0));
        add(LabelgetAdresZamieszkania,getC(5,9,0,0,0,0));
        add(TextFieldAdresZamieszkania,getC(5,9,0,0,0,0));
        add(ButtonZmienAdres,getC(6,8,0,0,0,-10));
        add(LabelTelefon,getC(5,12,0,0,0,0));
        add(LabelgetTelefon,getC(5,13,0,0,0,0));
        add(TextFieldTelefon,getC(5,13,0,0,0,0));
        add(ButtonZmienTelefon,getC(6,12,0,0,0,-10));
        add(LabelImieNazwisko,getC(10,4,0,0,0,0));
        add(LabelgetImieNazwisko,getC(10,5,0,0,0,0));
        add(LabelAdresEmail,getC(10,8,0,0,100,0));
        add(LabelgetAdresEmail,getC(10,9,0,0,0,0));
        add(TextFieldAdresEmail,getC(10,9,0,0,0,-10));
        add(ButtonZmienEmail,getC(11,8,0,0,0,-10));
        add(LabelWaga,getC(10,12,0,0,0,0));
        add(LabelgetWaga,getC(10,13,0,0,0,0));
        add(TextFieldWaga,getC(10,13,0,0,0,0));
        add(ButtonZmienWage,getC(11,12,0,0,0,-10));
        add(ButtonZatwierdz,getC(7,14,0,0,0,-10));
        add(ButtonWyloguj,getC(14,1,0,0,0,0));
    }
}
