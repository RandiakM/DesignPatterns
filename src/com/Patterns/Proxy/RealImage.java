package com.Patterns.Proxy;

public class RealImage implements Image{

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromURL(filename);
    }


    @Override
    public void display() {
        System.out.println("Displaying "+ filename);
    }

    private void loadFromURL(String filename){
        System.out.println("Loading from External Server " + filename);
    }
}
