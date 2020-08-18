package com.Patterns.Builder;

public class CDBuilder {

    public CDType buildSonyCD(){
        CDType cds = new CDType();
        cds.addItem(new Sony());
        return cds;
    }
    public CDType buildPanasonicCD(){
        CDType cds = new CDType();
        cds.addItem(new Panasonic());
        return cds;
    }
}
