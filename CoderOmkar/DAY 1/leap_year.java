package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = scan.nextInt();

        if(year%4==0){
            System.out.println("this is a Leap year!");
        }
        else {
            System.out.println("this is not Leap year!");
        }

    }
}
