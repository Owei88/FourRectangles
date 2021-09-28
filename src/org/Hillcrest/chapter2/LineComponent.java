package org.Hillcrest.chapter2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineComponent extends JComponent {



    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Line2D.Double line = new Line2D.Double(4, 8, 15, 100);
        g2.draw(line);

        Line2D.Double line2 = new Line2D.Double (new Point2D.Double(50,50), new Point2D.Double(250,350));
        g2.draw(line2);
    }
}
