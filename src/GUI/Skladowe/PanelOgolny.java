package GUI.Skladowe;

import GUI.Menu.PanelMenu;
import GUI.PanelPacjenta.PanelChorobyILeki;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public abstract class PanelOgolny extends JPanel {
    private final GridBagConstraints C = new GridBagConstraints();

    private static final JButton ButtonCofnij = new JButton("<-");

    public static JButton getButtonCofnij() {
        return ButtonCofnij;
    }
    protected static JButton ButtonWyloguj=new JButton("Wyloguj");

    public static JButton getButtonWyloguj() {
        return ButtonWyloguj;
    }

    private final Image scaled;
    public PanelOgolny() throws IOException {
        ButtonWyloguj.addActionListener(e ->{
            PanelChorobyILeki.getHistoria().dispatchEvent(new WindowEvent(PanelChorobyILeki.getHistoria(), WindowEvent.WINDOW_CLOSING));
            PanelChorobyILeki.getLeki().dispatchEvent(new WindowEvent(PanelChorobyILeki.getLeki(), WindowEvent.WINDOW_CLOSING));
            Powierzchnia.getRamka().set(PanelMenu.getMenu());
        });
        ButtonCofnij.addActionListener(e -> {
            Powierzchnia.getRamka().set(PanelMenu.getMenu());
        });
        Image backgroundImage = ImageIO.read(new File("tlo3.jpg"));
        scaled = backgroundImage.getScaledInstance(Powierzchnia.getRamka().getWidth(), Powierzchnia.getRamka().getHeight(), Image.SCALE_SMOOTH);
        setLayout(new GridBagLayout());
        for (int i = 0; i < 15; i++) {
            getC(i, i, 0.5, 0.5, 0, 0);
            add(new PanelPusty(), C);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension d = Powierzchnia.getRamka().getSize();
        g.drawImage(scaled, 0, 0, (int) d.getWidth(), (int) d.getHeight(), this);
    }

    protected GridBagConstraints getC(int gridx, int gridy, double weightx, double weighty, int ipadx, int ipady) {
        C.gridx = gridx;
        C.gridy = gridy;
        C.weightx = weightx;
        C.weighty = weighty;
        C.ipadx=ipadx;
        C.ipady=ipady;
        C.fill = GridBagConstraints.BOTH;
        return C;
    }
}
