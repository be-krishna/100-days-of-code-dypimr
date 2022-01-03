package com.company;

import java.util.Scanner;

public class check_number {

    public static void main(String[] args)
    {
        System.out.println(" Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>0) {
            System.out.println("Number is positive");
        }
        else if(num<0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
