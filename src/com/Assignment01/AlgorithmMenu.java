package com.Assignment01;

import java.util.Scanner;

public class AlgorithmMenu {

    public static void algorithmMenuChoose(){
        Scanner input = new Scanner(System.in);
        System.out.print("----------------Sorting Algorithm Chooser----------------\n");
        System.out.print("================Menu================\n");
        System.out.print(" 1. Bubble Sort\n 2. Selection Sort\n 3. Insertion Sort\n");
        System.out.print("====================================\n");
        System.out.print("Choose a Algorithm: ");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.BubbleSortExample();
                break;
        }
    }


}
