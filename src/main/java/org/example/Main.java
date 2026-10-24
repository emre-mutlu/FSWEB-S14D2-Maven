package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bedroom br1 = new Bedroom("mybedroom",
                new Wall("left"), new Wall("right"), new Wall("up"),new Wall("down"),
                new Ceiling(3, PaintColor.RED),
                new Bed("plain", 4,4,4,4),
                new Lamp(LampType.NORMAL,true,5),
                new Wardrobe(4,4,4),
                new Carpet(4,4,PaintColor.RED));
    }
}