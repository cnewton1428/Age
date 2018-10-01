package com.company;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any age");

        int age = input.nextInt();

        if (age>=0 && age<= 5) {
            System.out.println("Baby");
        } else if (age >= 6 && age <= 10) {
            System.out.println("Kid");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <=150) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid");
        }
    }
}