package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int p,r,t,SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle : ");
        p= sc.nextInt();

        System.out.println("Enter the rate : ");
        r= sc.nextInt();

        System.out.println("Enter the time : ");
        t= sc.nextInt();

        SI=(p*t*r)/100;

       System.out.println("the Simple interest is : "+SI);
    }
}
