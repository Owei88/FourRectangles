package org.Hillcrest.chapter2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(150,10,200,600);
        g.setColor(Color.BLACK);
        g2.fill(box);

        Ellipse2D light1 = new Ellipse2D.Double(160,20,180,180);
        g.setColor(Color.red);
        g2.fill(light1);

        Ellipse2D light2 = new Ellipse2D.Double(160,220,180,180);
        g.setColor(Color.yellow);
        g2.fill(light2);

        Ellipse2D light3 = new Ellipse2D.Double(160,420,180,180);
        g.setColor(Color.green);
        g2.fill(light3);



    }


}
