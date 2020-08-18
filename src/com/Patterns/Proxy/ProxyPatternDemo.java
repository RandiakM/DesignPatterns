package com.Patterns.Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("flower.jpg");
        image1.display();

        image1.display();
    }
}
