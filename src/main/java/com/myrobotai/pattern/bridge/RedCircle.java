package com.myrobotai.pattern.bridge;

public class RedCircle implements DrawApi{

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println( " red  circle  x: "+x+" y: "+y+" radius: "+radius);
    }
}
