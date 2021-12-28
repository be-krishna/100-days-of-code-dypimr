package com.company;

import java.util.Scanner;

public class Main {


        public static void main(String[] args)
        {
            System.out.println("Enter the number :");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num % 3 == 0 && num %  5 ==0)
                System.out.println("FizzBuzz");
            else if(num % 3 == 0)
                System.out.println("Fizz");
            else if( num % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println("num");
        }
    }
