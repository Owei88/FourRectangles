package org.Hillcrest.chapter2;

import java.awt.*;

public class FourRectangles {
    public static void main (String[] args){

        int xwidth = 140;
        int yheight = 120;


        Rectangle box = new Rectangle(10,10,xwidth,yheight);


        box.translate (xwidth,yheight);


        box.translate (0,-yheight);


        box.translate (-xwidth,yheight);



        System.out.println("The first rectangle's location is: "+ " 0,0");
        System.out.println("The second rectangle's location is: "+ xwidth +",0");
        System.out.println("The third rectangle's location is: "+ "0, "+ yheight);
        System.out.println("The fourth rectangle's location is: "+ xwidth + ","+ yheight);








    }
}
