package com.withsingleton;

public class Student {

    private static Student instance = new Student();

    private Student(){

    }

    public static Student getInstance(){
        return instance;
    }
    public void viewFile () {
        FileHandler textfile= FileHandler.getInstance();
        textfile.viewFile();
    }


}