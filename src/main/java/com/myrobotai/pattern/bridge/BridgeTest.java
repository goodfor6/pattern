package com.myrobotai.pattern.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(1,1,3,new RedCircle());
        circle.draw();
    }
}
