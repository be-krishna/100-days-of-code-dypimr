package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the num : ");
        a = scan.nextInt();

        for (i=1;i<=10;i++){
            System.out.println(a*i);
        }

    }
}
