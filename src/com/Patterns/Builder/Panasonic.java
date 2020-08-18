package com.Patterns.Builder;

public class Panasonic extends Company{
    @Override
    public int price() {
        return 15;
    }

    @Override
    public String pack() {
        return "Panasonic CD";
    }
}
