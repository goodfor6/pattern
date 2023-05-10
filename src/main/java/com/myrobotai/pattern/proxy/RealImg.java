package com.myrobotai.pattern.proxy;

public class RealImg implements Img{

    String fileName;

    public RealImg(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }

    @Override
    public void display() {
        System.out.println( " img display "+fileName);
    }

    public void loadFile(String fileName){
        System.out.println(" load file :"+fileName);
    }
}
