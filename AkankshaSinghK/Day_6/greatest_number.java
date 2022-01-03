package com.company;

import java.util.Scanner;

public class greatest_number {

    public static void main(String[] args)
    {
        System.out.println(" enter the three numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println( " GREATEST : " +a);
        }
        else if(b>c && b>a)
        {
            System.out.println(  "GREATEST : "+b);
        }
        else
            System.out.println("GREATEST : "+c);
    }
}
