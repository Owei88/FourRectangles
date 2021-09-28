package org.Hillcrest.chapter2;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Locale;

public class RectangleTester {

    public static void main(String[] args) {
        Rectangle rectangle  = new Rectangle();
        rectangle.translate(5,5);
        System.out.println("X: " + rectangle.getX());
        System.out.println("Expected: 5");
        System.out.println("Y: " + rectangle.getY());
        System.out.println("Expected: 5");

        OldCode();

    }

    private static void OldCode() {
        int number = 3;
        short number2 =2;
        long number3 = 4;

        int a = 10;
        int neighborsFavoriteNumber = 10;


        String name = "Owei";

        System.out.println(name.toUpperCase(Locale.ROOT));

        double number4 = 2.2;
        float number5 = 2.3f;

        char letter ='a';
        byte theByte = 1;
        boolean theFlag = true;

        Rectangle2D rectangle;
        // variable assignment constructor
        //          operator
        rectangle    =         new Rectangle2D.Double();
        Rectangle2D rectangle2 = new Rectangle2D.Double( 3, 3, 3, 3);
        Rectangle2D rectangle3 = rectangle2;

        System.out.println(rectangle2);
        System.out.println(rectangle3);

        rectangle2.setRect(4, 4, 4, 4);

        System.out.println(rectangle2);
        System.out.println(rectangle3);
    }
}

