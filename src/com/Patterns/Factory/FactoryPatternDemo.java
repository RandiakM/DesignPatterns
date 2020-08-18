package com.Patterns.Factory;

import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Your Price Range: ");
//        String priceRange= input.nextLine();

        PhoneFactory phoneFactory = new PhoneFactory();

//        Phone myPhone = phoneFactory.getPhone(priceRange);
        Phone myPhone = phoneFactory.getPhone("Low Price");
        myPhone.showSpecification();
    }
}
