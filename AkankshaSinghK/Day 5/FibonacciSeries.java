package com.company;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner( System.in);

        int number;

        int FirstTerm = 0,
            SecondTerm = 1,
                ThirdTerm;

        System.out.println("Enter the number of terms of series :");
        number = sc.nextInt();

        System.out.println(FirstTerm + " " + SecondTerm + " ");

        for( int i=3; i<= number; i++)
        {
            ThirdTerm = FirstTerm + SecondTerm;
            System.out.println(ThirdTerm + " ");
            FirstTerm = SecondTerm;
            SecondTerm = ThirdTerm;
        }
    }
}
