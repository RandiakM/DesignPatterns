package com.withsingleton;

import java.util.Scanner;

public class Text {

    public static void main(String[] args) {

        String text;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a teacher or student?");
        System.out.println("1) Student \n2) Teacher");
        int Operation1 = Integer.parseInt(scanner.nextLine());

        Student Obj1 = Student.getInstance();
        Teacher Obj2 = Teacher.getInstance();


        switch (Operation1){
            case 2:

                System.out.println("Select an Option: ");
                System.out.println("1) Write File \n2) View File\n3) Add new result\n4) Delete File");



                int Operation = Integer.parseInt(scanner.nextLine());

                switch (Operation) {
                    case 1:

                        System.out.println("Enter Results");
                        text = scanner.nextLine();
                        Obj2.addFile(text);
                        break;
                    case 2:
                        //read
                        Obj2.viewFile();
                        break;
                    case 3:

                        System.out.println("Add Results");
                        text = scanner.nextLine();
                        Obj2.editFile(text);
                        break;
                    case 4:
                        Obj2.deleteFile();
                        break;
                    default:
                        System.out.println("Invalid entry");
                }

                break;
            case 1:
                Obj1.viewFile();

        }



    }
}
