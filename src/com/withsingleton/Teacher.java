package com.withsingleton;

public class Teacher {


    private static Teacher instance = new Teacher();

    private Teacher(){

    }

    public static Teacher getInstance(){
        return instance;
    }


    public void viewFile () {
        FileHandler textfile=FileHandler.getInstance();
        textfile.viewFile();
    }

    public void editFile (String text) {
        FileHandler textfile=FileHandler.getInstance();
        textfile.editFile(text);
    }

    public void addFile (String text) {
        FileHandler textfile=FileHandler.getInstance();
        textfile.addFile(text);
    }

    public void deleteFile () {
        FileHandler textfile=FileHandler.getInstance();
        textfile.deleteFile();
    }



}