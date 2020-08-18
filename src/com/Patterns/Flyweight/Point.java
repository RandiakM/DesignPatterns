package com.Patterns.Flyweight;

public class Point {

    private int x;
    private int y;
    private PointType icon;

    public Point(int x, int y, PointType icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw(){
        System.out.printf("%s at (%d, %d)", icon.getType(), x,y);
    }
}
