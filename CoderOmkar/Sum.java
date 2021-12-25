package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the num 1: ");
        a = scan.nextInt();

        System.out.println("Enter the num 2: ");
        b = scan.nextInt();


        System.out.println("the sum is "+(a+b));

    }
}
