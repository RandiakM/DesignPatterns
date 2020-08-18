package com.Patterns.Adapter;

import com.Patterns.Adapter.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        //imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
