package com.myrobotai.pattern.decorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void setRedColor(){
        System.out.println(" set color red ");
    }

    @Override
    public void draw() {
        setRedColor();
        super.draw();
    }
}
