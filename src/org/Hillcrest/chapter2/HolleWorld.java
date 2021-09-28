package org.Hillcrest.chapter2;

public class HolleWorld {
    public static void main(String[] args){
        String replaced = "Hello, world".replace("o", "e");
        replaced = replaced.replaceFirst("e","o");
        System.out.println(replaced);

    }
}

