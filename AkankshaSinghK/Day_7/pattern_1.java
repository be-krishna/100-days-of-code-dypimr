package com.company;

import java.util.Scanner;

public class pattern_1
{
    public static void main(String[] args)
    {
        System.out.println(" enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();


        for(int i=1; i<=rows; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }

}
