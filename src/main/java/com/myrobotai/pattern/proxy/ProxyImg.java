package com.myrobotai.pattern.proxy;

public class ProxyImg implements Img{

    RealImg realImg;

    String fileName;


    public ProxyImg(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImg == null){
            realImg = new RealImg(fileName);
        }

        realImg.display();
    }
}
