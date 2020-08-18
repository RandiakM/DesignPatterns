package com.withsingleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHandler {


    private static FileHandler instance = new FileHandler();

    //make the constructor private so that this class cannot be
    //instantiated
    private FileHandler(){}

    //Get the only object available
    public static FileHandler getInstance(){
        return instance;
    }
    //read file
    public void viewFile(){
        try {
            System.out.println("-----------Student Results-----------");
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    //addFile

    public void addFile(String text){
        try {
            FileWriter myWriter = new FileWriter("details.txt");
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully added data to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }


    public void editFile(String text){
        try {
            String filename= "details.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write("\n"+text);//appends the string to the file
            fw.close();
            System.out.println("New result added.");
        } catch (Exception e) {

        }
    }


    //delete file
    public void deleteFile(){

        try {
            FileWriter myWriter = new FileWriter("details.txt");
            myWriter.write("");
            myWriter.close();
            System.out.println("Text Cleared");
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }


    }

    void addFile() {
        throw new UnsupportedOperationException("Error.");
    }

    void editFile() {
        throw new UnsupportedOperationException("Error.");
    }


}
