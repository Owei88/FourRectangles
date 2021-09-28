package org.Hillcrest.chapter2;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.cyan);
        Rectangle rectangle = new Rectangle(25, 25, 150, 150);
        g2.setColor(Color.black);
        g2.draw(rectangle);
        rectangle.translate(10,10);



    }


}
