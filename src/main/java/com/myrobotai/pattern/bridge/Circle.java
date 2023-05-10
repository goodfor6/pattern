package com.myrobotai.pattern.bridge;

public class Circle extends Shape {

    int x ;
    int y;
    int radius;

    public Circle(int x,int y,int radius,DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y  =y;
        this.radius =radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(x,y,radius);
    }
}
