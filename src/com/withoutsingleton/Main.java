package com.withoutsingleton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String text;
        Scanner input = new Scanner(System.in);

        System.out.println("Select an Option: ");
        System.out.println("1) Write File \n2) View File\n3) Add new result\n4) Delete File");

        Main object = new Main();

        int Operation = Integer.parseInt(input.nextLine());

        switch (Operation) {
            case 1:
                System.out.println("Enter Results");
                text = input.nextLine();
                object.addFile(text);
                break;
            case 2:
                //read
                object.viewFile();
                break;
            case 3:
                System.out.println("Add Results");
                text = input.nextLine();
                object.editFile(text);
                break;
            case 4:
                object.deleteFile();
                break;
            default:
                System.out.println("Invalid entry");
        }

    }

    private void deleteFile() {
    }

    private void editFile(String text) {
    }

    void viewFile() {
    }

    private void addFile(String text) {
    }
}

