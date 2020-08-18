package com.Patterns.Observer;

public class Chart implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Chart got Updated: "+value);
    }
}
