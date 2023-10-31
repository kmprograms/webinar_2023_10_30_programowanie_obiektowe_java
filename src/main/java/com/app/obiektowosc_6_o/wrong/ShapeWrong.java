package com.app.obiektowosc_6_o.wrong;

public class ShapeWrong {
    private final String type;

    public ShapeWrong(String type) {
        this.type = type;
    }

    public void draw() {
        switch (type) {
            case "Circle" -> System.out.println("Draw the circle");
            case "Triangle" -> System.out.println("Draw the triangle");
            default -> System.out.println("Shape not found");
        }
    }
}
