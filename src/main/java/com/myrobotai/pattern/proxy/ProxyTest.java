package com.myrobotai.pattern.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Img img = new ProxyImg("3.png");
        img.display();
        img.display();
    }
}
