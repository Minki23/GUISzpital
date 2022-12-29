package GUI.Skladowe;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JPanelWithBackground extends JPanel {
        private final Image backgroundImage;

        // Some code to initialize the background image.
        // Here, we use the constructor to load the image. This
        // can vary depending on the use case of the panel.
  public JPanelWithBackground(String fileName) throws IOException {
            backgroundImage = ImageIO.read(new File(fileName));
        }
    public JPanelWithBackground() throws IOException {
        backgroundImage = ImageIO.read(new File("tlo1.png"));
    }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw the background image.
            g.drawImage(backgroundImage, 0, 0, this);
        }
    }
