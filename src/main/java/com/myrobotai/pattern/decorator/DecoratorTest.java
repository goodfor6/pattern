package com.myrobotai.pattern.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
//        Shape circle = new Circle();
//        circle.draw();

        Shape shape  = new RedShapeDecorator(new Circle());
        shape.draw();
    }
}
