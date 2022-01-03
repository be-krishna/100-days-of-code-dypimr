package com.company;

import java.util.Scanner;

public class Equilateral_triangle_Pattern {

    public static void main(String[] args)
    {
        System.out.println(" enter the no. of rows : ");
        Scanner sc =new Scanner(System.in);
        int rows = sc.nextInt();

         for( int i=1; i<=rows; i++)
         {
             for(int j=i; j<=rows; j++)
             {
                 System.out.print(" ");
             }
             for( int j=1; j<=i; j++)
             {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
