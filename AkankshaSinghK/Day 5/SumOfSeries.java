package com.company;

import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;

        double sum = 0;

        System.out.println(" Enter the terms of series :");
        number = sc.nextInt();

        for( int i=1; i<= number; i++)
        {
            sum += 1.0/i;
        }

        System.out.println(" Sum of the series is :" +sum);

    }
}
