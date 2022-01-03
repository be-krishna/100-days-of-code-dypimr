package com.company;

import java.util.Scanner;

public class hollow_square {

    public static void main(String[] args)
    {
        System.out.println(" Enter the no. of rows :");
        Scanner sc  = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++)
        {
            for( int j=1; j<=rows; j++)
            {
                if(i==1 || j==1 || i== rows || j==rows)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
