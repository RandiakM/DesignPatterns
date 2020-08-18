package com.withoutsingleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

    public void viewFile(){
        try {
            System.out.println("---- Results of the Students ----");
            File myObj = new File("details.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //addFile

    public void addFile(String text){
        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //editfile --- add new results

    public void editFile(String text){
        try {
            String filename= "file.txt";
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
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write("");
            myWriter.close();
            System.out.println("Text Cleared");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
