package com.Patterns.Singleton;

public class SingleObject {

    //make the constructor private
    private SingleObject(){

    }

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //get the only object available
    public static SingleObject getInstance(){

        return instance;
    }

    public void showMessage(){

        System.out.println("Hello world");
    }
}
