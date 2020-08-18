package com.Patterns.Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType1=cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2=cdBuilder.buildPanasonicCD();
        cdType2.showItems();
    }
}
