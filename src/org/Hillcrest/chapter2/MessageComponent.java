package org.Hillcrest.chapter2;

import javax.swing.*;
import java.awt.*;

public class MessageComponent extends JComponent{

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("Among us", 100, 100);
        g2.drawString("Bro that's pretty sus", 50, 50);
    }
}
