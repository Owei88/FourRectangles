package org.Hillcrest.chapter2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(50, 50 , 100, 100);
        g2.setColor(Color.BLUE);
        Ellipse2D.Double fillCircle = new Ellipse2D.Double(100, 100, 200 , 200 );
        g2.draw(circle);
        g2.setColor(Color.CYAN);
        g2.fill(fillCircle);
    }
}
