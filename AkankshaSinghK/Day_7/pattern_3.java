package com.company;

import java.util.Scanner;

public class pattern_3 {

    public static void main(String[] args)
    {
        System.out.println(" enter the no. of rows :");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int p=1;
        for( int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }
}
