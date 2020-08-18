package com.Patterns.Builder;

public class Sony extends Company{
    @Override
    public int price() {
        return 30;
    }

    @Override
    public String pack() {
        return "Sony CD";
    }
}
